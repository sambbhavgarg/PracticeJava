package bin.jdbc;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

class FirstConn{
  private static final String url = "jdbc:mysql://localhost:3306/JDBCDB";
  private static final String user = "sambbhav";
  private static final String pwd = "Sambbhav@123";

  public static void main(String[] args) {
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

      //PreparedStatement pstmt conn.preparedStatement(insert into TEST values(?,?,?));
      // stmt.setInt(1,14082000);
      // stmt.setString(2,'Samarth');
      // stmt.setString(3,'Singh');
      // stmt.execute();

      //CallableStatement cstmt = conn.callableStatement("(call myFun(?,?,?))");
      // stmt.setInt(1,14082000);
      // stmt.setString(2,'Samarth');
      // stmt.setString(3,'Singh');
      // stmt.execute();

      //int i = stmt.executeUpdate("CREATE TABLE TEST1 (ID INT, NAME VARCHAR(20))");//DDL,DML returns integer

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
