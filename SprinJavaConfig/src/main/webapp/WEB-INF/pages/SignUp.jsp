<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>



body{
    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
    background:linear-gradient(135deg,#4facfe,#00f2fe);
}

.form-box{
    position:absolute;
    width:300px;
    height:400px;
    padding:50px;
    transition:0.5s;
    background-color:whitesmoke;
    border-radius:15px;
    box-shadow:4px 4px 6px grey;
    
}

h2{
    margin-bottom:30px;
    color:#333;
}

.input-box{
    margin-bottom:20px;
}

.input-box input{
    width:100%;
    padding:12px;
    border:none;
    border-bottom:2px solid #ccc;
    outline:none;
    font-size:16px;
    border-radius:15px;
    box-shadow:4px 4px 6px grey;
}

.input-box input:focus{
    border-color:#667eea;
}

button{
    width:100%;
    padding:12px;
    border:none;
    background:#667eea;
    color:white;
    font-size:16px;
    border-radius:20px;
    cursor:pointer;
    transition:0.3s;
    box-shadow:4px 4px 6px grey;
}

button:hover{
    background:#764ba2;
}

.toggle{
    margin-top:20px;
    text-align:center;
}

.toggle span{
    color:#667eea;
    cursor:pointer;
    font-weight:bold;
}

</style>
</head>
<body>
 <div class="form-box signup-form">

            <h2>SignUp</h2>

            <form action="signup" method="post">

                <div class="input-box">
                    <input type="text" name="name" placeholder="Enter Name" required>
                </div>

                <div class="input-box">
                    <input type="email" name="email" placeholder="Enter Email" required>
                </div>

                <div class="input-box">
                    <input type="password" name="password" placeholder="Enter Password" required>
                </div>

                <button type="submit">SignUp</button>

            </form>

            <div class="toggle">
                Already have an account?
                <a href="http://localhost:8080/SprinJavaConfig/login">Login</a>
            </div>

        </div>

    


</body>
</html>