package com.papermaker.dao.impl;

import com.papermaker.dao.ParameterDao;
import com.papermaker.pojo.Parameter1;
import com.papermaker.pojo.Parameter2;
import com.papermaker.pojo.Parameter3;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by 世康 on 2016/11/25.
 */
@Repository(value = "parameterDao")
public class ParameterDaoImpl implements ParameterDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public int add1(Parameter1 parameter1) {
        int flag = 1;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try{
            session.save(parameter1);
            transaction.commit();//commit后数据刷新
        }catch(Exception e){
            transaction.rollback();
            e.printStackTrace();
            flag = 0;
        }finally{
            session.close();
        }
        return flag;
    }

    @Override
    public int add2(Parameter2 parameter2) {
        int flag = 1;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try{
            session.save(parameter2);
            transaction.commit();
        }catch(Exception e){
            transaction.rollback();
            e.printStackTrace();
            flag = 0;
        }finally{
            session.close();
        }
        return flag;
    }

    @Override
    public int add3(Parameter3 parameter3) {
        int flag = 1;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try{
            session.save(parameter3);
            transaction.commit();
        }catch(Exception e){
            transaction.rollback();
            e.printStackTrace();
            flag = 0;
        }finally{
            session.close();
        }
        return flag;
    }
}
