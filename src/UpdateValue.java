import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateValue {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello Siddharth !");


        String city ="Prayagraj";
        String email= "sidd98@gmail.com";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_student?useSSL=false","root","root");


        PreparedStatement ps= con.prepareStatement("update users_jdbc set city =? where email=?");

        ps.setString(1,city);
        ps.setString(2,email);

        int i = ps.executeUpdate();
        if(i>0){
            System.out.println("Table updated successfully .");
        }
        else{
            System.out.println("Fail");
        }
        con.close();
    }
}

