package by.hancharou.start;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		Main main = new Main();
		boolean isExist = main.accauntIsExist(email, password);
		if(isExist) {
			response.sendRedirect("/electrical-networks/WEB-INF/second-page.html");
//			ServletContext context= getServletContext();
//			RequestDispatcher rd= context.getRequestDispatcher("/second-page.html");
//			rd.forward(request, response);
		}else {
			response.sendRedirect("/electrical-networks/index.html");
		}
	}
}
