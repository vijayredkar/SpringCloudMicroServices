
<%@include file="header.jsp" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js" > </script>
 <script >
 window.onload = function() {
     // ...
     
     var test = <%=request.getAttribute("result")%>;
     
     //alert("test "+test);
     
     console.log("test  "+test);
     if(test == 2)
    	 showPopup("register_user_success");
     
     else if (test)
      showPopup("login_submit");
 }
 </script>
  
    <link href="/css/popup.css" rel="stylesheet">
       
</head>
<body style="background:#ededed;">
<div id="header"></div>
<!--Remaining section-->

 <div class="form-container-small">
 <center>
 <h4 class="form-heading">Login to your account</h4>
 </center>
 <center><span class="login_sub_title">Sign In or Request Access to see full content of the portal</span></center>
   <form class="main_form" id="loginForm" modelAttribute="login" action="loginProcess" method="post">
 
 <div class="form-group">
    <input type="text" class="form-col" id="username" name="username" placeholder="Email ID" required>
  </div>
  
  <div class="form-group">
    <input type="password" class="form-col" id="password" name="password" placeholder="Password" required>
    <a  style="float:right;padding:10px;cursor:pointer;color: #133ab7;" id="reset_pasw_btn" onclick="redirectPageForforgot(this.id)">Forgot Password?</a>
  </div>
  
  <center style="margin-top: 15%;"><button  type="submit"  class="btn btn-primary btn-block btn_subm-small"  id="login_submit" >Sign In</button></center>
 
 
  <center> <div style="padding:10px;" class="login-bottom-font"><h6 >New to Jio Developer? <a href="/register" style="color: #133ab7;">Request Access</a></h6></div></center>

</form>
 <!--  <div><p style="color:red;">${message}</p></div>-->
 </div>
	

<div id="footer"></div>

<footer>
<%@include file="footer.jsp" %>
</footer>

   
</body>
</html>