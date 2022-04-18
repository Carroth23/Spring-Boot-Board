package com.home.boardtoy.service;

import com.home.boardtoy.dto.BoardDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{
    @Override
    public List<BoardDTO> boardList(int start, int end) {
        return null;
    }
}
