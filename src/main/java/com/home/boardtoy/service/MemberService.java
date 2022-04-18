package com.home.boardtoy.service;

import com.home.boardtoy.dto.MemberDTO;

public interface MemberService {

    int idDupleCheck(String id);

    int login(String id, String pw);

    int signup(MemberDTO dto);
}
