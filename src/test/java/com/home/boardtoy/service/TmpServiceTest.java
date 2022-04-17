package com.home.boardtoy.service;

import com.home.boardtoy.dao.TmpMapper;
import com.home.boardtoy.dto.TestDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

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