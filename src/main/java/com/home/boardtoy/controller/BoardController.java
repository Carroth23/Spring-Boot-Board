package com.home.boardtoy.controller;

import com.home.boardtoy.dto.BoardDTO;
import com.home.boardtoy.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Slf4j
@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping
    public String board(@RequestParam(defaultValue = "0") int start, @RequestParam(defaultValue = "10") int end, Model model) {
        log.info("start = {}, end = {}", start, end);
        List<BoardDTO> list = boardService.boardList(start, end);
        model.addAttribute("list", list);
        return "/board/list";
    }
}
