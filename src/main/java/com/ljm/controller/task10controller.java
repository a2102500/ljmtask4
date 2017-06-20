package com.ljm.controller;

import com.ljm.model.task10;
import com.ljm.model.task11;
import com.ljm.service.taskservice;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by liujm on 2017/6/15.
 */
@Controller
@RequestMapping("/task10")
public class task10controller {

    private Logger log= Logger.getLogger(task10controller.class);
    @Resource
    private taskservice taskservice;

    @RequestMapping(value="/list",method =RequestMethod.GET)
    public String showtask10(Model model){
        log.info("查询所有");
        List<task10> task10List=taskservice.getAllStudent();
        log.info("获取到数据"+task10List);
        model.addAttribute("List",task10List);
        log.info("成功");
        return "jsp/list";
    }
}
