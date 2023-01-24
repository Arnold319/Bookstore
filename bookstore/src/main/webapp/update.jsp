<%@page import="com.js.dto.Book"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>ENTER DETAILS TO UPDATE</h1>
<% Book b= (Book) request.getAttribute("book"); %>
<form action="update2">
BOOK ID: <input type="number" name="id" value="<%=b.getBook_id()%>" readonly="readonly"> <br>
BOOK NAME: <input type="text" name="name" value="<%=b.getBook_name()%>">  <br>
AUTHOR NAME: <input type="text" name="aname" value="<%=b.getAuthor_name()%>">  <br>
NO OF PAGES: <input type="number" name="pages" value="<%=b.getNo_of_pages()%>">  <br>
PRICE: <input type="text" name="price" value="<%=b.getPrice()%>">  <br>
<input type="submit" value="update">
</form>
</body>
</html>