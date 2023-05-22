package com.wzq.springframework.test;

import com.wzq.springframework.BeanDefinition;
import com.wzq.springframework.BeanFactory;
import com.wzq.springframework.test.bean.UserService;
import org.junit.Test;

public class ApiTest {

    @Test
    public void beanFactoryTest(){
        //1.初始化BeanFactory
        BeanFactory beanFactory = new BeanFactory();
        //2. 注册bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        //3. 获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
