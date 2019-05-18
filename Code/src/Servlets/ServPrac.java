import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HTTPServlet;
import javax.servlet.http.HTTPServletResponse;
import javax.servlet.http.HTTPServletRequest;

public class ServPrac extends HttpServlet{
  public void init(ServletConfig config) throws ServletException{
    String user = config.getInitParameter("user");
    ServletContext ctx = config.getServletContext();
    System.out.println("Serv "+ ctx.getInitParameter("global"));
  }

  public void destroy(){}

  public void doGet(HTTPServletResponse response, HttpServletRequest request) throws ServletException, IOException{
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<h1>HELLO</h1>");

    String a = request.getParameter("a");
    
  }
}
