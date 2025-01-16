import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteValue {
    public static void main(String[] args) throws Exception {

        String name= "Maurya";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_student?useSSL=false","root","root");

        PreparedStatement ps = con.prepareStatement("Delete from users_jdbc where name=? ");
        ps.setString(1,name);
        int i = ps.executeUpdate();
        if(i > 0){
            System.out.println("Data deleted successfully ");
        }else {
            System.out.println("fail");
        }
        con.close();
    }
}
