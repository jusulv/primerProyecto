package conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import mascota.MasGato;
import mascota.MasLobo;
import mascota.MasOso;
import mascota.MasPerro;
import mascota.Mascota;

public class BasAnimal extends Conexion {

	// Método para consultar los registros creados en la base de datos

	public static Mascota consultarMascota(String especie) {
		Connection conexion = conectar();

		String sql = "SELECT especie, nombre FROM animales WHERE especie = ?" ;
		try {
			PreparedStatement consulta = conexion.prepareStatement(sql);
			consulta.setString(1, especie);
			ResultSet result = consulta.executeQuery();
			/* */
			while(result.next()) {
				//System.out.println(result.getString("especie"));
				switch(especie){
				case "gato":
					return new MasGato(result.getString("especie"), result.getString("nombre"));
				case "lobo":
					return new MasLobo(result.getString("especie"), result.getString("nombre"));
				case "perro":
					return new MasPerro(result.getString("especie"), result.getString("nombre"));
				case "oso":
					return new MasOso(result.getString("especie"), result.getString("nombre"));
				}
					
			}
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	
	
}
