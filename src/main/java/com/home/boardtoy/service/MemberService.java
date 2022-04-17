package com.home.boardtoy.service;

import com.home.boardtoy.dto.MemberDTO;

public interface MemberService {

    int idDupleCheck(String id);

    MemberDTO login();

    int signup(MemberDTO dto);
}
