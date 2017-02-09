<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<title>Login Web Page</title>
</head>
<body>
 <form action="userLogin.do" method="post">  
<input type="hidden" name="categoryId" value="1" />  
  
<div class="login">  
  <div class="loginleft">  
     <p class="logotext">MySpringMVC Login Page</p>  
   </div>  
   <div class="loginright">  
     <p class="loginrighttit">User Login</p>  
     <ul>  
       <li><p>UserName:</p> <input name="name" id="userName" type="text"/>  
       </li>  
       <li><p>Password:</p> <input name="password" id="loginPassword" type="password"/>  
       </li>  
</ul>  
     <p><input name="" type="submit" value="Login" class="loginrightbutton" /></p>  
   </div>   
</div>  
</form> 
</body>
</html>