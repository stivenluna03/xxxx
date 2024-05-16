package igu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexionMysql {
    private static final String URL = "jdbc:mysql://localhost:3306/biblioteca";
    private static final String USER = "stiven";
    private static final String PASSWORD = "papichulo";
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void main(String[] args) {
        try {
            Connection connection = getConnection();
            if (connection != null) {
                System.out.println("Conexión exitosa a la base de datos.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al conectar con la base de datos.");
        }
    }
}
