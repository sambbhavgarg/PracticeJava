package com.rt;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Serv2
 */
public class Serv2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection conn=null;
	Statement stmt=null;
	/**
  * @see HttpServlet#HttpServlet()
  */
  public Serv2() {
      super();
      // TODO Auto-generated constructor stub
  }


  @Override
  public void init(ServletConfig config) throws ServletException {
  	// TODO Auto-generated method stub
  	String user=config.getInitParameter("user");
  	System.out.println(user);

  	ServletContext ctx=config.getServletContext();
  	System.out.println("From serv2"+ctx.getInitParameter("global"));
    try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","admin");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    try {
			stmt=conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();

		//stmt.executeQuery("insert into abc values"+request.getParameter("name")+","+)" +

		ResultSet rs;
		try {
			rs = stmt.executeQuery("select * from bao1");
			while(rs.next())
			{
				out.println(rs.getInt(1)+" "+rs.getString(2)+"<br>");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
}
