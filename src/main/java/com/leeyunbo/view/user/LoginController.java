package com.leeyunbo.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.leeyunbo.biz.user.UserVO;
import com.leeyunbo.biz.user.impl.UserDAO;
import com.leeyunbo.view.controller.Controller;

public class LoginController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("로그인 처리");
		// 사용자 입력 추출 
		String id = request.getParameter("id"); 
		String password = request.getParameter("password"); 
		
		// DB 연동 처리 
		UserVO vo = new UserVO(); 
		vo.setId(id); 
		vo.setPassword(password);
		
		UserDAO userDAO = new UserDAO(); 
		UserVO user = userDAO.getUser(vo);
		
		// 화면 네비게이션 
		// 확장자가 없는 String => jsp 파일
		if(user != null) {
			return "getBoardList.do";
		} else {
			return "login";
		}	
	}
}
