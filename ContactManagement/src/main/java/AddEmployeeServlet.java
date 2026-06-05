

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import db.DbConnection;


@WebServlet("/AddEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {


    public AddEmployeeServlet() {
        super();
        
    }

//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			
			int emp_id=Integer.parseInt(request.getParameter("emp_id"));
			String emp_name=request.getParameter("emp_name");
			String emp_dept=request.getParameter("emp_dept");
			int emp_salary=Integer.parseInt(request.getParameter("emp_salary"));
			String email=request.getParameter("email");
			String image=request.getParameter("image");
			
		Connection conn=DbConnection.getConnection();
		try {
			String query="INSERT INTO EMPLOYEE (emp_id,emp_name,emp_dept,emp_salary,email,image) VALUES(?,?,?,?,?,?)";
			PreparedStatement ps= conn.prepareStatement(query);
			ps.setInt(1, emp_id);
			ps.setString(2, emp_name);
			ps.setString(3, emp_dept);
			ps.setInt(4, emp_salary);
			ps.setString(5, email);
			ps.setString(6, image);
			int rows=ps.executeUpdate();
			response.sendRedirect("Welcome1.jsp");
			System.out.println(rows);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
