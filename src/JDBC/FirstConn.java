package bin.jdbc;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

class FirstConn{
  private static final String url = "jdbc:mysql://localhost:8080/JDBCDB";
  private static final String user = "username";
  private static final String pwd = "password";

  public static void main(String[] args) {
    try{
      Class.forName("com.mysql.jdbc.Driver");
      Connection conn = DriverManager.getConnection(url, user, pwd);
      Statement stmt = conn.createStatement();
      System.out.println("Success");
    } catch(Exception e){
      e.printStackTrace();
    }
  }
}
