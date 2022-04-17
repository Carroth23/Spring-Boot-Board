package com.home.boardtoy.dao;

import com.home.boardtoy.dto.TestDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TmpMapper {

    TestDTO getTmp();
}
