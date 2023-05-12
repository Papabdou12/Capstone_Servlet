package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthService {

	public void authentication(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		// TODO Auto-generated method stub
		 String username = req.getParameter("username");
	        String password = req.getParameter("password");

	        if (username.equals("abdou") && password.equals("passer")) {
	            req.getSession().setAttribute("username", username);
	            res.sendRedirect("/todos.do");
	        }else {
	            req.setAttribute("errorMessage", "Invalid Credentials");
	            req.getRequestDispatcher("/WEB-INF/views/login.jsp")
	                    .forward(req, res);
	        }
	    }
	

}
