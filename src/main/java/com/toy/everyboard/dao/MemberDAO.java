package com.toy.everyboard.dao;

import com.toy.everyboard.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberDAO {

    MemberDTO selectMember();
}
