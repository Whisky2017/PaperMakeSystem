package com.papermaker.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.papermaker.pojo.Log;
import com.papermaker.pojo.User;
import com.papermaker.service.LogService;
import com.papermaker.service.ParameterService;
import com.papermaker.service.UserService;
import com.papermaker.util.Util;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 世康 on 2016/11/25.
 */
public class ParameterAction extends ActionSupport {

    private static final long serialVersionUID = 1L;

    @Autowired
    private ParameterService parameterService;

    @Autowired
    private UserService userService;

    @Autowired
    private LogService logService;

    private int chnum1;
    private int chnum21;
    private int chnum2;
    private int chnum22;
    private int conum1;
    private int conum2;
    private int junum1;
    private int junum2;
    private int drnum1;
    private int drnum2;
    private int comnum1;
    private int comnum2;
    private int algnum1;
    private int algnum21;
    private int algnum2;
    private int algnum22;
    private int algnum3;
    private int algnum23;

    private String draw_p1;
    private String draw_p2;
    private String draw_p3;
    private String com_p1;
    private String com_p2;
    private String com_p3;
    private String alg_p1;
    private String alg_p2;
    private String alg_p3;

    private String pointliststr;

    private int requestuser;
    private String username;

    private Map<String,String> errorsMap = new HashMap<String,String>();

    public int getChnum1() {
        return chnum1;
    }

    public void setChnum1(int chnum1) {
        this.chnum1 = chnum1;
    }

    public int getChnum21() {
        return chnum21;
    }

    public void setChnum21(int chnum21) {
        this.chnum21 = chnum21;
    }

    public int getChnum2() {
        return chnum2;
    }

    public void setChnum2(int chnum2) {
        this.chnum2 = chnum2;
    }

    public int getChnum22() {
        return chnum22;
    }

    public void setChnum22(int chnum22) {
        this.chnum22 = chnum22;
    }

    public int getConum1() {
        return conum1;
    }

    public void setConum1(int conum1) {
        this.conum1 = conum1;
    }

    public int getConum2() {
        return conum2;
    }

    public void setConum2(int conum2) {
        this.conum2 = conum2;
    }

    public int getJunum1() {
        return junum1;
    }

    public void setJunum1(int junum1) {
        this.junum1 = junum1;
    }

    public int getJunum2() {
        return junum2;
    }

    public void setJunum2(int junum2) {
        this.junum2 = junum2;
    }

    public int getDrnum1() {
        return drnum1;
    }

    public void setDrnum1(int drnum1) {
        this.drnum1 = drnum1;
    }

    public int getDrnum2() {
        return drnum2;
    }

    public void setDrnum2(int drnum2) {
        this.drnum2 = drnum2;
    }

    public int getComnum1() {
        return comnum1;
    }

    public void setComnum1(int comnum1) {
        this.comnum1 = comnum1;
    }

    public int getComnum2() {
        return comnum2;
    }

    public void setComnum2(int comnum2) {
        this.comnum2 = comnum2;
    }

    public int getAlgnum1() {
        return algnum1;
    }

    public void setAlgnum1(int algnum1) {
        this.algnum1 = algnum1;
    }

    public int getAlgnum21() {
        return algnum21;
    }

    public void setAlgnum21(int algnum21) {
        this.algnum21 = algnum21;
    }

    public int getAlgnum2() {
        return algnum2;
    }

    public void setAlgnum2(int algnum2) {
        this.algnum2 = algnum2;
    }

    public int getAlgnum22() {
        return algnum22;
    }

    public void setAlgnum22(int algnum22) {
        this.algnum22 = algnum22;
    }

    public int getAlgnum3() {
        return algnum3;
    }

    public void setAlgnum3(int algnum3) {
        this.algnum3 = algnum3;
    }

    public int getAlgnum23() {
        return algnum23;
    }

    public void setAlgnum23(int algnum23) {
        this.algnum23 = algnum23;
    }

    public String getDraw_p1() {
        return draw_p1;
    }

    public void setDraw_p1(String draw_p1) {
        this.draw_p1 = draw_p1;
    }

    public String getDraw_p2() {
        return draw_p2;
    }

    public void setDraw_p2(String draw_p2) {
        this.draw_p2 = draw_p2;
    }

    public String getDraw_p3() {
        return draw_p3;
    }

    public void setDraw_p3(String draw_p3) {
        this.draw_p3 = draw_p3;
    }

    public String getCom_p1() {
        return com_p1;
    }

    public void setCom_p1(String com_p1) {
        this.com_p1 = com_p1;
    }

    public String getCom_p2() {
        return com_p2;
    }

    public void setCom_p2(String com_p2) {
        this.com_p2 = com_p2;
    }

    public String getCom_p3() {
        return com_p3;
    }

    public void setCom_p3(String com_p3) {
        this.com_p3 = com_p3;
    }

    public String getAlg_p1() {
        return alg_p1;
    }

    public void setAlg_p1(String alg_p1) {
        this.alg_p1 = alg_p1;
    }

    public String getAlg_p2() {
        return alg_p2;
    }

    public void setAlg_p2(String alg_p2) {
        this.alg_p2 = alg_p2;
    }

    public String getAlg_p3() {
        return alg_p3;
    }

    public void setAlg_p3(String alg_p3) {
        this.alg_p3 = alg_p3;
    }

    public String getPointliststr() {
        return pointliststr;
    }

    public void setPointliststr(String pointliststr) {
        this.pointliststr = pointliststr;
    }

    public Map<String, String> getErrorsMap() {
        return errorsMap;
    }

    public void setErrorsMap(Map<String, String> errorsMap) {
        this.errorsMap = errorsMap;
    }

    public int getRequestuser() {
        return requestuser;
    }

    public void setRequestuser(int requestuser) {
        this.requestuser = requestuser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String add(){
        ActionContext cxt = ActionContext.getContext();
        HttpServletRequest request = (HttpServletRequest)cxt.get(ServletActionContext.HTTP_REQUEST);
//        request.getSession().setAttribute(Util.SESSION_OPTTYPE, Util.OPTTYPE_ORDER_ADD);	//设置操作类型
        Object obj = request.getSession().getAttribute(Util.SESSION_USER);
        if ((obj == null)||!(obj instanceof User)) {
            errorsMap.put(Util.MSG_ERRORINFO,"请先登录平台！");
            return Action.ERROR;
        }
        requestuser = ((User)obj).getId();
        if (parameterService.add(chnum1,chnum2,conum1,junum1,drnum1,comnum1,algnum1,algnum2,algnum3,pointliststr,
                draw_p1,draw_p2,draw_p3,com_p1,com_p2,com_p3,alg_p1,alg_p2,alg_p3) == 1){
////            System.out.println("chnum1="+chnum1);
//        System.out.println("pointlist="+pointliststr);
            username = ((User)obj).getUsername();
            logService.addLog(username, Log.TYPE_NEW,"前台配置信息录入");
            return Action.SUCCESS;
        }
        return Action.ERROR;
    }

    public String analysis(){
        //分析数据，生成试卷
        return Action.ERROR;
    }
}
