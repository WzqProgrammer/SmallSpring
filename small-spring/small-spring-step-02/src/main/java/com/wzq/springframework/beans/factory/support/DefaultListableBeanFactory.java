package com.wzq.springframework.beans.factory.support;

import com.wzq.springframework.beans.BeansException;
import com.wzq.springframework.beans.factory.config.BeanDefinition;
import com.wzq.springframework.beans.factory.config.BeanDefinitionRegistry;
import org.apache.commons.lang3.ObjectUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangzhengqing
 * @Date 2023/5/24 0:08
 * @Description
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {

    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();
    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    protected BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (ObjectUtils.isEmpty(beanDefinition)){
            throw new BeansException("No bean named'" + beanName + "' is defined");
        }
        return beanDefinition;
    }
}
