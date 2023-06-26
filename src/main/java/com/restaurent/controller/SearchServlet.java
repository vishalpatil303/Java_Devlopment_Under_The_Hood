package com.restaurent.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.restaurent.domain.MenuItem;
import com.restaurent.service.MenuItemService;

@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		MenuItemService menuItemService = new MenuItemService();
		String searchItem = req.getParameter("searchItem").trim();
		List<MenuItem> menuItems = new ArrayList<>();
		System.out.println("Search Item :" + searchItem + ". ");
		if (searchItem.trim().length() > 0) {
			menuItems = menuItemService.findMenuItems(searchItem);
		}
		menuItems.forEach(System.out::println);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		//if(menuItesm.size()>0)
		if (!menuItems.isEmpty()) {
			Iterator<MenuItem> iterator = menuItems.iterator();
			if (iterator != null) {
				out.println("<h1>Found menues for " + searchItem + " are : </h1>");
				out.println("<ul>");
				while (iterator.hasNext()) {
					MenuItem m = (MenuItem) iterator.next();
					out.print("<li>" + m.toString() + "</li>");
				}
				out.println("</ul>");

			}
		} else {
			out.print("<h1> No Menu item found for " + searchItem + " .</h1>");
		}
		
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		MenuItemService menuItemService = new MenuItemService();
		String searchItem = req.getParameter("searchItem").trim();
		List<MenuItem> menuItems = new ArrayList<>();
		System.out.println("Search Item :" + searchItem + ". ");
		if (searchItem.trim().length() > 0) {
			menuItems = menuItemService.findMenuItems(searchItem);
		}
		menuItems.forEach(System.out::println);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		//if(menuItesm.size()>0)
		if (!menuItems.isEmpty()) {
			Iterator<MenuItem> iterator = menuItems.iterator();
			if (iterator != null) {
				out.println("<h1>Found menues for " + searchItem + " are : </h1>");
				out.println("<ul>");
				while (iterator.hasNext()) {
					MenuItem m = (MenuItem) iterator.next();
					out.print("<li>" + m.toString() + "</li>");
				}
				out.println("</ul>");

			}
		} else {
			out.print("<h1> No Menu item found for " + searchItem + " .</h1>");
		}
		
	}

}
