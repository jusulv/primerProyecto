package principal;

import conexion.BasAnimal;
import mascota.Mascota;
import skin.Inicio;

public class Principal {

//Clase para la ejecucion del programa
	public static void main(String[] args) {
		new Inicio().frame.setVisible(true);
	}

	public static Mascota cargarMascota(String especie) {
		return BasAnimal.consultarMascota(especie);
	}

}
