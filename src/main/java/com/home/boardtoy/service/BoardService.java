package com.home.boardtoy.service;

import com.home.boardtoy.dto.BoardDTO;

import java.util.List;

public interface BoardService {

    List<BoardDTO> boardList(int start, int end);

    BoardDTO detail(int seq);

    int delContent(int seq);

    int write(String id, String title, String content);

    int view_countAdd(int seq);
}
