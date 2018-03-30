<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>     
</head>
<body style="background:#ededed;">
<div id="header"></div>
<!--Remaining section-->

 <div class="form-container-small">
 <!-- <center>
 <h4 class="form-heading">Login to your account</h4>
 </center> -->
 <center><span class="login_sub_title"> ${message} </span></center>
 <form class="main_form" id="loginForm" modelAttribute="login" action="loginProcess" method="post">
 
 <center style="margin-top: 15%;">
	 <div class="form-group">
	    <input type="text" class="form-col" id="username" name="username" placeholder="Email ID" required>
	 </div>	  
	  <div class="form-group">
	    <input type="password" class="form-col" id="password" name="password" placeholder="Password" required>
	    <a  style="float:right;padding:10px;cursor:pointer;color: #133ab7;" id="reset_pasw_btn">Forgot Password?</a>
	  </div>
  </center>
  
  <center style="margin-top: 15%;"><button  type="submit"  class="btn btn-primary btn-block btn_subm-small"  id="login_submit" >Sign In</button></center>
 
  <center> <div style="padding:10px;" class="login-bottom-font"><h6 >New to Jio Developer? <a href="/register" style="color: #133ab7;">Request Access</a></h6></div></center>

</form>
 <!--  <div><p style="color:red;">${message}</p></div>-->
 </div>
	

<div id="footer"></div>
   
</body>
</html>