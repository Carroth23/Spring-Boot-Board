package com.home.boardtoy.controller;

import com.home.boardtoy.dto.BoardDTO;
import com.home.boardtoy.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;

@Slf4j
@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;
    private final HttpSession session;

    @GetMapping
    public String board(@RequestParam(defaultValue = "0") int start, @RequestParam(defaultValue = "10") int end, Model model) {
        log.info("start = {}, end = {}", start, end);
        List<BoardDTO> list = boardService.boardList(start, end);
        model.addAttribute("list", list);
        return "/board/list";
    }

    @GetMapping("/{seq}")
    public String detail(@PathVariable int seq, Model model) {
        BoardDTO detail = boardService.detail(seq);
        boardService.view_countAdd(seq);
        model.addAttribute("detail", detail);
        return "/board/detail";
    }

    @PostMapping("/del")
    @ResponseBody
    public String del(int seq) {
        log.info("넘어온 delSeq = {}", seq);
        boardService.delContent(seq);
        return "/board";
    }

    @GetMapping("/write")
    public String writeForm() {
        return "/board/write";
    }

    @PostMapping("/write")
    public String write(String title, String content) {
        String id = (String)session.getAttribute("id");
        boardService.write(id, title, content);
        return "redirect:/board";
    }
}
