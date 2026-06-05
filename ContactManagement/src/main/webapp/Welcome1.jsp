<%@ page import="java.util.*" %>

<%
List<Map<String, String>> list = (List<Map<String, String>>) session.getAttribute("employees");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Profiles</title>

<style>

/* ===== GLOBAL ===== */
body {
    margin: 0;
    font-family: Arial, sans-serif;
    background: #f4f6f9;
}

/* ===== NAVBAR ===== */
.navbar {
    display: flex;
    justify-content: space-between;
    align-items: center;
    background: #1e293b;
    padding: 15px 30px;
    color: white;
}

.logo {
    font-size: 22px;
    font-weight: bold;
}

.nav-links {
    display: flex;
    align-items: center;
}

.nav-links a {
    color: white;
    text-decoration: none;
    margin-left: 20px;
}

/* ADD BUTTON */
.add-btn {
    margin-left: 20px;
    background: #22c55e;
    border: none;
    color: white;
    padding: 8px 15px;
    border-radius: 6px;
    cursor: pointer;
}

.add-btn:hover {
    background: #16a34a;
}

/* ===== CONTAINER ===== */
.container {
    padding: 30px;
}

/* ===== CARD ===== */
.card-container {
    display: grid;
    grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
    gap: 20px;
}

.card {
    background: white;
    border-radius: 12px;
    box-shadow: 0 4px 12px rgba(0,0,0,0.1);
    padding: 20px;
    text-align: center;
}

.card img {
    width: 100px;
    height: 100px;
    border-radius: 50%;
}

/* ===== MODAL ===== */
.overlay {
    position: fixed;
    width: 100%;
    height: 100%;
    top: 0;
    left: 0;
    backdrop-filter: blur(5px);
    background: rgba(0,0,0,0.3);
    display: none;
    z-index: 1;
}

.modal {
    position: fixed;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    background: white;
    padding: 25px;
    border-radius: 10px;
    width: 320px;
    box-shadow: 0 10px 30px rgba(0,0,0,0.2);
    display: none;
    z-index: 2;
}

.modal input {
    width: 100%;
    padding: 8px;
    margin: 8px 0;
}

.modal button {
    width: 100%;
    padding: 10px;
    background: #2563eb;
    color: white;
    border: none;
    border-radius: 6px;
}

</style>

<script>
function openModal() {
    document.getElementById("modal").style.display = "block";
    document.getElementById("overlay").style.display = "block";
}

function closeModal() {
    document.getElementById("modal").style.display = "none";
    document.getElementById("overlay").style.display = "none";
}
</script>

</head>

<body>

<!-- ===== NAVBAR ===== -->
<div class="navbar">
    <div class="logo">MyCompany</div>

    <div class="nav-links">
        <a href="#">Home</a>
        <a href="#">About</a>
        <a href="#">Contact</a>

        <!-- ADD CONTACT BUTTON -->
        <button onclick="openModal()" class="add-btn">+ Add Contact</button>
    </div>
</div>

<!-- ===== MODAL ===== -->
<div id="overlay" class="overlay" onclick="closeModal()"></div>

<div id="modal" class="modal">
    <h3>Add Contact</h3>

    <form action="AddEmployeeServlet" method="post">
        <input type="number" name="emp_id" placeholder="Employee ID" required>
        <input type="text" name="emp_name" placeholder="Name" required>
        <input type="text" name="emp_dept" placeholder="Department" required>
        <input type="number" name="emp_salary" placeholder="Salary" required>
        <input type="email" name="email" placeholder="Email" required>
        <input type="text" name="image" placeholder="Image URL">

        <button type="submit">Add Contact</button>
    </form>
</div>

<!-- ===== CONTENT ===== -->
<div class="container">
    <h2>Employee Profiles</h2>

    <div class="card-container">

    <%
    if(list != null){
        for(Map<String, String> emp : list){
    %>

        <div class="card">
            <img src="<%= emp.get("image") %>" alt="Profile">
            <h3><%= emp.get("name") %></h3>
            <p><b>Department:</b> <%= emp.get("dept") %></p>
            <p><b>Email:</b> <%= emp.get("email") %></p>
        </div>

    <%
        }
    }
    %>

    </div>
</div>

</body>
</html>