package Function;
import School.Student;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class function {
    public void addProfile(){

    }
    public void printOut(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/school?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root","");
                Statement stmt = conn.createStatement();
                ){
            ResultSet rset = stmt.executeQuery("select * from student");
            ResultSetMetaData rsetMD = rset.getMetaData();
            int numColumns = rsetMD.getColumnCount();
            for (int i = 1;i <= numColumns; i++ ){
                System.out.printf("%-30s",rsetMD.getColumnName(i));
            }
            System.out.println();
            while (rset.next()){
                for (int i = 1; i <= numColumns; i++){
                    System.out.printf("%-30s",rset.getString(i));
                }
                System.out.println();
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }


    public void Save(){

    }



}
