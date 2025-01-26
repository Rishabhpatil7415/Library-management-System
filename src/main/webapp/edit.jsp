<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit book JSP</title>
</head>
<body>

<body style ="background-color: lightblue;">


 <form action="editController"  method="post" style="margin: 0 auto; width: 50%;">
 <h2>Library management System</h2>
  <div>
    <input type="hidden" name="bookid" value="<%=request.getParameter("bookid")%>"></index>
      </div>
  <div>
    <lable>Bookname :</lable><input type="text" name="bookname"></index>
  </div>
<br><br>
 <div>
   <lable>year :</lable><input type="test" name="year"></index>
 </div>
<br><br>
<div>
 <lable>Submit :</lable><button>Submit</button>
</div>
  </form>
</body>
</html>