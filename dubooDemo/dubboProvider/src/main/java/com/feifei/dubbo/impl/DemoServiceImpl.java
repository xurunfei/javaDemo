package com.feifei.dubbo.impl;

import com.feifei.dubbo.DemoService;
/**
 * @author xurunfei
 * @date 2017/12/25.
 */
public class DemoServiceImpl implements DemoService {
    public int getNumber(int num) {
        return ++num;
    }

    public String getName(String name) {
        return "我叫:"+name;
    }
}
