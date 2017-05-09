package com.papermaker.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by 世康 on 2016/12/29.
 */
@Entity
public class Parameter1 {
    //显示试卷样式字段
    public static final String CHOICE = "选择题";
    public static final String CHOICE1 = "单选题";
    public static final String CHOICE2 = "多选题";
    public static final String COMPLETION = "填空题";
    public static final String JUDGMENT = "判断题";
    public static final String DRAW  = "画图题";
    public static final String COMPREHENSION = "综合题";
    public static final String ALGORITHM = "算法题";
    public static final String ALGORITHM1 = "算法设计题";
    public static final String ALGORITHM2 = "算法优化题";
    public static final String ALGORITHM3 = "算法填空题";

    private String id;
    private int choice1Num;
    private int choice2Num;
    private int completionnum;
    private int judgmentnum;
    private int drawnum;
    private int comprehensionnum;
    private int algorith1Mnum;
    private int algorith2Mnum;
    private int algorith3Mnum;
    private Double pointcover;

    @Id
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CHOICE1NUM")
    public int getChoice1Num() {
        return choice1Num;
    }

    public void setChoice1Num(int choice1Num) {
        this.choice1Num = choice1Num;
    }

    @Basic
    @Column(name = "CHOICE2NUM")
    public int getChoice2Num() {
        return choice2Num;
    }

    public void setChoice2Num(int choice2Num) {
        this.choice2Num = choice2Num;
    }

    @Basic
    @Column(name = "COMPLETIONNUM")
    public int getCompletionnum() {
        return completionnum;
    }

    public void setCompletionnum(int completionnum) {
        this.completionnum = completionnum;
    }

    @Basic
    @Column(name = "JUDGMENTNUM")
    public int getJudgmentnum() {
        return judgmentnum;
    }

    public void setJudgmentnum(int judgmentnum) {
        this.judgmentnum = judgmentnum;
    }

    @Basic
    @Column(name = "DRAWNUM")
    public int getDrawnum() {
        return drawnum;
    }

    public void setDrawnum(int drawnum) {
        this.drawnum = drawnum;
    }

    @Basic
    @Column(name = "COMPREHENSIONNUM")
    public int getComprehensionnum() {
        return comprehensionnum;
    }

    public void setComprehensionnum(int comprehensionnum) {
        this.comprehensionnum = comprehensionnum;
    }

    @Basic
    @Column(name = "ALGORITH1MNUM")
    public int getAlgorith1Mnum() {
        return algorith1Mnum;
    }

    public void setAlgorith1Mnum(int algorith1Mnum) {
        this.algorith1Mnum = algorith1Mnum;
    }

    @Basic
    @Column(name = "ALGORITH2MNUM")
    public int getAlgorith2Mnum() {
        return algorith2Mnum;
    }

    public void setAlgorith2Mnum(int algorith2Mnum) {
        this.algorith2Mnum = algorith2Mnum;
    }

    @Basic
    @Column(name = "ALGORITH3MNUM")
    public int getAlgorith3Mnum() {
        return algorith3Mnum;
    }

    public void setAlgorith3Mnum(int algorith3Mnum) {
        this.algorith3Mnum = algorith3Mnum;
    }

    @Basic
    @Column(name = "POINTCOVER")
    public Double getPointcover() {
        return pointcover;
    }

    public void setPointcover(Double pointcover) {
        this.pointcover = pointcover;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Parameter1 that = (Parameter1) o;

        if (choice1Num != that.choice1Num) return false;
        if (choice2Num != that.choice2Num) return false;
        if (completionnum != that.completionnum) return false;
        if (judgmentnum != that.judgmentnum) return false;
        if (drawnum != that.drawnum) return false;
        if (comprehensionnum != that.comprehensionnum) return false;
        if (algorith1Mnum != that.algorith1Mnum) return false;
        if (algorith2Mnum != that.algorith2Mnum) return false;
        if (algorith3Mnum != that.algorith3Mnum) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (pointcover != null ? !pointcover.equals(that.pointcover) : that.pointcover != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + choice1Num;
        result = 31 * result + choice2Num;
        result = 31 * result + completionnum;
        result = 31 * result + judgmentnum;
        result = 31 * result + drawnum;
        result = 31 * result + comprehensionnum;
        result = 31 * result + algorith1Mnum;
        result = 31 * result + algorith2Mnum;
        result = 31 * result + algorith3Mnum;
        result = 31 * result + (pointcover != null ? pointcover.hashCode() : 0);
        return result;
    }
}
