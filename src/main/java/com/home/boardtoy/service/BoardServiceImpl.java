package com.home.boardtoy.service;

import com.home.boardtoy.dao.BoardMapper;
import com.home.boardtoy.dto.BoardDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{

    private final BoardMapper boardMapper;

    @Override
    public List<BoardDTO> boardList(int start, int end) {
        List<BoardDTO> list = boardMapper.boardList(start, end);
        return list;
    }

    @Override
    public BoardDTO detail(int seq) {
        return boardMapper.detail(seq);
    }
}
