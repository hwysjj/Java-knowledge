package com.hwy.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    /**
     * 在每个对象的初始化方法前面执行
     * @param bean 表示创建的具体对象
     * @param beanName 表示bean的id属性
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Person) {
            System.out.println();
        } else {
            System.out.println();
        }
        System.out.println("PostProcessorBeforeInitialization: " + beanName);
        return bean;
    }

    /**
     * 在每一个对象实例化之后执行
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("PostProcessorAfterInitialization: " + beanName);
        return bean;
    }
}
