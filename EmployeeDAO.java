import java.sql.*;
public class EmployeeDAO {

    public void insertEmployee(String name, int salary){
        try {
            Connection conn = DBConnection.connect();
            String query = "INSERT INTO employee(name,salary) VALUES (?,?)";

            PreparedStatement ps = conn.prepareStatement(query);

            ps.setString(1, name);
            ps.setInt(2, salary);

            ps.executeUpdate();

            System.out.println("Employee Added successfully");


        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}