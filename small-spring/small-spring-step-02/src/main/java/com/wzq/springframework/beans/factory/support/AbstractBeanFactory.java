package com.wzq.springframework.beans.factory.support;

import com.wzq.springframework.beans.BeansException;
import com.wzq.springframework.beans.factory.BeanFactory;
import com.wzq.springframework.beans.factory.config.BeanDefinition;
import com.wzq.springframework.beans.factory.config.DefaultSingletonDeanRegistry;
import org.apache.commons.lang3.ObjectUtils;


/**
 * @author wangzhengqing
 * @Date 2023/5/23 23:41
 * @Description
 */
public abstract class AbstractBeanFactory extends DefaultSingletonDeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if(ObjectUtils.isNotEmpty(bean)){
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;
}
