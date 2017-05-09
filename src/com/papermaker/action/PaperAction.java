package com.papermaker.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.papermaker.pojo.*;
import com.papermaker.service.LogService;
import com.papermaker.service.PaperService;
import com.papermaker.util.ImgUtil;
import com.papermaker.util.Util;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 世康 on 2016/12/17.
 */
public class PaperAction  extends ActionSupport {
    private static final long serialVersionUID = 1L;
//
    @Autowired
    private PaperService paperService;

    @Autowired
    private LogService logService;
//
//    @Autowired
//    private UserService userService;

    private int select1;
    private int score;
    private int weight;
    private String select2;
    private String select3;
    private String select4;
    private String content;
    private String answer;

    private int requestuser;
    private String username;

    private int currentPage = 1;
    private int totalPage;
    private int totalSize;
    private int pageSize;

    private List<Choice> choiceList;
    private List<Completion> completionList;
    private List<Judgment> judgmentList;
    private List<Draw> drawList;
    private List<Comprehension> comprehensionList;
    private List<Algorithm> algorithmList;

    private Map<String,String> errorsMap = new HashMap<String,String>();

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getSelect1() {
        return select1;
    }

    public void setSelect1(int select1) {
        this.select1 = select1;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSelect2() {
        return select2;
    }

    public void setSelect2(String select2) {
        this.select2 = select2;
    }

    public String getSelect3() {
        return select3;
    }

    public void setSelect3(String select3) {
        this.select3 = select3;
    }

    public String getSelect4() {
        return select4;
    }

    public void setSelect4(String select4) {
        this.select4 = select4;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public List<Choice> getChoiceList() {
        return choiceList;
    }

    public void setChoiceList(List<Choice> choiceList) {
        this.choiceList = choiceList;
    }

    public List<Completion> getCompletionList() {
        return completionList;
    }

    public void setCompletionList(List<Completion> completionList) {
        this.completionList = completionList;
    }

    public List<Judgment> getJudgmentList() {
        return judgmentList;
    }

    public void setJudgmentList(List<Judgment> judgmentList) {
        this.judgmentList = judgmentList;
    }

    public List<Draw> getDrawList() {
        return drawList;
    }

    public void setDrawList(List<Draw> drawList) {
        this.drawList = drawList;
    }

    public List<Comprehension> getComprehensionList() {
        return comprehensionList;
    }

    public void setComprehensionList(List<Comprehension> comprehensionList) {
        this.comprehensionList = comprehensionList;
    }

    public List<Algorithm> getAlgorithmList() {
        return algorithmList;
    }

    public void setAlgorithmList(List<Algorithm> algorithmList) {
        this.algorithmList = algorithmList;
    }

    public String add() throws Exception {
        ActionContext cxt = ActionContext.getContext();
        HttpServletRequest request = (HttpServletRequest)cxt.get(ServletActionContext.HTTP_REQUEST);
        Object obj = request.getSession().getAttribute(Util.SESSION_USER);
        if((obj == null)||!(obj instanceof User)){
            errorsMap.put(Util.MSG_ERRORINFO,"请先登录平台！");
            return Action.ERROR;
        }
        requestuser = ((User)obj).getId();
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        String path1 = null;
        String path2 = null;
        list1 = ImgUtil.getImageSrc(content);
        list2 = ImgUtil.getImageSrc(answer);
        byte[] imgIn1 = null;
        byte[] imgIn2 = null;
        if((list1!=null) && (list1.size()>0)) {
            path1 = list1.get(0);
            path1 = path1.replaceFirst("file:///", "");
//            path1 = path1.replaceFirst("image002.gif","image001.emz");
            imgIn1 = ImgUtil.toByteArray(new File(path1));
        }
        if((list2!=null) && (list2.size()>0)) {
            path2 = list2.get(0);
            path2 = path2.replaceFirst("file:///", "");
            imgIn2 = ImgUtil.toByteArray(new File(path2));

        }
        if(paperService.add(select1,score,weight,select2,select3,select4,content,imgIn1,answer,imgIn2,requestuser)>0) {
//            System.out.println("content1="+content);
            username = ((User)obj).getUsername();
            logService.addLog(username, Log.TYPE_NEW,"前台试题录入");
            return Action.SUCCESS;
        }
        return Action.ERROR;
    }

    public String choiceQueryAll(){
        totalSize = 0;
        pageSize = Util.PAGE_SIZE;
        choiceList = paperService.getChoice(currentPage,pageSize);
        totalSize = paperService.getChoiceCount();
        if (totalSize % pageSize == 0){
            totalPage = totalSize/pageSize;
        }else {
            totalPage = (totalSize/pageSize) + 1;
        }
        return Action.SUCCESS;
    }

    public String completionQueryAll(){
        totalSize = 0;
        pageSize = Util.PAGE_SIZE;
        completionList = paperService.getCompletion(currentPage,pageSize);
        totalSize = paperService.getCompletionCount();
        if (totalSize % pageSize == 0){
            totalPage = totalSize/pageSize;
        }else {
            totalPage = (totalSize/pageSize) + 1;
        }
        return Action.SUCCESS;
    }

    public String judgmentQueryAll(){
        totalSize = 0;
        pageSize = Util.PAGE_SIZE;
        judgmentList = paperService.getJudgment(currentPage,pageSize);
        totalSize = paperService.getJudgmentCount();
        if (totalSize % pageSize == 0){
            totalPage = totalSize/pageSize;
        }else {
            totalPage = (totalSize/pageSize) + 1;
        }
        return Action.SUCCESS;
    }

    public String drawQueryAll(){
        totalSize = 0;
        pageSize = Util.PAGE_SIZE;
        drawList = paperService.getDraw(currentPage,pageSize);
        totalSize = paperService.getDrawCount();
        if (totalSize % pageSize == 0){
            totalPage = totalSize/pageSize;
        }else {
            totalPage = (totalSize/pageSize) + 1;
        }
        return Action.SUCCESS;
    }

    public String comprehensionQueryAll(){
        totalSize = 0;
        pageSize = Util.PAGE_SIZE;
        comprehensionList = paperService.getComprehension(currentPage,pageSize);
        totalSize = paperService.getComprehensionCount();
        if (totalSize % pageSize == 0){
            totalPage = totalSize/pageSize;
        }else {
            totalPage = (totalSize/pageSize) + 1;
        }
        return Action.SUCCESS;
    }

    public String algorithmQueryALL(){
        totalSize = 0;
        pageSize = Util.PAGE_SIZE;
        algorithmList = paperService.getAlgorithm(currentPage,pageSize);
        totalSize = paperService.getAlgorithmCount();
        if (totalSize % pageSize == 0){
            totalPage = totalSize/pageSize;
        }else {
            totalPage = (totalSize/pageSize) + 1;
        }
        return Action.SUCCESS;
    }
}
