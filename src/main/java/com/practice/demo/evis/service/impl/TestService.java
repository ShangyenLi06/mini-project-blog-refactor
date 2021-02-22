package com.practice.demo.evis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// 替換注入的範例

// interface
interface TestService {
    void doTest();
}

// Test A
@Component(value = "a")
class TestAService implements TestService {
    @Override
    public void doTest() {
        System.out.println("TestA");
    }
}

// Test B
@Component(value = "b")
class TestBService implements TestService {
    @Override
    public void doTest() {
        System.out.println("TestB");
    }
}
// ---------------------------------

// Other middle layer Service
@Component
class OtherService {

    // 這不做AutoWired, 因為並沒有要寫死用哪個TestService
    private TestService testService;

    public void doOtherTest() {
        testService.doTest();
    }

    // 這種彈性寫法只能用setter達到, 不能用field or constructor injection
    public void setTestService(TestService testService) {
        this.testService = testService;
    }
}

// ---------------------------------------

// final Apply Service
@Component
class ApplyTestService {

    @Autowired
    @Qualifier(value = "b") // 可以決定要用哪個service
    private TestService testService;

    private final OtherService otherService;

    public ApplyTestService(OtherService otherService) {
        this.otherService = otherService;
        otherService.setTestService(testService); // 最後還是要注入Service
    }

    public void apply() {
        otherService.doOtherTest();
    }
}