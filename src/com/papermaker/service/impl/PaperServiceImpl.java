package com.papermaker.service.impl;

import com.papermaker.dao.PaperDao;
import com.papermaker.pojo.*;
import com.papermaker.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

/**
 * Created by 世康 on 2016/12/17.
 */
@Service(value = "paperService")
public class PaperServiceImpl implements PaperService {

    @Autowired
    private PaperDao paperDao;

    @Override
    public int add(int select1, int score, int weight, String select2, String select3, String select4, String content, byte[] imgIn1, String answer, byte[] imgIn2, int userid) throws IOException {
        if ((select1 == 1)||(select1 == 2)){
            Choice choice = new Choice();
            choice.setScore(score);
            choice.setWeight(weight);
            choice.setTestpoint1(select2);
            choice.setTestpoint2(select3);
            choice.setTestpoint3(select4);
            choice.setContent(content);
            choice.setImage1(imgIn1);
            choice.setAnswer(answer);
            choice.setImage2(imgIn2);
            choice.setUserid(userid);
            if (select1 == 1){
                choice.setType(1);
            }else if (select1 == 2){
                choice.setType(2);
            }
            if (paperDao.add1(choice) != 1 ){
                return 0;
            }
        }else if (select1 == 3){
            Completion completion = new Completion();
            completion.setScore(score);
            completion.setWeight(weight);
            completion.setTestpoint1(select2);
            completion.setTestpoint2(select3);
            completion.setTestpoint3(select4);
            completion.setContent(content);
            completion.setImage1(imgIn1);
            completion.setAnswer(answer);
            completion.setImage2(imgIn2);
            completion.setUserid(userid);
            if (paperDao.add2(completion) != 1 ){
                return 0;
            }
        }else if (select1 == 4){
            Judgment judgment = new Judgment();
            judgment.setScore(score);
            judgment.setWeight(weight);
            judgment.setTestpoint1(select2);
            judgment.setTestpoint2(select3);
            judgment.setTestpoint3(select4);
            judgment.setContent(content);
            judgment.setImage1(imgIn1);
            judgment.setAnswer(answer);
            judgment.setImage2(imgIn2);
            judgment.setUserid(userid);
            if (paperDao.add3(judgment) != 1 ){
                return 0;
            }
        }else if (select1 == 5){
            Draw draw = new Draw();
            draw.setScore(score);
            draw.setWeight(weight);
            draw.setTestpoint1(select2);
            draw.setTestpoint2(select3);
            draw.setTestpoint3(select4);
            draw.setContent(content);
            draw.setImage1(imgIn1);
            draw.setAnswer(answer);
            draw.setImage2(imgIn2);
            draw.setUserid(userid);
            if (paperDao.add4(draw) != 1 ){
                return 0;
            }
        }else if (select1 == 6){
            Comprehension comprehension = new Comprehension();
            comprehension.setScore(score);
            comprehension.setWeight(weight);
            comprehension.setTestpoint1(select2);
            comprehension.setTestpoint2(select3);
            comprehension.setTestpoint3(select4);
            comprehension.setContent(content);
            comprehension.setImage1(imgIn1);
            comprehension.setAnswer(answer);
            comprehension.setImage2(imgIn2);
            comprehension.setUserid(userid);
            if (paperDao.add5(comprehension) != 1 ){
                return 0;
            }
        }else if ((select1 == 7)||(select1 == 8)||(select1 == 9)){
            Algorithm algorithm = new Algorithm();
            algorithm.setScore(score);
            algorithm.setWeight(weight);
            algorithm.setTestpoint1(select2);
            algorithm.setTestpoint2(select3);
            algorithm.setTestpoint3(select4);
            algorithm.setContent(content);
            algorithm.setImage1(imgIn1);
            algorithm.setAnswer(answer);
            algorithm.setImage2(imgIn2);
            algorithm.setUserid(userid);
            if (select1 == 7){
                algorithm.setType(1);
            }else if(select1 == 8){
                algorithm.setType(2);
            }else if(select1 == 9){
                algorithm.setType(3);
            }
            if (paperDao.add6(algorithm) != 1 ){
                return 0;
            }
        }
//        System.out.println("content2="+content);
        return 1;
    }

    @Override
    public List<Choice> getChoice(int currentPage, int pageSize) {
        return null;
    }

    @Override
    public int getChoiceCount() {
        return 0;
    }

    @Override
    public List<Completion> getCompletion(int currentPage, int pageSize) {
        return null;
    }

    @Override
    public int getCompletionCount() {
        return 0;
    }

    @Override
    public List<Judgment> getJudgment(int currentPage, int pageSize) {
        return null;
    }

    @Override
    public int getJudgmentCount() {
        return 0;
    }

    @Override
    public List<Draw> getDraw(int currentPage, int pageSize) {
        return null;
    }

    @Override
    public int getDrawCount() {
        return 0;
    }

    @Override
    public List<Comprehension> getComprehension(int currentPage, int pageSize) {
        return null;
    }

    @Override
    public int getComprehensionCount() {
        return 0;
    }

    @Override
    public List<Algorithm> getAlgorithm(int currentPage, int pageSize) {
        return null;
    }

    @Override
    public int getAlgorithmCount() {
        return 0;
    }
}
