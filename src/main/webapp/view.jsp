
<%@page import="com.model.Book"%> 
<%@page import="java.util.List"%> 
<%@page import="java.util.ArrayList"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<!DOCTYPE html> 
<html> 
  <head> 
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
   <title>Book List</title> 
  </head> 
  <body style ="background-color: lightblue;"> 
     
      <center>
          <h1>Book List</h1> 
          <a href="add.jsp"><button>Add Book</button></a>
        </center> 
      <table border ="1" width="500" align="center"> 
         <tr bgcolor="00FF7F"> 
          <th><b>bookid</b></th> 
          <th><b>bookname</b></th> 
          <th><b>year</b></th> 
          <th><b>Edit Book</b></th> 
          <th><b>Delete Book</b></th> 
         </tr> 
        <%-- Fetching the attributes of the request object 
             which was previously set by the servlet  
              "viewController.java" 
        --%>  
        <%List<Book> book1 = (ArrayList<Book>)request.getAttribute("booklist"); 
        for(Book b:book1){%> 
      
            <tr> 
                <td><%=b.getBookid()%></td> 
                <td><%=b.getBookname()%></td> 
                <td><%=b.getYear()%></td> 
                <td><a href="edit.jsp?bookid=<%=b.getBookid()%>">Edit</a></td>
                <td> <a href="deleteController?bookid=<%=b.getBookid()%>">Delete</a></td> 
            </tr> 
            <%}%> 
        </table>
        <hr/> 
    </body> 
</html> 