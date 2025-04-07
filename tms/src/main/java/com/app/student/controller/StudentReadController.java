package com.app.student.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.app.dao.StudentDAO;
import com.app.dto.StudentDTO;

public class StudentReadController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		StudentDAO studentDAO = new StudentDAO();
		StudentDTO student = new StudentDTO();
		Long id = Long.parseLong(req.getParameter("id"));
		
//		student = studentDAO.select(id).orElseThrow(()-> {
//			throw new RuntimeException("ProductReadController user not found");
//		});
		
		student = studentDAO.select(id);
		
		req.setAttribute("student", student);
		result.setPath("read.jsp");
		return result;
	}

}
