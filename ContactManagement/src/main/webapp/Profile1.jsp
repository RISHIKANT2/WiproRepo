<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page import="db.DbConnection" %>
<%@ page import="jakarta.servlet.RequestDispatcher" %>

<%
Connection conn = DbConnection.getConnection();
String query = "SELECT * FROM employee";

try {
    PreparedStatement ps = conn.prepareStatement(query);
    ResultSet rs = ps.executeQuery();

    List<Map<String, String>> empList = new ArrayList<>();

    while (rs.next()) {
        Map<String, String> emp = new HashMap<>();
        emp.put("id", String.valueOf(rs.getInt("emp_id")));
        emp.put("name", rs.getString("emp_name"));
        emp.put("dept", rs.getString("emp_dept"));
        emp.put("salary", String.valueOf(rs.getInt("emp_salary")));
        emp.put("email", rs.getString("email"));
        emp.put("image", rs.getString("image"));
        
        empList.add(emp);
    }

    session.setAttribute("employees", empList);

    RequestDispatcher rd = request.getRequestDispatcher("Welcome1.jsp");
    rd.forward(request, response);

} catch(Exception e){
    out.println(e);
}
%>