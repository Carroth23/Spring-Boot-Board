package com.home.boardtoy.dao;

import com.home.boardtoy.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<BoardDTO> boardList(@Param("start") int start, @Param("end") int end);

    BoardDTO detail(int seq);

    int delContent(int seq);

    int write(@Param("id") String id, @Param("title") String title, @Param("content") String content);

    int view_countAdd(int seq);

    int allBoardCount();
}
