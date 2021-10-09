package database.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SingletonConnection {

    private static SingletonConnection instance;

    private Connection connection;
    String url = "jdbc:mysql://localhost:3306/" + System.getenv("PROJECT_NAME") +
            "?" +
            "useUniCode=yes" +
            "&" +
            "characterEncoding=UTF-8";

    SingletonConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, System.getenv("USERNAME"), System.getenv("PASSWORD"));
            System.out.println("Database connected!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Database connection failed: " + e.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static SingletonConnection getInstance() {
        try {
            if (instance == null) {
                try {
                    instance = new SingletonConnection();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else if (instance.getConnection().isClosed()) {
                instance = new SingletonConnection();
            }
            return instance;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return instance;
    }

    public boolean databaseIsConnected() {
        return instance != null;
    }
}

