package com.papermaker.service.impl;

import com.papermaker.dao.LogDao;
import com.papermaker.pojo.Log;
import com.papermaker.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

/**
 * Created by 世康 on 2016/12/30.
 */
@Service(value = "logService")
public class LogServiceImpl implements LogService {
    @Autowired
    private LogDao logDao;

    @Override
    public int addLog(String user, int type, String info) {
        Log log = new Log();
        log.setId(UUID.randomUUID().toString());
        System.out.println(UUID.randomUUID().toString());
        log.setNo(logDao.getValidNo());
        System.out.println(logDao.getValidNo());
        log.setUser(user);
        log.setType(type);
        log.setInfo(info);
        log.setDate(new Date());

        return logDao.addLog(log);
    }
}
