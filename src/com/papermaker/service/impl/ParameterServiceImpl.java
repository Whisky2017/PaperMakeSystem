package com.papermaker.service.impl;

import com.papermaker.dao.ParameterDao;
import com.papermaker.pojo.Parameter1;
import com.papermaker.pojo.Parameter2;
import com.papermaker.pojo.Parameter3;
import com.papermaker.service.ParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by 世康 on 2016/11/25.
 */
@Service(value = "parameterService")
public class ParameterServiceImpl implements ParameterService {

    @Autowired
    private ParameterDao parameterDao;

    @Override
    public int add(int chnum1, int chnum2, int conum1, int junum1, int drnum1, int comnum1, int algnum1, int algnum2, int algnum3, String pointliststr,
                   String draw_p1, String draw_p2, String draw_p3, String com_p1, String com_p2, String com_p3, String alg_p1, String alg_p2, String alg_p3) {
        Parameter1 parameter1 = new Parameter1();
        parameter1.setId(UUID.randomUUID().toString());
        parameter1.setChoice1Num(chnum1);
        parameter1.setChoice2Num(chnum2);
        parameter1.setCompletionnum(conum1);
        parameter1.setJudgmentnum(junum1);
        parameter1.setDrawnum(drnum1);
        parameter1.setComprehensionnum(comnum1);
        parameter1.setAlgorith1Mnum (algnum1);
        parameter1.setAlgorith2Mnum (algnum2);
        parameter1.setAlgorith3Mnum (algnum3);
        if (parameterDao.add1(parameter1) != 1){
            return 0;
        }

        String paramID = parameter1.getId();
//        System.out.println("paramID="+paramID);

        String pointlist[] = pointliststr.split(",");
//        System.out.println(pointlist);

        for (int i = 0;i<pointlist.length;i+=4){
            Parameter2 parameter2 = new Parameter2();
            parameter2.setParamid(paramID);
            parameter2.setPointid(pointlist[i]);
            parameter2.setScore(Double.parseDouble(pointlist[i+1]));
            parameter2.setWeight(Double.parseDouble(pointlist[i+3]));
            if (parameterDao.add2(parameter2) != 1){
                return 0;
            }
        }

        Parameter3 parameter3 = new Parameter3();
        parameter3.setParamid(paramID);
        parameter3.setDrawP1(draw_p1);
        parameter3.setDrawP2(draw_p2);
        parameter3.setDrawP3(draw_p3);
        parameter3.setComP1(com_p1);
        parameter3.setComP2(com_p2);
        parameter3.setComP3(com_p3);
        parameter3.setAlgP1(alg_p1);
        parameter3.setAlgP2(alg_p2);
        parameter3.setAlgP3(alg_p3);
        if (parameterDao.add3(parameter3) != 1){
            return 0;
        }

        return 1;
    }
}
