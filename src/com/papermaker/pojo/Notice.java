package com.papermaker.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by 世康 on 2016/12/30.
 */
@Entity
public class Notice {
    private String id;
    private int no;
    private String name;
    private String info;
    private int userid;
    private Date date;
    private int state;

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
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "USERID")
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "DATE")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "STATE")
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Notice notice = (Notice) o;

        if (no != notice.no) return false;
        if (userid != notice.userid) return false;
        if (state != notice.state) return false;
        if (id != null ? !id.equals(notice.id) : notice.id != null) return false;
        if (name != null ? !name.equals(notice.name) : notice.name != null) return false;
        if (info != null ? !info.equals(notice.info) : notice.info != null) return false;
        if (date != null ? !date.equals(notice.date) : notice.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + no;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (info != null ? info.hashCode() : 0);
        result = 31 * result + userid;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + state;
        return result;
    }
}
