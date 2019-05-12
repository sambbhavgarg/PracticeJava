//package bin.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Serv1
 */

public class Serv1 extends HttpServlet {
			private static final long serialVersionUID = 1L;

	    /**
	    * @see HttpServlet#HttpServlet()
	    */

    	public Serv1(){
        super();

        System.out.println("I am in constructor");
        // TODO Auto-generated constructor stub
    	}

			/**
			 * @see Servlet#init(ServletConfig)
			*/

			public void init(ServletConfig config) throws ServletException {
				//TODO Auto-generated method stub
				System.out.println("I am in init");
				String user =	config.getInitParameter("user");
				System.out.println("User is: "+user);

				ServletContext ctx = config.getServletContext();
				System.out.println("From serv1" + ctx.getInitParameter("global"));
			}

			/**
			 * @see Servlet#destroy()
			 */
			public void destroy(){
				// TODO Auto-generated method stub
				System.out.println("I am in destroy");
			}

			/**
			 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
			 */
			 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				// TODO Auto-generated method stub
				response.setContentType("text/html");
				PrintWriter out=response.getWriter();
				out.println("<h1> Hello! </h1>" + new Date());

				String a=request.getParameter("a");

				for(int i=1;i<=10;i++){
					out.println(a+" X "+i+" = "+i*Integer.parseInt(a)+"<br>");
				}
			}

			/**
			 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
			*/
		 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			 // TODO Auto-generated method stub
			 System.out.println("I am in doPost");
		 }
	}
