
package conexion;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;



public class ConexionBBDD {
  private Statement s;
  private Connection conexion;
  
  
  public ConexionBBDD () throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.jdbc.Driver");
    this.conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiendamoviles","admin", "admin");
    this.s = conexion.createStatement();
  }
  
  
    public ResultSet consultaDatos (String s) throws SQLException {
    return this.s.executeQuery(s);
  }
  
  public boolean ejecutaSQL (String s) throws SQLException {
    this.s.execute(s);
    return true;
  }
  
 }

