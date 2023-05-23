package com.wzq.springframework.beans.factory.support;

import com.wzq.springframework.beans.BeansException;
import com.wzq.springframework.beans.factory.config.BeanDefinition;

/**
 * @author wangzhengqing
 * @Date 2023/5/23 23:57
 * @Description
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try{
             bean = beanDefinition.getBeanClass().newInstance();
        }catch (Exception e){
            throw new BeansException("Instantiation of bean fail",e);
        }
        addSingleton(beanName, bean);
        return bean;
    }
}
