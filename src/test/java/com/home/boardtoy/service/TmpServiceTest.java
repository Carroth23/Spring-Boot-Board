package com.home.boardtoy.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TmpServiceTest {

    @Autowired
    TmpMapper tmpMapper;

    @Test
    void tmp() {
        TestDTO tmp = tmpMapper.getTmp();
        System.out.println(tmp.getTmp());
    }
}