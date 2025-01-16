import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertValue {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Siddharth !");

        String name="Ramesh";
        String email="ramesh67@gmail.com";
        String pass= "ramesh123";
        String gender="male";
        String city="KarveNager";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_student?useSSL=false","root","root");

        PreparedStatement ps = con.prepareStatement("insert into users_jdbc(name,email,password,gender,city) values(?,?,?,?,?)");
        ps.setString(1,name);
        ps.setString(2,email);
        ps.setString(3,pass);
        ps.setString(4,gender);
        ps.setString(5,city);

        int i = ps.executeUpdate();
        if(i>0){
            System.out.println("Value Added in Database Sucessfully;");
        }
        else{
            System.out.println("Fail !");
        }
        con.close();
    }
}