package com.papermaker.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by 世康 on 2016/12/30.
 */
@Entity
public class Log {

    public static final int TYPE_SYSTEM = 0;//系统类
    public static final int TYPE_NEW = 1;//新建类
    public static final int TYPE_EDIT = 2;//编辑类
    public static final int TYPE_DELETE = 3;//删除类

    private String id;
    private int no;
    private String user;
    private int type;
    private String info;
    private Date date;

    @Id
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NO")
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    @Basic
    @Column(name = "USER")
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Basic
    @Column(name = "TYPE")
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Basic
    @Column(name = "INFO")
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Basic
    @Column(name = "DATE")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Log log = (Log) o;

        if (no != log.no) return false;
        if (type != log.type) return false;
        if (id != null ? !id.equals(log.id) : log.id != null) return false;
        if (user != null ? !user.equals(log.user) : log.user != null) return false;
        if (info != null ? !info.equals(log.info) : log.info != null) return false;
        if (date != null ? !date.equals(log.date) : log.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + no;
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + type;
        result = 31 * result + (info != null ? info.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }
}
