package com.ljm.controller;

import com.ljm.dao.task11dao;
import com.ljm.dao.task10dao;

import com.ljm.model.task10;
import com.ljm.model.task11;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liujm on 2017/6/15.
 */
@Controller
public class task11controller {

    Logger log = Logger.getLogger(task11controller.class);

    @Autowired
    private task11dao elevendao;

    @Autowired
    private task10dao tendao;

    @RequestMapping(value = "home", method = RequestMethod.GET)
    public String message(ModelMap modelMap) {
        List<task10> list = tendao.selectAllStudent();
        modelMap.put("studentList", list);
        return "jsp/home";
    }

    @RequestMapping(value = "ourselist", method = RequestMethod.GET)
    public String getCourse(ModelMap modelMap) {

        List<task11> list1 = elevendao.get11("后端开发");
        log.info("----->"+list1);
        List<task11> list2 = elevendao.get11("前端开发");
        List<task11> list3 = elevendao.get11("运维");
        List<task11> list4 = elevendao.get11("android");
        List<task11> list5 = elevendao.get11("ios");

        List list=new ArrayList();
        list.add(list1);
        list.add(list2);
        list.add(list3);
        list.add(list4);
        list.add(list5);

        log.info("------->"+list);
        modelMap.put("lists",list);
        return "jsp/ourselist";

    }



}






