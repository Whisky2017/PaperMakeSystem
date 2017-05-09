package com.papermaker.service;

import com.papermaker.pojo.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

/**
 * Created by 世康 on 2016/12/17.
 */
public interface PaperService {

    public int add(int select1, int score, int weight, String select2, String select3, String select4, String content, byte[] imgIn1, String answer,byte[] imgIn2,int userid) throws IOException ;

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
    public List<Algorithm> getAlgorithm(int currentPage,int pageSize);
    public int getAlgorithmCount();
}
