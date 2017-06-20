package com.ljm.dao;

import com.ljm.model.task10;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by liujm on 2017/6/15.
 */
@Component
@Repository
public interface task10dao {
    List<task10> selectAllStudent();

}
