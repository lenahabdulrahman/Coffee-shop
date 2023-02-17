package OperationPackages;

import java.sql.*;

public class DBConnect {

    public static Connection DBConnect() {

        try {

            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/coffe_db", "root", "");
            return conn;

        } catch (Exception ex) {

            System.out.println("Erro: " + ex);
            return null;
        }

    }

}
