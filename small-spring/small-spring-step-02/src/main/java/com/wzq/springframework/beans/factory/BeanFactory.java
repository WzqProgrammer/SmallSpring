package com.wzq.springframework.beans.factory;

import com.wzq.springframework.beans.BeansException;

/**
 * @author wangzhengqing
 * @Date 2023/5/23 23:21
 * @Description
 */
public interface BeanFactory {
    /**
     * 获取bean
     * @param name
     * @return
     */
    Object getBean(String name) throws BeansException;
}
