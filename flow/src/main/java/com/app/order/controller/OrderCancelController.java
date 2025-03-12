package com.app.order.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.app.dao.OrderDAO;
import com.app.dao.ProductDAO;
import com.app.vo.OrderVO;

public class OrderCancelController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		OrderDAO orderDAO = new OrderDAO();
		ProductDAO productDAO = new ProductDAO();
		String[] orderIds = req.getParameterValues("orderId");
		String[] productIds = req.getParameterValues("productId");
		
		
		for(int i = 0; i < orderIds.length; i++) {
			OrderVO orderVO = new OrderVO();
			orderVO.setId(Long.parseLong(orderIds[i]));
			orderVO.setProductId(Long.parseLong(productIds[i]));
			orderVO.setProductCount(orderDAO.selectCountById(Long.parseLong(orderIds[i])) * -1); 
//			??
//			재고를 복구한다.
			productDAO.updateStock(orderVO);
//			상품을 삭제한다.
			
			orderDAO.delete(Long.parseLong(orderIds[i]));
		}
		
		result.setRedirect(true);
		result.setPath("list.order");
		return result;
	}
}
