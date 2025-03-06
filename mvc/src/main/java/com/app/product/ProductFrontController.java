package com.app.product;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Result;
import com.app.product.controller.ProductListController;
import com.app.product.controller.ProductWriteController;
import com.app.product.controller.ProductWriteOkController;

public class ProductFrontController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    req.setCharacterEncoding("UTF-8");
	    resp.setContentType("text/html; charset=utf-8;");
		
		String target = req.getRequestURI().replace(req.getContextPath() + "/", "").split("\\.")[0];
		Result result = null;
		
		if(target.equals("write")) {
			result = new ProductWriteController().execute(req, resp);
		}else if(target.equals("write-ok")) {
			result = new ProductWriteOkController().execute(req, resp);
		}else if(target.equals("list")) {
			result = new ProductListController().execute(req, resp);			
		}else if(target.equals("read")) {
		}else if(target.equals("update")) {
		}else if(target.equals("update-ok")) {
		}else if(target.equals("delete-ok")) {
			
		}else {
//			전부 404
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
