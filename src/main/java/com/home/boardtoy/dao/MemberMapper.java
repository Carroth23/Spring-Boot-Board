package com.home.boardtoy.dao;

import com.home.boardtoy.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MemberMapper {

    int idDupleCheck(String id);

    int signup(MemberDTO dto);

    int login(@Param("id") String id, @Param("pw") String pw);
}
