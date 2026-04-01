import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {

        Connection con = null;

        try {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://localhost:5432/company";
            String user = "postgres";
            String password = "your_password"; // 🔴 change this

            con = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            System.out.println("Connection failed: " + e);
        }

        return con;
    }
}
