package com.papermaker.dao.impl;

import com.papermaker.dao.BaseDaoHibernate;
import com.papermaker.dao.UserDao;
import com.papermaker.pojo.User;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 世康 on 2016/11/24.
 */
@Repository(value = "userDao")
public class UserDaoImpl extends BaseDaoHibernate implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public User getUserByName(String username , int type) {
        Session session = sessionFactory.getCurrentSession();
        List<User> list = new ArrayList<User>();
        Criteria criteria = session.createCriteria(User.class);
        criteria.add(Restrictions.eq("username",username));
        criteria.add(Restrictions.eq("type",type));
        list = criteria.list();
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public List<User> getUser(int currentPage, int pageSize) {
        Session session = this.getHibernateTemplate().getSessionFactory().openSession();//非线程绑定，自动关闭
        Query query = session.createQuery("FROM User");
        int startRow = (currentPage-1)*pageSize;
        query.setFirstResult(startRow);
        query.setMaxResults(pageSize);
        List<User> message = query.list();
        session.close();
        return message;
    }

    @Override
    public int getUserCount() {
        List<User> list = getUserAll();
        if (list == null){
            return 0;
        }
        return list.size();
    }

    @Override
    public List<User> getUserAll() {
        Session session = sessionFactory.getCurrentSession();
        List<User> list = new ArrayList<User>();
        Criteria criteria = session.createCriteria(User.class);
        list = criteria.list();
        if (list != null && list.size() > 0 ){
            return  list;
        }
        return null;
    }
}
