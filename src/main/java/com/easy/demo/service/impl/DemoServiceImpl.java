package com.easy.demo.service.impl;

import com.easy.demo.service.DemoService;
import com.easy.mvcframework.annotation.JService;

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
