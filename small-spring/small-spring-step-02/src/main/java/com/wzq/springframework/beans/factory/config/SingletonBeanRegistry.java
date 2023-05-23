package com.wzq.springframework.beans.factory.config;

/**
 * @author wangzhengqing
 * @Date 2023/5/23 23:34
 * @Description
 */
public interface SingletonBeanRegistry {

    /**
     * 获取单例对象
     * @param beanName
     * @return
     */
    Object getSingleton(String beanName);
}
