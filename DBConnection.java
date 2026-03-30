import java.sql.*;
public class DBConnection
{
    public static Connection connect()
    {
        try {
            String url = "jdbc:postgresql://localhost:5432/company";
            String user = "postgres";
            String pass = "ABSnow@12feb";
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("Conenction failed: "+e);
            return null;
        }
        
    }
}