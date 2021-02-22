package com.practice.demo.evis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

// Other middle layer Service
class OtherService2 {

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

@Configuration
class ConfigureOtherServiceBeans {

    @Bean
    @Qualifier(value = "testAInjectOtherService")
    public OtherService2 getInjectTestABean(@Qualifier(value = "a") TestService testService){
        final OtherService2 otherService2 = new OtherService2();
        otherService2.setTestService(testService);
        return otherService2;
    }

    @Bean
    @Qualifier(value = "testBInjectOtherService")
    public OtherService2 getInjectTestBBean(@Qualifier(value = "b") TestService testService){
        final OtherService2 otherService2 = new OtherService2();
        otherService2.setTestService(testService);
        return otherService2;
    }
}

// final Apply Service
@Component
class ApplyTestService2 {

    @Autowired
    @Qualifier(value = "testAInjectOtherService")
    private OtherService2 otherService2;

    public void apply() {
        otherService2.doOtherTest();
    }
}


