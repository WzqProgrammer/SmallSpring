package com.wzq.springframework.beans.factory.config;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangzhengqing
 * @Date 2023/5/23 23:37
 * @Description
 */
public class DefaultSingletonDeanRegistry implements SingletonBeanRegistry{

    private Map<String, Object> singletonObjectMap = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjectMap.get(beanName);
    }

    protected void  addSingleton(String beanName, Object singletonObject){
        singletonObjectMap.put(beanName, singletonObject);
    }
}
