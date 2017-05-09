package com.papermaker.action;

import com.opensymphony.xwork2.ActionSupport;
import com.papermaker.pojo.Log;
import com.papermaker.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 世康 on 2016/12/30.
 */
public class LogAction extends ActionSupport {

    private static final long serialVersionUID = 1L;

    @Autowired
    private LogService logService;

    private List<Log> list;

    private String id;
    private int no;
    private String user;
    private int type;
    private String typename;
    private String info;
    private Date date;

    private Map<String,String> errorsMap  =  new HashMap<String,String>();

    public List<Log> getList() {
        return list;
    }

    public void setList(List<Log> list) {
        this.list = list;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Map<String, String> getErrorsMap() {
        return errorsMap;
    }

    public void setErrorsMap(Map<String, String> errorsMap) {
        this.errorsMap = errorsMap;
    }


}
