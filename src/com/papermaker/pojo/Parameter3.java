package com.papermaker.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by 世康 on 2016/12/29.
 */
@Entity
public class Parameter3 {
    private int id;
    private String drawP1;
    private String drawP2;
    private String drawP3;
    private String comP1;
    private String comP2;
    private String comP3;
    private String algP1;
    private String algP2;
    private String algP3;
    private String paramid;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DRAW_P1")
    public String getDrawP1() {
        return drawP1;
    }

    public void setDrawP1(String drawP1) {
        this.drawP1 = drawP1;
    }

    @Basic
    @Column(name = "DRAW_P2")
    public String getDrawP2() {
        return drawP2;
    }

    public void setDrawP2(String drawP2) {
        this.drawP2 = drawP2;
    }

    @Basic
    @Column(name = "DRAW_P3")
    public String getDrawP3() {
        return drawP3;
    }

    public void setDrawP3(String drawP3) {
        this.drawP3 = drawP3;
    }

    @Basic
    @Column(name = "COM_P1")
    public String getComP1() {
        return comP1;
    }

    public void setComP1(String comP1) {
        this.comP1 = comP1;
    }

    @Basic
    @Column(name = "COM_P2")
    public String getComP2() {
        return comP2;
    }

    public void setComP2(String comP2) {
        this.comP2 = comP2;
    }

    @Basic
    @Column(name = "COM_P3")
    public String getComP3() {
        return comP3;
    }

    public void setComP3(String comP3) {
        this.comP3 = comP3;
    }

    @Basic
    @Column(name = "ALG_P1")
    public String getAlgP1() {
        return algP1;
    }

    public void setAlgP1(String algP1) {
        this.algP1 = algP1;
    }

    @Basic
    @Column(name = "ALG_P2")
    public String getAlgP2() {
        return algP2;
    }

    public void setAlgP2(String algP2) {
        this.algP2 = algP2;
    }

    @Basic
    @Column(name = "ALG_P3")
    public String getAlgP3() {
        return algP3;
    }

    public void setAlgP3(String algP3) {
        this.algP3 = algP3;
    }

    @Basic
    @Column(name = "PARAMID")
    public String getParamid() {
        return paramid;
    }

    public void setParamid(String paramid) {
        this.paramid = paramid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Parameter3 that = (Parameter3) o;

        if (id != that.id) return false;
        if (drawP1 != null ? !drawP1.equals(that.drawP1) : that.drawP1 != null) return false;
        if (drawP2 != null ? !drawP2.equals(that.drawP2) : that.drawP2 != null) return false;
        if (drawP3 != null ? !drawP3.equals(that.drawP3) : that.drawP3 != null) return false;
        if (comP1 != null ? !comP1.equals(that.comP1) : that.comP1 != null) return false;
        if (comP2 != null ? !comP2.equals(that.comP2) : that.comP2 != null) return false;
        if (comP3 != null ? !comP3.equals(that.comP3) : that.comP3 != null) return false;
        if (algP1 != null ? !algP1.equals(that.algP1) : that.algP1 != null) return false;
        if (algP2 != null ? !algP2.equals(that.algP2) : that.algP2 != null) return false;
        if (algP3 != null ? !algP3.equals(that.algP3) : that.algP3 != null) return false;
        if (paramid != null ? !paramid.equals(that.paramid) : that.paramid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (drawP1 != null ? drawP1.hashCode() : 0);
        result = 31 * result + (drawP2 != null ? drawP2.hashCode() : 0);
        result = 31 * result + (drawP3 != null ? drawP3.hashCode() : 0);
        result = 31 * result + (comP1 != null ? comP1.hashCode() : 0);
        result = 31 * result + (comP2 != null ? comP2.hashCode() : 0);
        result = 31 * result + (comP3 != null ? comP3.hashCode() : 0);
        result = 31 * result + (algP1 != null ? algP1.hashCode() : 0);
        result = 31 * result + (algP2 != null ? algP2.hashCode() : 0);
        result = 31 * result + (algP3 != null ? algP3.hashCode() : 0);
        result = 31 * result + (paramid != null ? paramid.hashCode() : 0);
        return result;
    }
}
