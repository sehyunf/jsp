package com.app.student.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.app.dao.StudentDAO;

public class StudentDeleteOkController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		StudentDAO studentDAO = new StudentDAO();
		Long id = Long.parseLong(req.getParameter("id"));
		
		studentDAO.delete(id);
		
		result.setRedirect(true);
		result.setPath("list.student");
		return result;
	}

}
