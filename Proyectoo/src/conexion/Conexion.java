package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conexion {
	static Connection con = null;
	static String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
	static String url = "jdbc:ucanaccess://C:\\Users\\Acer\\Documents\\animales.accdb";

//Método para conectar con la base de datos
	public static Connection conectar() {
		try {
			if (con == null) {
				Class.forName(driver);
				con = DriverManager.getConnection(url);
				JOptionPane.showMessageDialog(null, "Conexión establecida");

			}
		} catch (Exception e) {
			e.printStackTrace();
			con = null;
		}
		return con;
	}

//Método desconectar de la base de datos
	public static void desconectar() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
