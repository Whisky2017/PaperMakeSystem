package com.papermaker.dao;


import com.papermaker.pojo.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

/**
 * Created by 世康 on 2016/12/17.
 */
public interface PaperDao {
    public int add1(Choice choice) throws IOException;
    public int add2(Completion completion) throws IOException ;
    public int add3(Judgment judgment) throws IOException ;
    public int add4(Draw draw) throws IOException ;
    public int add5(Comprehension comprehension) throws IOException ;
    public int add6(Algorithm algorithm) throws IOException ;

    public List<Choice> getChoice(int currentPage, int pageSize);
    public int getChoiceCount();
    public List<Completion> getCompletion(int currentPage, int pageSize);
    public int getCompletionCount();
    public List<Judgment> getJudgment(int currentPage, int pageSize);
    public int getJudgmentCount();
    public List<Draw> getDraw(int currentPage, int pageSize);
    public int getDrawCount();
    public List<Comprehension> getComprehension(int currentPage, int pageSize);
    public int getComprehensionCount();
    public List<Algorithm> getAlgorithm(int currentPage, int pageSize);
    public int getAlgorithmCount();

    public List<Choice> getChoiceAll();
    public List<Completion> getCompletionAll();
    public List<Judgment> getJudgmentAll();
    public List<Draw> getDrawAll();
    public List<Comprehension> getComprehensionAll();
    public List<Algorithm> getAlgorithmAll();
}
