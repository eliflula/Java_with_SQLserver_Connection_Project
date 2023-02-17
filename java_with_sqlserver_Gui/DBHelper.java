package java_with_sqlserver_Gui;

import java.sql.*;

public class DBHelper {
    
    String constr = "jdbc:sqlserver://localhost; databaseName=VtyDB; user=sa; password=191020";
    
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(constr);
    }
    
    public void showErrorMessage(SQLException exception){
        System.out.println("error:"+exception.getMessage());
        System.out.println("error code:"+exception.getErrorCode());
    }
}
