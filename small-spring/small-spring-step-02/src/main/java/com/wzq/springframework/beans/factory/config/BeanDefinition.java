package com.wzq.springframework.beans.factory.config;

import lombok.Getter;
import lombok.Setter;

/**
 * @author wangzhengqing
 * @Date 2023/5/23 23:24
 * @Description
 */
@Getter
@Setter
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass){
        this.beanClass = beanClass;
    }
}
