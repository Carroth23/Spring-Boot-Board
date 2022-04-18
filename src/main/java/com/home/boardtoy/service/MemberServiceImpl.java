package com.home.boardtoy.service;

import com.home.boardtoy.dao.MemberMapper;
import com.home.boardtoy.dto.MemberDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    private final MemberMapper memberMapper;

    @Override
    public int idDupleCheck(String id) {
        int result = memberMapper.idDupleCheck(id);
        log.info("result = {}", result);
        return result;
    }

    @Override
    public int login(String id, String pw) {
        return memberMapper.login(id, pw);
    }

    @Override
    public int signup(MemberDTO dto) {
        return memberMapper.signup(dto);
    }
}
