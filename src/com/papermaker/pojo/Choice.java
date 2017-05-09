package com.papermaker.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Arrays;

/**
 * Created by 世康 on 2016/12/28.
 */
@Entity
public class Choice {
    private int id;
    private String content;
    private byte[] image1;
    private String answer;
    private byte[] image2;
    private String testpoint1;
    private String testpoint2;
    private String testpoint3;
    private int weight;
    private int score;
    private Integer count;
    private Date time;
    private int userid;
    private Integer courseid;
    private Integer type;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CONTENT")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "IMAGE1")
    public byte[] getImage1() {
        return image1;
    }

    public void setImage1(byte[] image1) {
        this.image1 = image1;
    }

    @Basic
    @Column(name = "ANSWER")
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Basic
    @Column(name = "IMAGE2")
    public byte[] getImage2() {
        return image2;
    }

    public void setImage2(byte[] image2) {
        this.image2 = image2;
    }

    @Basic
    @Column(name = "TESTPOINT1")
    public String getTestpoint1() {
        return testpoint1;
    }

    public void setTestpoint1(String testpoint1) {
        this.testpoint1 = testpoint1;
    }

    @Basic
    @Column(name = "TESTPOINT2")
    public String getTestpoint2() {
        return testpoint2;
    }

    public void setTestpoint2(String testpoint2) {
        this.testpoint2 = testpoint2;
    }

    @Basic
    @Column(name = "TESTPOINT3")
    public String getTestpoint3() {
        return testpoint3;
    }

    public void setTestpoint3(String testpoint3) {
        this.testpoint3 = testpoint3;
    }

    @Basic
    @Column(name = "WEIGHT")
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "SCORE")
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Basic
    @Column(name = "COUNT")
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Basic
    @Column(name = "TIME")
    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
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
    @Column(name = "COURSEID")
    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    @Basic
    @Column(name = "TYPE")
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Choice choice = (Choice) o;

        if (id != choice.id) return false;
        if (weight != choice.weight) return false;
        if (score != choice.score) return false;
        if (userid != choice.userid) return false;
        if (content != null ? !content.equals(choice.content) : choice.content != null) return false;
        if (!Arrays.equals(image1, choice.image1)) return false;
        if (answer != null ? !answer.equals(choice.answer) : choice.answer != null) return false;
        if (!Arrays.equals(image2, choice.image2)) return false;
        if (testpoint1 != null ? !testpoint1.equals(choice.testpoint1) : choice.testpoint1 != null) return false;
        if (testpoint2 != null ? !testpoint2.equals(choice.testpoint2) : choice.testpoint2 != null) return false;
        if (testpoint3 != null ? !testpoint3.equals(choice.testpoint3) : choice.testpoint3 != null) return false;
        if (count != null ? !count.equals(choice.count) : choice.count != null) return false;
        if (time != null ? !time.equals(choice.time) : choice.time != null) return false;
        if (courseid != null ? !courseid.equals(choice.courseid) : choice.courseid != null) return false;
        if (type != null ? !type.equals(choice.type) : choice.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(image1);
        result = 31 * result + (answer != null ? answer.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(image2);
        result = 31 * result + (testpoint1 != null ? testpoint1.hashCode() : 0);
        result = 31 * result + (testpoint2 != null ? testpoint2.hashCode() : 0);
        result = 31 * result + (testpoint3 != null ? testpoint3.hashCode() : 0);
        result = 31 * result + weight;
        result = 31 * result + score;
        result = 31 * result + (count != null ? count.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + userid;
        result = 31 * result + (courseid != null ? courseid.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
