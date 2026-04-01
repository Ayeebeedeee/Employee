import java.sql.*;

public class EmployeeDAO {

    // 🔹 INSERT
    public void insertEmployee(String name, int salary) {
        try {
            Connection con = DBConnection.getConnection();

            String query = "INSERT INTO employee(name, salary) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, name);
            ps.setInt(2, salary);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee Added Successfully");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // 🔹 FETCH
    public void getEmployee() {
        try {
            Connection con = DBConnection.getConnection();

            String query = "SELECT * FROM employee";
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            System.out.println("\n--- Employee List ---");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int salary = rs.getInt("salary");

                System.out.println(id + " | " + name + " | " + salary);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // 🔹 UPDATE
    public void updateEmployee(int id, String name, int salary) {
        try {
            Connection con = DBConnection.getConnection();

            String query = "UPDATE employee SET name = ?, salary = ? WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, name);
            ps.setInt(2, salary);
            ps.setInt(3, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee Updated Successfully");
            } else {
                System.out.println("Employee Not Found");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // 🔹 DELETE
    public void delEmployee(int id) {
        try {
            Connection con = DBConnection.getConnection();

            String query = "DELETE FROM employee WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee Deleted Successfully");
            } else {
                System.out.println("Employee Not Found");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
