package com.toy.everyboard.controller;

import com.toy.everyboard.dto.MemberDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping("/member/")
public class MemberController {

    @ResponseBody
    @PostMapping("join")
    public MemberDTO join(MemberDTO dto) {
        return dto;
    }
}
