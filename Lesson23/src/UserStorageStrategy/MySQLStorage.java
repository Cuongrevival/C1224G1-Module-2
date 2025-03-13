package UserStorageStrategy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySQLStorage implements UserStorage {
    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    @Override
    public void store(User user) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO users (name, age) VALUES (?, ?)");) {
            stmt.setString(1, user.getName());
            stmt.setInt(2, user.getAge());
            stmt.executeUpdate();
            System.out.println("User stored in MySQL database.");
        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
        }
    }
}
