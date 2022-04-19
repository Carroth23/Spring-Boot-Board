package com.home.boardtoy.statics;

public enum PageFor {
    PAGE_FOR_COUNT(10), //화면에 보여질 게시글 수
    PAGE_FOR_NAVI(10);   //화면에 보여질 페이지 수

    private final int value;

    PageFor(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
