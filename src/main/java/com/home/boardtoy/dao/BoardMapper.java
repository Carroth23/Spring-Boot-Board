package com.home.boardtoy.dao;

import com.home.boardtoy.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<BoardDTO> boardList(int start, int end);
}
