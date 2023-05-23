package com.wzq.springframework.beans.factory.config;

/**
 * @author wangzhengqing
 * @Date 2023/5/24 0:10
 * @Description
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
