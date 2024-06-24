import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class ConexionM {
    
    public static void main(String[] args) {
        

        //
        String url = "jdbc:mysql://localhost:3306/objeto?useSSL=false&useTimezone=true&serverTimezon=UTC&allowPublicKeyRetrieval=true";

        //Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(url,"root","main");
        Statement instruccion = connection.createStatement();
        var sql = "SELECT nombre FROM persona";
        //ResultSet resultSet =  instruccion.execute(sql);

        // while (resultSet.next()) {
        //     System.out.println("nombre persona : " + resultSet.getString("url"));
        // }


    }
}
