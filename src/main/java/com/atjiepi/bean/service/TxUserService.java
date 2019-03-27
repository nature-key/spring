package com.atjiepi.bean.service;

import com.atjiepi.bean.dao.TxUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TxUserService {
    @Autowired
    private TxUserDao txUserDao;

    public void insert() {
        txUserDao.insert();
    }
}


