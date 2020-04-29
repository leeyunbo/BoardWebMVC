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
		System.out.println("�� ��� �˻� ó��");
		
		//1. ����� �Է� ���� ����(�˻� ��� ���Ŀ� ����) 
		BoardVO boardVO = new BoardVO();
		
		//2. DB ���� ó�� 
		BoardDAO boardDAO = new BoardDAO();
		List<BoardVO> boardList = boardDAO.getBoardList();
		
		
		//3. �˻� ����� ���ǿ� �����ϰ� �̵��� ȭ�� �̸� ����, getBoardList.jsp
		HttpSession session = request.getSession(); 
		session.setAttribute("boardList", boardList);	
		return "getBoardList";
	}
}