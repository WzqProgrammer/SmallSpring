package com.wzq.springframework.beans;

import com.wzq.springframework.beans.factory.config.BeanDefinition;

/**
 * @author wangzhengqing
 * @Date 2023/5/23 23:44
 * @Description TODO
 */
public class BeansException extends Exception{

    public BeansException(String message){
        super(message);
    }

    public BeansException(String message, Throwable cause){
        super(message, cause);
    }

}
