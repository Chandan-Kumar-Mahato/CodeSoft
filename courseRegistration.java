import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class courseRegistration {
    public static void main(String[] args){
        courseRegistration obj1 = new courseRegistration();
        obj1.createConnection();
    }
    void createConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_hr", "root", "admin");
            System.out.println("Database connection success");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(courseRegistration.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

