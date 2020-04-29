package com.leeyunbo.view.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.leeyunbo.biz.board.BoardVO;
import com.leeyunbo.biz.board.impl.BoardDAO;
import com.leeyunbo.view.controller.Controller;

public class GetBoardListController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("글 목록 검색 처리");
		
		//1. 사용자 입력 정보 추출(검색 기능 이후에 구현) 
		BoardVO boardVO = new BoardVO();
		
		//2. DB 연동 처리 
		BoardDAO boardDAO = new BoardDAO();
		List<BoardVO> boardList = boardDAO.getBoardList();
		
		
		//3. 검색 결과를 세션에 저장하고 이동할 화면 이름 리턴, getBoardList.jsp
		HttpSession session = request.getSession(); 
		session.setAttribute("boardList", boardList);	
		return "getBoardList";
	}
}
