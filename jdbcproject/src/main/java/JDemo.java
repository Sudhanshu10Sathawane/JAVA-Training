//import java.sql.Connection;
//import java.sql.PreparedStatement;
//
//import java.sql.DriverManager;
//
//import java.sql.Statement;
//
//public class JDemo {
//
// public static void main(String[] args) throws Exception
//
// {
//
// Class.forName("com.mysql.cj.jdbc.Driver");
//
// Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gl", "root", "root");
//
// Statement st=con.createStatement();
//
// String query;
//
//
// query="update employ set sal=25000 where eno=10";
// int i=st.executeUpdate(query);
//
// if(i>0)
//
// {
//
//  System.out.println("success");
//
// }
// query="insert into employ values(?,?,?)";
//
// PreparedStatement ps=con.prepareStatement(query);
//
// ps.setInt(1, 22);
//
// ps.setString(2, "amit");
//
// ps.setDouble(3, 8500.55);
// i=0;
// i=ps.executeUpdate();
//
//  if(i>0)
//
//  {
//
//  System.out.println("success");
//
//  }
//  query="update employ set sal=? where eno=?";
//
//  ps=con.prepareStatement(query);
//
//  ps.setDouble(1, 15000);
//
//  ps.setInt(2, 22);
//  i=0;
//   i=ps.executeUpdate();
//
//   if(i>0)
//
//   {
//
//   System.out.println("success");
//
//   }
//   query="delete from employ where eno=?";
//
//    ps=con.prepareStatement(query);
//
//    ps.setInt(1, 22);
//
//   int i=ps.executeUpdate();
//
//    if(i>0)
//
//    {
//
//    System.out.println("success");
//
//    }
//
//  }
// }
//
import java.sql.CallableStatement;

import java.sql.Connection;

import java.sql.DriverManager;

public class JDemo {

 public static void main(String[] args) throws Exception

 {

 Class.forName("com.mysql.cj.jdbc.Driver");

 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gl", "root", "root");

 CallableStatement cs=con.prepareCall("call simple(?,?,?)");

 cs.setInt(1, 555);

 cs.setString(2, "dinesh");

 cs.setFloat(3, 28000);

 cs.execute();

 System.out.println("success");

 }

}
