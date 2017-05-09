package com.papermaker.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by 世康 on 2016/12/8.
 */
@Entity
public class Paper {
    //显示试卷属性
    public static final String TYPE = "题目类型";
    public static final String SCORE = "题目分值";
    public static final String WEIGHT = "题目难度系数";
    public static final String POINT = "题目知识点";
    public static final String POINT_1 = "考点一";
    public static final String POINT_2 = "考点二";
    public static final String POINT_3 = "考点三";
    public static final String CONTENT = "题目内容";
    public static final String ANSWER = "参考答案";

    private int id;
    private String paperpath;
    private int userid;
    private double weight;
    private String paramid;
    private Date time;


    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PAPERPATH")
    public String getPaperpath() {
        return paperpath;
    }

    public void setPaperpath(String paperpath) {
        this.paperpath = paperpath;
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
    @Column(name = "WEIGHT")
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "PARAMID")
    public String getParamid() {
        return paramid;
    }

    public void setParamid(String paramid) {
        this.paramid = paramid;
    }

    @Basic
    @Column(name = "TIME")
    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Paper paper = (Paper) o;

        if (id != paper.id) return false;
        if (userid != paper.userid) return false;
        if (Double.compare(paper.weight, weight) != 0) return false;
        if (paperpath != null ? !paperpath.equals(paper.paperpath) : paper.paperpath != null) return false;
        if (paramid != null ? !paramid.equals(paper.paramid) : paper.paramid != null) return false;
        if (time != null ? !time.equals(paper.time) : paper.time != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (paperpath != null ? paperpath.hashCode() : 0);
        result = 31 * result + userid;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (paramid != null ? paramid.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }
}
