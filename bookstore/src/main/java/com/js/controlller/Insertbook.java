package com.js.controlller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.js.dao.BookCRUD;
import com.js.dto.Book;
@WebServlet (value="/insert")
public class Insertbook extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 Book b=new	Book();
 b.setBook_id(Integer.parseInt(req.getParameter("id")));
 b.setBook_name(req.getParameter("name"));
 b.setAuthor_name(req.getParameter("aname"));
 b.setNo_of_pages(Integer.parseInt(req.getParameter("pages")));
 b.setPrice(Integer.parseInt(req.getParameter("price")));
 
 BookCRUD bc = new BookCRUD();
 int result = bc.insertBook(b);
 if (result>0) {
	RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
	req.setAttribute("msg", "INSERTED SUCCESFULLY");
	rd.forward(req, resp);
} else {
	RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
	req.setAttribute("msg", "FAILED TO INSERT");
	rd.forward(req, resp);
}
 
}
}
