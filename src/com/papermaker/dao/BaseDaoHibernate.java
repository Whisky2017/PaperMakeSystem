package com.papermaker.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 * Created by 世康 on 2016/12/30.
 */
public class BaseDaoHibernate extends HibernateDaoSupport {
    @Autowired
    public void setSessionFactoryOverride(SessionFactory sessionFactory) {

        super.setSessionFactory(sessionFactory);
    }

    public int getValidNo(String sql) {
        int no = 0;
        Session session = this.getHibernateTemplate().getSessionFactory().openSession();
        Object obj = session.createSQLQuery(sql).uniqueResult();
        if (obj == null) {
            no = 1;
        } else {
            no = (Integer)obj;
            if (no == 0) {
                no = 1;
            } else {
                no++;
            }
        }
        session.close();
        return no;
    }
}
