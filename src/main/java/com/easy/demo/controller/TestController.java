package com.easy.demo.controller;

import com.easy.demo.service.DemoService;
import com.easy.mvcframework.annotation.JAutowired;
import com.easy.mvcframework.annotation.JController;
import com.easy.mvcframework.annotation.JRequestMapping;
import com.easy.mvcframework.annotation.JRequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created by PPS
 */
@JController
@JRequestMapping("/web")
public class TestController {

    @JAutowired
    private DemoService demoService;

    @JRequestMapping("/test")
    public void test(HttpServletRequest req, HttpServletResponse resp , @JRequestParam("name") String name){
        demoService.getName(name);
        System.out.println("test: name = " + name);
    }

    @JRequestMapping("/test1")
    public void test1(HttpServletRequest req, HttpServletResponse resp ,@JRequestParam("name") String name){
        System.out.println("test1: name = " + name);
    }

    @JRequestMapping("/test2")
    public void test2(HttpServletRequest req, HttpServletResponse resp ,@JRequestParam("name") String name){
        System.out.println("test2: name = " + name);
    }


}
