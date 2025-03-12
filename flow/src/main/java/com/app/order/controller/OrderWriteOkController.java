package com.app.order.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.Action;
import com.app.Result;
import com.app.dao.MemberDAO;
import com.app.dao.OrderDAO;
import com.app.dao.ProductDAO;
import com.app.vo.MemberVO;
import com.app.vo.OrderVO;

public class OrderWriteOkController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		MemberDAO memberDAO = new MemberDAO();
		OrderDAO orderDAO = new OrderDAO();
		OrderVO orderVO = new OrderVO();
		ProductDAO productDAO = new ProductDAO(); 
		
		HttpSession session = req.getSession();
		
		String memberEmail = (String)session.getAttribute("memberEmail");
		
		System.out.println(memberEmail);
		
		Long foundMemberId = memberDAO.selectByEmail(memberEmail).map(MemberVO::getId).orElseThrow(() ->{
			throw new RuntimeException();
		});
		
		orderVO.setMemberId(foundMemberId);
		orderVO.setProductId(Long.parseLong(req.getParameter("productId")));
		orderVO.setProductCount(Integer.parseInt(req.getParameter("productCount")));
		
		productDAO.updateStock(orderVO);
		orderDAO.insert(orderVO);
		
		result.setRedirect(true);
		result.setPath("list.order?memberId=" + foundMemberId);
		
		return result;
	}

}
