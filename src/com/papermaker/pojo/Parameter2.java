package com.papermaker.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by 世康 on 2016/12/8.
 */
@Entity
public class Parameter2 {

    private int id;
    private String pointid;
    private double score;
    private double weight;
    private String paramid;
    private String pointname;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "POINTID")
    public String getPointid() {
        return pointid;
    }

    public void setPointid(String pointid) {
        this.pointid = pointid;
    }

    @Basic
    @Column(name = "SCORE")
    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
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
    @Column(name = "POINTNAME")
    public String getPointname() {
        return pointname;
    }

    public void setPointname(String pointname) {
        this.pointname = pointname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Parameter2 that = (Parameter2) o;

        if (id != that.id) return false;
        if (Double.compare(that.score, score) != 0) return false;
        if (Double.compare(that.weight, weight) != 0) return false;
        if (pointid != null ? !pointid.equals(that.pointid) : that.pointid != null) return false;
        if (paramid != null ? !paramid.equals(that.paramid) : that.paramid != null) return false;
        if (pointname != null ? !pointname.equals(that.pointname) : that.pointname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (pointid != null ? pointid.hashCode() : 0);
        temp = Double.doubleToLongBits(score);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (paramid != null ? paramid.hashCode() : 0);
        result = 31 * result + (pointname != null ? pointname.hashCode() : 0);
        return result;
    }
}
