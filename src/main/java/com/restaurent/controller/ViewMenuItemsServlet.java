package com.restaurent.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpClient.Redirect;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.restaurent.domain.MenuItem;
import com.restaurent.service.MenuItemService;
@WebServlet("/ViewMenuItemsServlet")
public class ViewMenuItemsServlet extends HttpServlet {
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<MenuItem> itemList = new ArrayList<>();
		MenuItemService menuItemService = new MenuItemService();
		itemList = menuItemService.getFullMenu();
		resp.setContentType("text/html");
		
		
		PrintWriter out = resp.getWriter();
		out.println("Menu Item list is");
		out.println("<ul>");
		if (itemList.size() > 0) {
			for (MenuItem menuitem : itemList) {
				out.println("<li>" + menuitem + "</li>");
			}
		}else {
			out.println("<li> new Item found Restaurent menu will available soon try after some time </li>");
		}

		out.println("</ul>");
		String s = req.getContextPath();
		System.out.println(s);
		out.println("<a href='"+ s+"/ViewMenuItems.jsp'>Search Item in menu</a>");

	}

}
