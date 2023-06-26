package OrderFood;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.restaurent.domain.MenuItem;
import com.restaurent.service.MenuItemService;

public class OrderFood extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		MenuItemService menuService = new MenuItemService();
		
		PrintWriter out  = resp.getWriter();
		resp.setContentType("text/html");
		out.println("<h1>Menu Items available are :");
		List<MenuItem> items = new ArrayList<>();
		items = menuService.getFullMenu();
		out.println("<table>");
		out.println("<th>");
		out.println("</th>");
		out.println("</table>");
	}
	
	

}
