package mascota;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MasOso extends Mascota implements InterfazComunicacion {// El implements es para agregar los métodos de
																		// comunicación
	private static final String[] SKIN = new String[] { "/recursos/panda.png" };	
	// Constructor heredado
	public MasOso(String especie, String nombre) {
		super(especie, nombre);
		// TODO Auto-generated constructor stub
	}

	// Acciones del objeto Oso
	// Metodo alimentar para el objeto Oso
	@Override
	public String alimentar() {
		if (getEstado() > 0) {
			int op = JOptionPane.showOptionDialog(null, "Con qué alimentarás al oso", " Alimentar ",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
					new Object[] { "Focas", "Peces" }, "Agua");
			if (op == 0) {
				Icon icono11 = new ImageIcon (getClass().getResource("/recursos/oso foca.jpg"));
				JOptionPane.showMessageDialog(null, "Devorando foca bebe", "Alimentar", JOptionPane.PLAIN_MESSAGE, icono11);
				JOptionPane.showMessageDialog(null,
						"Tu oso ha devorado una foca. Ha aumentado (15%) de vida y ha aumentado (4%) de ánimo");
				this.vida = this.vida + 15;
				this.estado = this.estado + 4;
			} else if (op == 1) {
				Icon icono12 = new ImageIcon (getClass().getResource("/recursos/oso pez.png"));
				JOptionPane.showMessageDialog(null, "Devorando peces ", "Alimentar", JOptionPane.PLAIN_MESSAGE, icono12);
				JOptionPane.showMessageDialog(null,
						"Tu oso ha devorado unos peces. Ha aumentado (5%) de vida y ha aumentado (1%) de ánimo");
				this.vida = this.vida + 5;
				this.estado = this.estado + 1;
			} else {
				JOptionPane.showMessageDialog(null, "Ha cancelado la alimentación");

			}
		}

		return "";
	}

	// Metodo jugar para el objeto Oso
	@Override
	public String jugar() {
		if (getEstado() > 0) {
			int ju = JOptionPane.showOptionDialog(null, "Con qué jugará el oso.", "Jugar",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
					new Object[] { "Madre", "nieve" }, "Hueso");
			if (ju == 0) {
				Icon icono13 = new ImageIcon (getClass().getResource("/recursos/oso cria.jpg"));
				JOptionPane.showMessageDialog(null, "Jugando con mi madre", "Juego", JOptionPane.PLAIN_MESSAGE, icono13);
				JOptionPane.showMessageDialog(null, "Que divertido jugar con mi madre :D");
				JOptionPane.showMessageDialog(null,
						"Tu oso polar ha jugado con su madre y ha aumentado (10%) de vida y (3%) de estado ");
				this.vida = this.vida + 10;
				this.estado = this.estado + 3;
			} else if (ju == 1) {
				Icon icono14 = new ImageIcon (getClass().getResource("/recursos/oso nieve.jpg"));
				JOptionPane.showMessageDialog(null, "Jugando con la nieve", "Juego", JOptionPane.PLAIN_MESSAGE, icono14);
				JOptionPane.showMessageDialog(null, "Se ha derretido :(");
				JOptionPane.showMessageDialog(null,
						"Tu oso ha jugado con la nieve, pero se ha derretido y ha disminuido(-4%) estado de ánimo, y (-1) de vida ");
				this.estado = this.estado - 4;
				this.vida = this.vida - 1;
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
			int ju = JOptionPane.showOptionDialog(null, "Tu oso quiere que lo acaricies, ¿aceptas?", "Acariciar",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Si", "No" },
					"Si");
			if (ju == 0) {
				Icon icono15 = new ImageIcon (getClass().getResource("/recursos/oso acariciado.jpg"));
				JOptionPane.showMessageDialog(null, "A tu oso le ha gustado", "acariciar", JOptionPane.PLAIN_MESSAGE, icono15 );
				JOptionPane.showMessageDialog(null, "Tu oso está feliz (+7%)estado ");
				JOptionPane.showMessageDialog(null, "Te da un abrazo de oso");
				this.estado = this.estado - 2;
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

			JOptionPane.showMessageDialog(null, "Tu oso esta vivo ");
		} else if (b >= vida) {

			JOptionPane.showMessageDialog(null, "Tu oso esta muerto");

		}

		JOptionPane.showMessageDialog(null, "Oso : " + vida + "%");

	}

	// Método estado
	public void estado() {
		int a = 5;

		if (estado > a) {
			JOptionPane.showMessageDialog(null, "Tu oso está feliz");
		} else if (a >= estado) {
			JOptionPane.showMessageDialog(null, "Tu oso está triste");

		}

		JOptionPane.showMessageDialog(null, "Oso: " + estado + "%");
	}
	public String ObtenerSkin(int s) {
		return SKIN[s];
	}
}
