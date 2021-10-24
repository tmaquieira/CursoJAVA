package pruebas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PruebasDB {

	public PruebasDB() {
	}

	public static void main(String[] args) {
		try {
			//1 Drive Manager
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2 Connection String
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/curso_java", "root", "root");
			//3 de la conexión obtengo la sentencia 
			Statement stm = con.createStatement();
			//4 recupero los datos en un Result set
			ResultSet rs = stm.executeQuery("select dni, nombre from empleados order by nombre desc");
			//5 imprimo el resultset
			while(rs.next()) {
				System.out.println("DNI = "+rs.getInt("dni")+", Nombre = "+rs.getString("nombre"));
			}
			System.out.println("Me pude conectar, todo bien :)");
		} catch (ClassNotFoundException e) {
			System.out.println("Mepa que no está todo bien, no encontró el Driver");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Mepa que no está todo bien, no encontró la BDD o hubo un error en user y pass");
			e.printStackTrace();
		}
		
	}

}
