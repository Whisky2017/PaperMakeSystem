package com.papermaker.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by 世康 on 2016/12/30.
 */
@Entity
public class User {
    public static final int STATE_DISABLE = 0;	//禁用
    public static final int STATE_ENABLE = 1;	//启用

    public static final int TYPE_ADMIN = 1;  //管理员用户，登录后台
    public static final int TYPE_USER = 0; //普通用户，登录前台

    public static final String FIELD_ID = "ID";
    public static final String FIELD_USERNAME = "用户名";
    public static final String FIELD_REALNAME = "姓名";
    public static final String FIELD_TEL = "电话";
    public static final String FIELD_EMAIL = "邮箱";
    public static final String FIELD_TYPE = "类型";
    public static final String FIELD_STATE = "状态";


    private int id;
    private String username;
    private String password;
    private String realname;
    private String tel;
    private String email;
    private int type;
    private int state;
    private Integer courseid;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "USERNAME")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "PASSWORD")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "REALNAME")
    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    @Basic
    @Column(name = "TEL")
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Basic
    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
    @Column(name = "STATE")
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Basic
    @Column(name = "COURSEID")
    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (type != user.type) return false;
        if (state != user.state) return false;
        if (username != null ? !username.equals(user.username) : user.username != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (realname != null ? !realname.equals(user.realname) : user.realname != null) return false;
        if (tel != null ? !tel.equals(user.tel) : user.tel != null) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        if (courseid != null ? !courseid.equals(user.courseid) : user.courseid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (realname != null ? realname.hashCode() : 0);
        result = 31 * result + (tel != null ? tel.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + type;
        result = 31 * result + state;
        result = 31 * result + (courseid != null ? courseid.hashCode() : 0);
        return result;
    }
}
