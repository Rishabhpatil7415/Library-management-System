<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style ="background-color: lightblue;">
<form action="registerController"   style="margin: 0 auto; width: 50%;">
 <h2>Library management System</h2>
 
  <div>
    <lable>username :</lable><input type="text" name="username"></index>
  </div>
<br><br>
 <div>
   <lable>password :</lable><input type="text" name="password"></index>
 </div>
<br><br>
 <div>
   <lable>mobile :</lable><input type="text" name="mobile"></index>
 </div>
<br><br>
 <div>
   <lable>address :</lable><input type="text" name="address"></index>
 </div>
<br><br>
   <input type="hidden" name="role" value="<%=request.getParameter("role")%>"></index>
<div>
 <lable>Submit :</lable><button>Submit</button>
</div>
  </form>

</body>
</html>