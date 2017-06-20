package com.ljm.service;

import com.ljm.dao.task10dao;
import com.ljm.model.task10;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by liujm on 2017/6/15.
 */

@Service
@Transactional(rollbackFor = Exception.class)
public class taskserviceimpl implements taskservice{
    @Resource
    private task10dao stuDao;


    @Override
    public List<task10> getAllStudent() {
        return stuDao.selectAllStudent();
    }
}
