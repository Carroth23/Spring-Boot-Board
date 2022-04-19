package com.home.boardtoy.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PageDTO {
    private int currentPage;    //현재페이지
    private int startPage;      //시작페이지
    private int endPage;        //끝페이지
    private int start;          //현재페이지에서의 시작글번호
    private int end;            //현재페이지에서의 끝글번호
    private boolean prev, next; //안쓸듯?
}
