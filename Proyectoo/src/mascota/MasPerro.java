package mascota;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MasPerro extends Mascota implements InterfazComunicacion { // El implements es para agregar los métodos de  comunicación
	private static final String[] SKIN = new String[] { "/recursos/Perr.png" };
	//Constructor heredados
	public MasPerro(String especie, String nombre) {
		super(especie, nombre);
		// TODO Auto-generated constructor stub
	}
	//Acciones del objeto Perro
		// Metodo alimentar para el objeto Perro
	@Override
	public String alimentar() {
		if (getEstado() > 0) {
			int op = JOptionPane.showOptionDialog(null, "Con qué alimentarás al perro.", " Alimentar ",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
					new Object[] { "Agua", "Croquetas" }, "Agua");
			if (op == 0) {
				Icon icono6 = new ImageIcon (getClass().getResource("/recursos/Perro agua.jpg"));
				JOptionPane.showMessageDialog(null, "Bebiendo agua", "Alimentar", JOptionPane.PLAIN_MESSAGE, icono6);
				JOptionPane.showMessageDialog(null,
						"Tu perro ha bebido agua. Ha aumentado (5%) de vida y ha aumentado (3%) de ánimo");
				this.vida = this.vida + 5;
				this.estado = this.estado + 3;
			} else if (op == 1) {
				Icon icono7 = new ImageIcon (getClass().getResource("/recursos/Perro croquetas.jpg"));
				JOptionPane.showMessageDialog(null, "Comiendo croquetas Dog Chow ", "Alimentar", JOptionPane.PLAIN_MESSAGE, icono7);
				JOptionPane.showMessageDialog(null,
						"Tu perro ha comido media taza de croquetas Dog Chow. Ha aumentado (15%) de vida y ha aumentado (1%) de ánimo");
				this.vida = this.vida + 15;
				this.estado = this.estado + 1;
			} else {
				JOptionPane.showMessageDialog(null, "Ha cancelado la alimentación");

			}
		}

		return "";
	}
	//Metodo jugar para el objeto Perro
	@Override
	public String jugar() {
		if (getEstado() > 0) {
			int ju = JOptionPane.showOptionDialog(null, "Con qué jugará el perro.", "Jugar",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
					new Object[] { "Hueso", "Bola de plástico" }, "Hueso");
			if (ju == 0) {
				Icon icono8 = new ImageIcon (getClass().getResource("/recursos/perro hueso.jpg"));
				JOptionPane.showMessageDialog(null, "Jugando con el hueso", "Juego",JOptionPane.PLAIN_MESSAGE, icono8);
				JOptionPane.showMessageDialog(null, "Lo he enterrado :D");
				JOptionPane.showMessageDialog(null, "Tu perro ha enterrado el hueso ha aumentado (10%) de vida y (3%) de estado ");
				this.vida = this.vida + 10;
				this.estado = this.estado + 3;
			} else if (ju == 1) {
				Icon icono9 = new ImageIcon (getClass().getResource("/recursos/perro bola.jpg"));
				JOptionPane.showMessageDialog(null, "Jugando con la bola de plástico ", "Juego",JOptionPane.PLAIN_MESSAGE, icono9 );
				JOptionPane.showMessageDialog(null, "Se ha explotado la bola :(");
				JOptionPane.showMessageDialog(null,
						"Tu perro ha jugado con la bola de plástico, pero la ha destruido y ha disminuido(-2%) estado de ánimo, y (-10) de vida ");
				this.estado = this.estado - 2;
				this.vida = this.vida - 10;
			} else {
				JOptionPane.showMessageDialog(null, "Ha cancelado la diversión");

			}
		}
		return "";
	}
	// Método acariciar
		// polimorfismo de la clase Mascota
	@Override
	public String acariciar() {
		if (getEstado() > 0) {
			int ju = JOptionPane.showOptionDialog(null, "Acariciar.", "Acariciar",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
					new Object[] { "Si", "No" }, "Si");
			if (ju == 0) {
				Icon icono10 = new ImageIcon (getClass().getResource("/recursos/perro jugando.jpg"));
				JOptionPane.showMessageDialog(null, "Me gusta", "Acaricia", JOptionPane.PLAIN_MESSAGE, icono10);
				JOptionPane.showMessageDialog(null, "Tu perro le ha gustado(+5%)estado ");
				JOptionPane.showMessageDialog(null, "Moviendo cola");
				this.estado = this.estado + 5;
			} else if (ju == 1) {
				JOptionPane.showMessageDialog(null, "has preferido no acariciarlo");
			} else {
				JOptionPane.showMessageDialog(null, "Has cancelado la accion");

			}
		}
		return "";
	}
	// Método vida
	public void vida() {

		int b = 0;

		if (vida > b) {

			JOptionPane.showMessageDialog(null, "Tu mejor amigo esta vivo ");
		} else if (b >= vida) {

			JOptionPane.showMessageDialog(null, "Tu mejor amigo esta muerto");

		}

		JOptionPane.showMessageDialog(null, "perro : " + vida + "%");

	}
	// Método estado
	public void estado() {
		int a = 5;

		if (estado > a) {
			JOptionPane.showMessageDialog(null, "Tu mejor amigo está feliz");
		} else if (a >= estado) {
			JOptionPane.showMessageDialog(null, "Tu mejor amigo está triste");

		}

		JOptionPane.showMessageDialog(null, "perro: " + estado + "%");
	}
	public String ObtenerSkin(int s) {
		return SKIN[s];
	}

}
