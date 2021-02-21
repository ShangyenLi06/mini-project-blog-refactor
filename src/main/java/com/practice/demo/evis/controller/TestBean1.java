package com.practice.demo.evis.controller;


public class TestBean1 {
    private Integer a;
    private Double b;
    private int c;
    private TestBean2 testBean2;

    TestBean1(){}

    TestBean1(Integer a, Double b, int c, TestBean2 testBean2){
        this.a = a;
        this.b = b;
        this.c = c;
        this.testBean2 = testBean2;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public TestBean2 getTestBean2() {
        return testBean2;
    }

    public void setTestBean2(TestBean2 testBean2) {
        this.testBean2 = testBean2;
    }
}
