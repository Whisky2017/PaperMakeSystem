package com.papermaker.dao.impl;

import com.papermaker.dao.BaseDaoHibernate;
import com.papermaker.dao.PaperDao;
import com.papermaker.pojo.*;
import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 世康 on 2016/12/17.
 */
@Repository(value = "paperDao")
public class PaperDaoImpl extends BaseDaoHibernate implements PaperDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public int add1(Choice choice) throws IOException {
        int flag = 1;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try{
            session.save(choice);
//            System.out.println("content3="+choice.getContent());
            transaction.commit();
        }catch (Exception e){
            transaction.rollback();
            e.printStackTrace();
            flag = 0;
        }finally {
            session.close();
        }

        return flag;
    }

    @Override
    public int add2(Completion completion) throws IOException {
        int flag = 1;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try{
            session.save(completion);
            transaction.commit();
        }catch (Exception e){
            transaction.rollback();
            e.printStackTrace();
            flag = 0;
        }finally {
            session.close();
        }

        return flag;
    }

    @Override
    public int add3(Judgment judgment) throws IOException {
        int flag = 1;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try{
            session.save(judgment);
            transaction.commit();
        }catch (Exception e){
            transaction.rollback();
            e.printStackTrace();
            flag = 0;
        }finally {
            session.close();
        }

        return flag;
    }

    @Override
    public int add4(Draw draw) throws IOException {
        int flag = 1;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try{
            session.save(draw);
            transaction.commit();
        }catch (Exception e){
            transaction.rollback();
            e.printStackTrace();
            flag = 0;
        }finally {
            session.close();
        }

        return flag;
    }

    @Override
    public int add5(Comprehension comprehension) throws IOException {
        int flag = 1;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try{
            session.save(comprehension);
            transaction.commit();
        }catch (Exception e){
            transaction.rollback();
            e.printStackTrace();
            flag = 0;
        }finally {
            session.close();
        }

        return flag;
    }

    @Override
    public int add6(Algorithm algorithm) throws IOException {
        int flag = 1;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try{
            session.save(algorithm);
            transaction.commit();
        }catch (Exception e){
            transaction.rollback();
            e.printStackTrace();
            flag = 0;
        }finally {
            session.close();
        }

        return flag;
    }

    @Override
    public List<Choice> getChoice(int currentPage, int pageSize) {
        Session session = this.getHibernateTemplate().getSessionFactory().openSession();
        Query query = session.createQuery("FROM Choice");
        int startRow = (currentPage-1)*pageSize;
        query.setFirstResult(startRow);
        query.setMaxResults(pageSize);
        List<Choice> message = query.list();
        session.close();
        return message;
    }

    @Override
    public int getChoiceCount() {
        List<Choice> list = getChoiceAll();
        if (list == null){
            return 0;
        }
        return list.size();
    }

    @Override
    public List<Completion> getCompletion(int currentPage, int pageSize) {
        Session session = this.getHibernateTemplate().getSessionFactory().openSession();
        Query query = session.createQuery("FROM Completion");
        int startRow = (currentPage-1)*pageSize;
        query.setFirstResult(startRow);
        query.setMaxResults(pageSize);
        List<Completion> message = query.list();
        session.close();
        return message;
    }

    @Override
    public int getCompletionCount() {
        List<Completion> list = getCompletionAll();
        if (list == null){
            return 0;
        }
        return list.size();
    }

    @Override
    public List<Judgment> getJudgment(int currentPage, int pageSize) {
        Session session = this.getHibernateTemplate().getSessionFactory().openSession();
        Query query = session.createQuery("FROM Judgment");
        int startRow = (currentPage-1)*pageSize;
        query.setFirstResult(startRow);
        query.setMaxResults(pageSize);
        List<Judgment> message = query.list();
        session.close();
        return message;
    }

    @Override
    public int getJudgmentCount() {
        List<Judgment> list = getJudgmentAll();
        if (list == null){
            return 0;
        }
        return list.size();
    }

    @Override
    public List<Draw> getDraw(int currentPage, int pageSize) {
        Session session = this.getHibernateTemplate().getSessionFactory().openSession();
        Query query = session.createQuery("FROM Draw");
        int startRow = (currentPage-1)*pageSize;
        query.setFirstResult(startRow);
        query.setMaxResults(pageSize);
        List<Draw> message = query.list();
        session.close();
        return message;
    }

    @Override
    public int getDrawCount() {
        List<Draw> list = getDrawAll();
        if (list == null){
            return 0;
        }
        return list.size();
    }

    @Override
    public List<Comprehension> getComprehension(int currentPage, int pageSize) {
        Session session = this.getHibernateTemplate().getSessionFactory().openSession();
        Query query = session.createQuery("FROM Comprehension");
        int startRow = (currentPage-1)*pageSize;
        query.setFirstResult(startRow);
        query.setMaxResults(pageSize);
        List<Comprehension> message = query.list();
        session.close();
        return message;
    }

    @Override
    public int getComprehensionCount() {
        List<Comprehension> list = getComprehensionAll();
        if (list == null){
            return 0;
        }
        return list.size();
    }

    @Override
    public List<Algorithm> getAlgorithm(int currentPage, int pageSize) {
        Session session = this.getHibernateTemplate().getSessionFactory().openSession();
        Query query = session.createQuery("FROM Algorithm");
        int startRow = (currentPage-1)*pageSize;
        query.setFirstResult(startRow);
        query.setMaxResults(pageSize);
        List<Algorithm> message = query.list();
        session.close();
        return message;
    }

    @Override
    public int getAlgorithmCount() {
        List<Algorithm> list = getAlgorithmAll();
        if (list == null){
            return 0;
        }
        return list.size();
    }

    @Override
    public List<Choice> getChoiceAll() {
        Session session = sessionFactory.getCurrentSession();
        List<Choice> list = new ArrayList<Choice>();
        Criteria criteria = session.createCriteria(Choice.class);
        list = criteria.list();
        if (list != null && list.size() > 0 ){
            return  list;
        }
        return null;
    }

    @Override
    public List<Completion> getCompletionAll() {
        Session session = sessionFactory.getCurrentSession();
        List<Completion> list = new ArrayList<Completion>();
        Criteria criteria = session.createCriteria(Completion.class);
        list = criteria.list();
        if (list != null && list.size() > 0 ){
            return  list;
        }
        return null;
    }

    @Override
    public List<Judgment> getJudgmentAll() {
        Session session = sessionFactory.getCurrentSession();
        List<Judgment> list = new ArrayList<Judgment>();
        Criteria criteria = session.createCriteria(Judgment.class);
        list = criteria.list();
        if (list != null && list.size() > 0 ){
            return  list;
        }
        return null;
    }

    @Override
    public List<Draw> getDrawAll() {
        Session session = sessionFactory.getCurrentSession();
        List<Draw> list = new ArrayList<Draw>();
        Criteria criteria = session.createCriteria(Draw.class);
        list = criteria.list();
        if (list != null && list.size() > 0 ){
            return  list;
        }
        return null;
    }

    @Override
    public List<Comprehension> getComprehensionAll() {
        Session session = sessionFactory.getCurrentSession();
        List<Comprehension> list = new ArrayList<Comprehension>();
        Criteria criteria = session.createCriteria(Comprehension.class);
        list = criteria.list();
        if (list != null && list.size() > 0 ){
            return  list;
        }
        return null;
    }

    @Override
    public List<Algorithm> getAlgorithmAll() {
        Session session = sessionFactory.getCurrentSession();
        List<Algorithm> list = new ArrayList<Algorithm>();
        Criteria criteria = session.createCriteria(Algorithm.class);
        list = criteria.list();
        if (list != null && list.size() > 0 ){
            return  list;
        }
        return null;
    }
}
