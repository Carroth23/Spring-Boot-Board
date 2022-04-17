package com.home.boardtoy.service;

import com.home.boardtoy.dao.TmpMapper;
import com.home.boardtoy.dto.TestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TmpService {

    private final TmpMapper tmpMapper;

    public TestDTO tmp() {
        return tmpMapper.getTmp();
    }
}
