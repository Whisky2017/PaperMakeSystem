package com.papermaker.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by 世康 on 2016/12/8.
 */
@Entity
public class Testpoint {

    //知识点
    public static final String T1 ="一 绪论";
    public static final String T1_1 ="1.1 数据结构相关概念和术语";
    public static final String T1_2 ="1.2 算法的复杂度分析";

    public static final String T2 ="二 线性表";
    public static final String T2_1 ="2.1 线性表的相关概念";
    public static final String T2_2 ="2.2 顺序表的插入删除";
    public static final String T2_3 ="2.3 单链表的插入删除";
    public static final String T2_4 ="2.4 单链表的相关算法";
    public static final String T2_5 ="2.5 双向循环链表的插入和删除";

    public static final String T3 ="三 栈和队列";
    public static final String T3_1 ="3.1 栈的相关概念与特性";
    public static final String T3_2 ="3.2 顺序栈的基本操作";
    public static final String T3_3 ="3.3 链式栈的基本操作";
    public static final String T3_4 ="3.4 栈的应用";
    public static final String T3_5 ="3.5 队列的相关概念";
    public static final String T3_6 ="3.6 链式队列的基本操作";
    public static final String T3_7 ="3.7 顺序队列的基本操作";

    public static final String T4 ="四 串";
    public static final String T4_1 ="4.1 字符串的基本概念及术语";
    public static final String T4_2 ="4.2 字符串的基本运算、存储结构";

    public static final String T5 ="五 数组与广义表";
    public static final String T5_1 ="5.1 抽象数据类型数组的说明";
    public static final String T5_2 ="5.2 数组的物理结构";
    public static final String T5_3 ="5.3 特殊矩阵的压缩存储";
    public static final String T5_4 ="5.4 稀疏矩阵的压缩存储、稀疏矩阵的运算（转置算法）";
    public static final String T5_5 ="5.5 广义表的概念：概念、物理结构、递归算法";

    public static final String T6 ="六 树与二叉树";
    public static final String T6_1 ="6.1 树的有关概念";
    public static final String T6_2 ="6.2 二叉树的定义与性质";
    public static final String T6_3 ="6.3 二叉树的存储结构";
    public static final String T6_4 ="6.4 二叉树的遍历与应用";
    public static final String T6_5 ="6.5 树的存储结构";
    public static final String T6_6 ="6.6 森林与二叉树的转换、树与森林的遍历";
    public static final String T6_7 ="6.7 哈夫曼树、哈夫曼编码与哈夫曼算法";

    public static final String T7 ="七 图";
    public static final String T7_1 ="7.1 图的定义及术语";
    public static final String T7_2 ="7.2 图的物理存贮结构";
    public static final String T7_3 ="7.3 图的遍历";
    public static final String T7_4 ="7.4 图的连通性问题：DFS与BFS生成树、强连通分量的求解，最小生成树";
    public static final String T7_5 ="7.5 有向无环图及应用、最短路径";

    public static final String T9 ="九 查找";
    public static final String T9_1 ="9.1 查找问题概述";
    public static final String T9_2 ="9.2 顺序查找法";
    public static final String T9_3 ="9.3 折半查找法";
    public static final String T9_4 ="9.4 分块查找法";
    public static final String T9_5 ="9.5 二叉排序树查找法";
    public static final String T9_6 ="9.6 平衡二叉排序树查找法";
    public static final String T9_7 ="9.7 哈希查找法";


    public static final String T10 ="十 排序";
    public static final String T10_1 ="10.1 查找问题概述、插入排序法";
    public static final String T10_2 ="10.2 交换排序法";
    public static final String T10_3 ="10.3 选择排序法";
    public static final String T10_4 ="10.4 归并排序法";
    public static final String T10_5 ="10.5 基数排序法";

    private int id;
    private String pointid;
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

        Testpoint testpoint = (Testpoint) o;

        if (id != testpoint.id) return false;
        if (pointid != null ? !pointid.equals(testpoint.pointid) : testpoint.pointid != null) return false;
        if (pointname != null ? !pointname.equals(testpoint.pointname) : testpoint.pointname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (pointid != null ? pointid.hashCode() : 0);
        result = 31 * result + (pointname != null ? pointname.hashCode() : 0);
        return result;
    }
}
