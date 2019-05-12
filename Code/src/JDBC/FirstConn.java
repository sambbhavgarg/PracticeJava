package bin.jdbc;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

class FirstConn{
  private static final String url = "jdbc:mysql://localhost:3306/JDBCDB";
  private static final String user = "sambbhav";
  private static final String pwd = "Sambbhav@123";

  public static void main(String[] args){
    try{
      Class.forName("com.mysql.jdbc.Driver");// Type 1 Driver: sun.jdbc.odbc.JdbcOdbcDriver;
      Connection conn = DriverManager.getConnection(url,user,pwd);
      //Interface Connection
      //getConnection overriden in 3 ways
      //->getConnection(<url>);
      //->getConnection(<url>,<username>,<pwd>);
      //->getConnection(<url>,<properties>);
      Statement stmt = conn.createStatement();//overriden in 3 ways
      //Interface Statement

      // PreparedStatement pstmt = conn.prepareStatement("insert into TEST values(?,?,?)");
      // pstmt.setInt(1,14082000);
      // pstmt.setString(2,"Samarth");
      // pstmt.setString(3,"Singh");
      // pstmt.execute();

      // CallableStatement cstmt = conn.prepareCall("(call myFun(?,?,?))");
      // cstmt.setInt(1,14082000);
      // cstmt.setString(2,"Samarth");
      // cstmt.setString(3,"Singh");
      // cstmt.execute();

      int i = stmt.executeUpdate("insert into TEST values(4,'SUV', 'JAI')");//DDL,DML returns integer
      System.out.println(i);

      ResultSet rs = stmt.executeQuery("SELECT * FROM TEST");//DQL returns ResultSet
      while(rs.next()){
        System.out.println(rs.getInt("ID")+" "+rs.getString("NAME")+" "+rs.getString("LNAME"));
      }
      System.out.println("Success");
      stmt.close();
      conn.close();
    } catch(Exception e){
      e.printStackTrace();//prints the whole stack of errors
    }
  }
}
