package com.home.boardtoy.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    int idDupleCheck(String id);
}
