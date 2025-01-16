import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectValue {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_student?useSSL=false", "root", "root");

        PreparedStatement ps = con.prepareStatement("Select * from users_jdbc");
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            System.out.println("Name  :" + rs.getString("name"));
            System.out.println("email : " + rs.getString("email"));
            System.out.println("password :" + rs.getString("password"));
            System.out.println("Gender :" + rs.getString("gender"));
            System.out.println("City :" + rs.getString("city"));
            System.out.println();
        }
        con.close();
    }
}
