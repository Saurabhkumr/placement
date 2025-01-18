package jdbc;
import oracle.jdbc.proxy.annotation.Pre;

import java.sql.*;
import java.util.Scanner;

public class FirstProgram {
    public static void main(String[] args) throws Exception {
        String url="jdbc:mysql://localhost:3306/javadatabase";
        String uname="root";
        String pass="Saurabh@123";
        String query="select * from student";


         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection(url,uname,pass);
         Statement stm = con.createStatement();



        // insert data
//        PreparedStatement pstm = con.prepareStatement("insert into student values(?,?)");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the id : ");
//        int id = sc.nextInt();
//        sc.nextLine();
//        System.out.println("Enter the name : ");
//        String name = sc.nextLine();
//        pstm.setInt(1,id);
//        pstm.setString(2,name);
//        pstm.executeUpdate();


        //update

//        PreparedStatement pstm = con.prepareStatement("update student set studname='boss' where studid=4");
//        pstm.executeUpdate();



//          fetch data from database

         ResultSet rs = stm.executeQuery(query);

         while (rs.next()){
             int i = rs.getInt(1);
             String n = rs.getString(2);
             System.out.println("Id : "+i+"  "+"Name : "+n);
         }


         stm.close();
         con.close();
//          pstm.close();
          rs.close();
    }
}
