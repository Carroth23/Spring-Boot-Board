package com.home.boardtoy.controller;

import com.home.boardtoy.dto.MemberDTO;
import com.home.boardtoy.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/signup")
    public String signupGo() {
        return "/member/signupForm";
    }

    @PostMapping("/signup")
    public String signup(MemberDTO dto) {
        memberService.signup(dto);
        return "redirect:index";
    }

    @ResponseBody
    @PostMapping("/idDupleCheck")
    public int idDupleCheck(String id) {
        return memberService.idDupleCheck(id);
    }
}
