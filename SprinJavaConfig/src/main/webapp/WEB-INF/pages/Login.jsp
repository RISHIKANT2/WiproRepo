<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, sans-serif;
}

body{
    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
    background:linear-gradient(135deg,#4facfe,#00f2fe);
}

.container{
    width:850px;
    height:500px;
    background:white;
    border-radius:15px;
    overflow:hidden;
    display:flex;
    box-shadow:0 10px 30px rgba(0,0,0,0.2);
}

.left{
    width:50%;
    background:linear-gradient(135deg,#667eea,#764ba2);
    color:white;
    display:flex;
    justify-content:center;
    align-items:center;
    flex-direction:column;
    padding:40px;
}

.left h1{
    font-size:40px;
    margin-bottom:15px;
}

.left p{
    text-align:center;
    line-height:24px;
}

.right{
    width:50%;
    position:relative;
    overflow:hidden;
}

.form-box{
    position:absolute;
    width:100%;
    height:100%;
    padding:50px;
    transition:0.5s;
}

.login-form{
    left:0;
}

.signup-form{
    left:100%;
}

.right.active .login-form{
    left:-100%;
}

.right.active .signup-form{
    left:0;
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
    border-radius:5px;
    cursor:pointer;
    transition:0.3s;
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
<div class="container">

    <div class="left">
        <h1>Welcome</h1>
        <p>
            Create your account and access amazing features.
        </p>
    </div>

    <div class="right" id="formContainer">

        <!-- Login Form -->
        <div class="form-box login-form">

            <h2>Login</h2>

            <form action="login" method="post">

                <div class="input-box">
                    <input type="email" name="email" placeholder="Enter Email" required>
                </div>

                <div class="input-box">
                    <input type="password" name="password" placeholder="Enter Password" required>
                </div>

                <button type="submit">Login</button>

            </form>

            <div class="toggle">
                Don't have an account?
                <a href="http://localhost:8080/SprinJavaConfig/signUp">Signup</a>
            </div>

        </div>
</body>
</html>