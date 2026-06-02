

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import db.DbConnection;


@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	
       
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Servlet Demo Started");
//	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name= request.getParameter("user");
		String password = request.getParameter("pass");
		Connection conn=DbConnection.getConnection();
//		response.getWriter().append("The user Enterd is: "+name+" and his password is:"+password);
//		Cookie cooky= new Cookie("username",name.trim());
//		cooky.setMaxAge(30*60);
//		response.addCookie(cooky);
//		HttpSession session = request.getSession();
//		session.setAttribute("username", name.trim());
		String query= "SELECT * FROM users WHERE username=? and password=?";
		try {
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setString(1,name);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {

				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Profile1.jsp");
				dispatcher.forward(request, response);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		

		
	}

}
