package com.wzq.springframework.test;

import com.wzq.springframework.beans.BeansException;
import com.wzq.springframework.beans.factory.config.BeanDefinition;
import com.wzq.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.wzq.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @author wangzhengqing
 * @Date 2023/5/24 0:19
 * @Description
 */
public class ApiTest {

    @Test
    public void test_BeanFactory() throws BeansException {
        //1，初始化BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        //2. 创建一个bean并注册
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        //3.第一次获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
        //4.第二次获取bean，从singleton
        UserService userService2 = (UserService) beanFactory.getBean("userService");
        userService2.queryUserInfo();
    }
}
