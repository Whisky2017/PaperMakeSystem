package com.papermaker.dao.impl;

import com.papermaker.dao.BaseDaoHibernate;
import com.papermaker.dao.LogDao;
import com.papermaker.pojo.Log;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by 世康 on 2016/12/30.
 */
@Repository(value = "logDap")
public class LogDaoImpl extends BaseDaoHibernate implements LogDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public int addLog(Log log) {
        int flag = 1;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try{
            session.save(log);
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
    public int getValidNo() {
        return this.getValidNo("SELECT max(NO) FROM log");
    }
}
