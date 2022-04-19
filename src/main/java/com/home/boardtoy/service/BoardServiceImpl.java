package com.home.boardtoy.service;

import com.home.boardtoy.dao.BoardMapper;
import com.home.boardtoy.dto.BoardDTO;
import com.home.boardtoy.dto.PageDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.home.boardtoy.statics.PageFor.PAGE_FOR_COUNT;
import static com.home.boardtoy.statics.PageFor.PAGE_FOR_NAVI;

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

    @Override
    public int delContent(int seq) {
        return boardMapper.delContent(seq);
    }

    @Override
    public int write(String id, String title, String content) {
        return boardMapper.write(id, title, content);
    }

    @Override
    public int view_countAdd(int seq) {
        return boardMapper.view_countAdd(seq);
    }

    @Override
    public int allBoardRow(){
        return boardMapper.allBoardCount();
    }

    @Override
    public PageDTO pageMaker(int cpage){
        PageDTO page = new PageDTO();
        int totalPostCount = allBoardRow();
        int totalPage; //전체 페이지
        if(totalPostCount % PAGE_FOR_COUNT.getValue() == 0){
            totalPage  = totalPostCount / PAGE_FOR_COUNT.getValue();
        } else {
            totalPage = totalPostCount / PAGE_FOR_COUNT.getValue() + 1;
        }

        //페이지 방어
        if(cpage < -1) {
            cpage = 1;
        }
        if(cpage > totalPage){
            cpage = totalPage;
        }

        //시작, 끝 게시글 번호 저장
        page.setStart(cpage * PAGE_FOR_COUNT.getValue() - (PAGE_FOR_COUNT.getValue() - 1));
        page.setEnd(cpage * PAGE_FOR_COUNT.getValue());

        int startNavi = (cpage - 1) / PAGE_FOR_NAVI.getValue() * PAGE_FOR_NAVI.getValue() + 1;
        int endNavi = startNavi + (PAGE_FOR_NAVI.getValue() - 1);
        if(endNavi > totalPage){
            endNavi = totalPage;
        }
        page.setStartPage(startNavi);
        page.setEndPage(endNavi);
        page.setCurrentPage(cpage);
        return page;
    }
}
