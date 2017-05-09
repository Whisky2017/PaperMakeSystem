package com.papermaker.dao;

import com.papermaker.pojo.Log;

/**
 * Created by 世康 on 2016/12/30.
 */
public interface LogDao {
    public int addLog(Log log);
    public int getValidNo();
}
