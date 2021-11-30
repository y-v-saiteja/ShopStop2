package com.coforge.training.shopstop2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShopStop
 */
@WebServlet("/ShopStop")
public class ShopStop extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShopStop() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		// write the message on the web page
		PrintWriter out=response.getWriter();
		
		String comments=request.getParameter("txtcomment");
		String items=request.getParameter("rbitems");
		String s=request.getParameter("survey");
		out.println("<html>");
		out.println("<head><title>ShopStop</title></head>");
		out.println("<body bgcolor=\"#00ffff\">");
		out.println("<H1>"+ s + "</H1></BR>");
		out.println("Congratulations, you are qualified for our lucky draw");
		out.println("<br/>");
		out.println("Your comments: " +comments);
		out.println("<br/>");
		out.println("Number of items purchased : " + items);
		out.println("<br/>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
