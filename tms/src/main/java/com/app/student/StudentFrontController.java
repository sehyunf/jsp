package com.app.student;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Result;
import com.app.student.controller.StudentDeleteOkController;
import com.app.student.controller.StudentExceptionController;
import com.app.student.controller.StudentListController;
import com.app.student.controller.StudentReadController;
import com.app.student.controller.StudentUpdateController;
import com.app.student.controller.StudentUpdateOkController;
import com.app.student.controller.StudentWriteController;
import com.app.student.controller.StudentWriteOkController;

public class StudentFrontController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=utf-8;");
		
		String target = req.getRequestURI().replace(req.getContextPath() + "/", "").split("\\.")[0];
		Result result = null;
		
		
		
		if(target.equals("list")) {
			result = new StudentListController().execute(req, resp);
		}else if(target.equals("write")){
			result = new StudentWriteController().execute(req, resp);
		}else if(target.equals("write-ok")){
			result = new StudentWriteOkController().execute(req, resp);
		}else if(target.equals("read")){
			result = new StudentReadController().execute(req, resp);
		}else if(target.equals("update")){
			result = new StudentUpdateController().execute(req, resp);
		}else if(target.equals("update-ok")){
			result = new StudentUpdateOkController().execute(req, resp);
		}else if(target.equals("delete-ok")){
			result = new StudentDeleteOkController().execute(req, resp);
		}else {
//			404
			result = new StudentExceptionController().execute(req, resp);
		}
		
		if(result != null) {
			if(result.isRedirect()) {
				resp.sendRedirect(result.getPath());
			}else {
				req.getRequestDispatcher(result.getPath()).forward(req, resp);
			}
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
