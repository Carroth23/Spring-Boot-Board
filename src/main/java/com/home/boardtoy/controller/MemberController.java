package com.home.boardtoy.controller;

import com.home.boardtoy.dto.MemberDTO;
import com.home.boardtoy.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/member")
@Slf4j
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;
    private final HttpSession session;

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

    @PostMapping("/login")
    public String login(String id, String pw) {
        log.info("id = {}, pw = {}", id, pw);
        int result = memberService.login(id, pw);
        if (result == 0) {
            return "redirect:/";
        } else {
            session.setAttribute("id", id);
            return "redirect:/board";
        }
    }

    @RequestMapping("/logout")
    public String logout() {
        session.invalidate();
        return "redirect:/";
    }
}
