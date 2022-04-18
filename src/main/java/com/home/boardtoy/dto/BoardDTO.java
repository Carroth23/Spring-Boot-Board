package com.home.boardtoy.dto;

import lombok.Data;

import java.sql.Date;

@Data
public class BoardDTO {
    private int seq;
    private String title;
    private String writer;
    private String content;
    private Date write_date;
    private int view_count;
}
