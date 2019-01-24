package com.jerry.demo.service.impl;

import com.jerry.demo.service.DemoService;
import com.jerry.mvcframework.annotation.JService;

/**
 * Created by Yangjy on 2018/2/27.
 */
@JService
public class DemoServiceImpl implements DemoService{

    @Override
    public String getName(String name){
        return "my name is " + name;
    }

}
