package sistemahospital;

import java.sql.Connection;

public class Conexion {
    String bd="";
    String url="jdbc:mysqsl://localhost:3306/";
    String user="root";
    String password="";
    String driver="com.mysql.cj.jdbc.Driver";
    Connection cx;
}
