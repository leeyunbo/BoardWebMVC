package com.leeyunbo.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.leeyunbo.view.controller.Controller;

public class LogoutController implements Controller{

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("�α׾ƿ� ó��");
		
		// 1. �������� ����� ���� ��ü ���� 
		HttpSession session = request.getSession();
		session.invalidate(); 

		// 2. ���� ���� ��, ���� ȭ������ �̵�
		return "login";
	}

}