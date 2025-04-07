package com.app.student.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.app.dao.StudentDAO;
import com.app.vo.StudentVO;

public class StudentWriteOkController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		StudentVO studentVO = new StudentVO();
		StudentDAO studentDAO = new StudentDAO();
		
		studentVO.setStudentName(req.getParameter("studentName"));
		studentVO.setMath(Integer.parseInt(req.getParameter("math")));
		studentVO.setEng(Integer.parseInt(req.getParameter("eng")));
		studentVO.setKor(Integer.parseInt(req.getParameter("kor")));
		
		studentDAO.insert(studentVO);
		
		result.setRedirect(true);
		result.setPath("list.student");
		return result;
	}

}
