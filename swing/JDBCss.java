package swing;

import java.sql.*;

public class JDBCss {
    Connection connect;
    Statement state;

    JDBCss(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/SLM","root", "hello@123456");
            state = connect.createStatement();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

