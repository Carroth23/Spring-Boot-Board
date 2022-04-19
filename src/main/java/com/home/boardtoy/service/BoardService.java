package com.home.boardtoy.service;

import com.home.boardtoy.dto.BoardDTO;
import com.home.boardtoy.dto.PageDTO;

import java.util.List;

public interface BoardService {

    List<BoardDTO> boardList(int start, int end);

    BoardDTO detail(int seq);

    int delContent(int seq);

    int write(String id, String title, String content);

    int view_countAdd(int seq);

    int allBoardRow();

    PageDTO pageMaker(int cpage);
}
