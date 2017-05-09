package com.papermaker.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.papermaker.pojo.Log;
import com.papermaker.pojo.User;
import com.papermaker.service.LogService;
import com.papermaker.service.UserService;
import com.papermaker.util.Util;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 世康 on 2016/11/24.
 */
public class UserAction extends ActionSupport {
    private static final long serialVersionUID = 1L;

    @Autowired
    private UserService userService;

    @Autowired
    private LogService logService;

    private int id;
    private String username;
    private String password;
    private String realname;
    private String tel;
    private String email;
    private int type;
    private int state;

    private String typename;
    private String statename;

    private List<User> userlist;

    private int currentPage = 1;
    private int totalPage;
    private int totalSize;
    private int pageSize;

    private Map<String,String> errorsMap = new HashMap<String,String>();

    public Map<String, String> getErrorsMap() {
        return errorsMap;
    }

    public void setErrorsMap(Map<String, String> errorsMap) {
        this.errorsMap = errorsMap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getStatename() {
        return statename;
    }

    public void setStatename(String statename) {
        this.statename = statename;
    }


    public List<User> getUserlist() {
        return userlist;
    }

    public void setUserlist(List<User> userlist) {
        this.userlist = userlist;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }


    public String login(){
        ActionContext cxt = ActionContext.getContext();
        HttpServletRequest request = (HttpServletRequest)cxt.get(ServletActionContext.HTTP_REQUEST);
        if (type == 1){//后台
            String rand = (String)request.getSession().getAttribute("rand");
            String code = request.getParameter("confirm");
            if ((rand == null)||(code == null)||(!rand.equals(code))){
                errorsMap.put(Util.MSG_LOGIN,"验证码错误！");
                return Action.ERROR;
            }
            if ((username == null) || (username.isEmpty())){
                errorsMap.put(Util.MSG_LOGIN,"用户名无效！");
                return Action.ERROR;
            }
            if ((password == null) || (password.isEmpty())||(password.length() < 4)){
                errorsMap.put(Util.MSG_LOGIN,"密码无效！");
                return Action.ERROR;
            }
            User user = userService.login(username,password,1);
            if (user == null){
                errorsMap.put(Util.MSG_LOGIN,"用户名或者密码错误！");
                return Action.ERROR;
            }
            request.getSession().setAttribute(Util.SESSION_USER, user);
            logService.addLog(username, Log.TYPE_SYSTEM, "登录系统后台");
            return Action.SUCCESS;
        }else{//前台
            if ((username == null) || (username.isEmpty())){
                errorsMap.put(Util.MSG_LOGIN,"用户名无效！");
                return Action.INPUT;
            }
            if ((password == null) || (password.isEmpty())||(password.length() < 4)){
                errorsMap.put(Util.MSG_LOGIN,"密码无效！");
                return Action.INPUT;
            }
            User user = userService.login(username,password,0);
            if (user == null){
                errorsMap.put(Util.MSG_LOGIN,"用户名或者密码错误！");
                return Action.INPUT;
            }
            request.getSession().setAttribute(Util.SESSION_USER,user);
            logService.addLog(username,Log.TYPE_SYSTEM,"登录系统前台");
//        System.out.println("session_user="+Util.SESSION_USER);
            return Action.LOGIN;
        }
    }

    public String queryById(){
        User user = userService.getUserById(id);
        if (user == null){
            errorsMap.put(Util.MSG_ERRORINFO,"");
            return Action.ERROR;
        }
        username = user.getUsername();
        password = user.getPassword();
        realname = user.getRealname();
        if (realname == null) {
            realname = "-";
        }
        tel = user.getTel();
        if (tel == null) {
            tel = "-";
        }
        email = user.getEmail();
        if (email == null){
            email = "-";
        }
        type = user.getType();
        if (type == User.TYPE_ADMIN){
            typename = "管理员";
        }else {
            typename = "普通用户";
        }
        state = user.getState();
        if (state == User.STATE_ENABLE){
            statename = "启用";
        }else {
            statename = "禁用";
        }
        return Action.SUCCESS;
    }

    public String queryAll(){
//        ActionContext context = ActionContext.getContext();
        totalSize = 0;
        pageSize = Util.PAGE_SIZE;
        userlist = userService.getUser(currentPage,pageSize);
//        context.put("userlist",userlist);
//        System.out.println(userlist);
        totalSize = userService.getUserCount();
        if (totalSize % pageSize == 0){
            totalPage = totalSize/pageSize;
        }else {
            totalPage = (totalSize/pageSize) + 1;
        }
        return Action.SUCCESS;
    }


}
