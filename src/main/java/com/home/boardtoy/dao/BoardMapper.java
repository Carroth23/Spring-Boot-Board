package com.home.boardtoy.dao;

import com.home.boardtoy.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<BoardDTO> boardList(@Param("start") int start, @Param("end") int end);

    BoardDTO detail(int seq);
}
