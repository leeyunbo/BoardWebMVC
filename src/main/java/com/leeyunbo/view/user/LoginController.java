package com.leeyunbo.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.leeyunbo.biz.user.UserVO;
import com.leeyunbo.biz.user.impl.UserDAO;
import com.leeyunbo.view.controller.Controller;

public class LoginController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("�α��� ó��");
		// ����� �Է� ���� 
		String id = request.getParameter("id"); 
		String password = request.getParameter("password"); 
		
		// DB ���� ó�� 
		UserVO vo = new UserVO(); 
		vo.setId(id); 
		vo.setPassword(password);
		
		UserDAO userDAO = new UserDAO(); 
		UserVO user = userDAO.getUser(vo);
		
		// ȭ�� �׺���̼� 
		// Ȯ���ڰ� ���� String => jsp ����
		if(user != null) {
			return "getBoardList.do";
		} else {
			return "login";
		}	
	}
}
