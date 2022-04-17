package com.home.boardtoy.dao;

import com.home.boardtoy.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    int idDupleCheck(String id);

    int signup(MemberDTO dto);
}
