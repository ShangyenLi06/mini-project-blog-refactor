package com.practice.demo.evis.controller;

import org.springframework.beans.BeanUtils;

import java.lang.reflect.InvocationTargetException;

public class BeanUtilsTest {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        final TestBean2 testBean222 = new TestBean2();
        testBean222.setD(20);
        final TestBean1 testBean1 = new TestBean1(1, 2d, 3,testBean222);
        final TestBean1 testBean2 = new TestBean1();

        // spring framework beanUtils copyProperties 屬於淺層複製
        // 與apache差別在於spring可以用非public的POJO!
        // 不論哪種複製都要用 setter / getter
        BeanUtils.copyProperties(testBean1, testBean2);
        System.out.println(testBean2.getA()); // 1
        System.out.println(testBean2.getC()); // 3
        System.out.println(testBean2.getTestBean2()); // d = 20
        testBean1.setA(2);
        testBean1.setC(5);
        testBean222.setD(22);
        System.out.println(testBean2.getA()); // 1
        System.out.println(testBean2.getC()); // 3
        System.out.println(testBean2.getTestBean2()); // d = 22

        System.out.println("------------------------");

        final TestBean1 testBean3 = new TestBean1(1, 2d, 3, testBean222);
        final TestBean1 testBean4 = new TestBean1();

        org.apache.commons.beanutils.BeanUtils.copyProperties(testBean4, testBean3);
        System.out.println(testBean4.getA());
        System.out.println(testBean4.getC());
        testBean3.setA(2);
        testBean3.setC(5);
        System.out.println(testBean4.getA());
        System.out.println(testBean4.getC());
    }
}




