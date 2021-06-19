package mascota;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MasLobo extends Mascota implements InterfazComunicacion { // El implements es para agregar los métodos de
																		// comunicación
	private static final String[] SKIN = new String[] { "/recursos/lobo.png", "/recursos/Gato.png" };

//Constructor heredado de la clase padre Mascota
	public MasLobo(String especie, String nombre) {
		super(especie, nombre);
		// TODO Auto-generated constructor stub
	}

	// Acciones del objeto Lobo
	// Metodo alimentar
	@Override
	public String alimentar() {
		if (getEstado() > 0) {
			int op = JOptionPane.showOptionDialog(null, "Con qué alimentarás al lobo.", "Alimentar",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
					new Object[] { "Agua", "Carne" }, "venado");
			if (op == 0) {
				Icon icono16 = new ImageIcon (getClass().getResource("/recursos/lobo agua.jpg"));
				JOptionPane.showMessageDialog(null, "Bebiendo agua", "Alimentar", JOptionPane.PLAIN_MESSAGE, icono16);
				JOptionPane.showMessageDialog(null,
						"Tu lobo ha bebido agua. Ha aumentado (20%) de vida y ha aumentado (5%) de ánimo");
				this.vida = this.vida + 20;
				this.estado = this.estado + 2;
			} else if (op == 1) {
				Icon icono17 = new ImageIcon (getClass().getResource("/recursos/lobo carne.jpg"));
				JOptionPane.showMessageDialog(null, "Comiendo carne ", "Alimentar", JOptionPane.PLAIN_MESSAGE, icono17);
				JOptionPane.showMessageDialog(null,
						"Tu lobo ha comido la carne de un venado. Ha aumentado (20%) de vida y ha aumentado (5%) de ánimo");
				this.vida = this.vida + 20;
				this.estado = this.estado + 5;
			} else {
				JOptionPane.showMessageDialog(null, "Ha cancelado la alimentación");

			}

		}
		return "";
	}

	// Metodo jugar para el objeto lobo
	@Override
	public String jugar() {

		if (getEstado() > 0) {
			int ju = JOptionPane.showOptionDialog(null, "Con qué jugara el lobo.", "Jugar",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
					new Object[] { "Crías", "Manada" }, "Lana");
			if (ju == 0) {
				Icon icono18 = new ImageIcon (getClass().getResource("/recursos/lobo cria.jpg"));
				JOptionPane.showMessageDialog(null, "Jugando las crías", "Jugar",JOptionPane.PLAIN_MESSAGE, icono18);
				JOptionPane.showInternalMessageDialog(null, "Me cansé");
				JOptionPane.showMessageDialog(null, "El lobo a jugado con sus crías a restado(-5%) vida y (-2%) ánimo");
				this.vida = this.vida - 5;
				this.estado = this.estado - 2;
			} else if (ju == 1) {
				Icon icono19 = new ImageIcon (getClass().getResource("/recursos/Lobo manada.jpg"));
				JOptionPane.showMessageDialog(null, "Jugando con la manada", "Jugar",JOptionPane.PLAIN_MESSAGE, icono19 );
				JOptionPane.showInternalMessageDialog(null, "Se ha disuelto la manada:/");
				JOptionPane.showMessageDialog(null,
						"El lobo a jugado con la manada pero se ha disuelto, a restado (6) de ánimo");
				this.estado = this.estado - 6;
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
			int ju = JOptionPane.showOptionDialog(null, "¿Te arriesgas a acariciarlo?.", "Acariciar",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Si", "No" },
					"Si");
			if (ju == 0) {
				Icon icono20 = new ImageIcon (getClass().getResource("/recursos/lobo mordiendo.jpg"));
				JOptionPane.showMessageDialog(null, "Te muerdo si lo haces", "Acariciar", JOptionPane.PLAIN_MESSAGE, icono20);
				JOptionPane.showMessageDialog(null, "Tu lobo se ha enojado (-2%)estado ");
				JOptionPane.showMessageDialog(null, "Te muestra los colmillos ");
				this.estado = this.estado - 2;
			} else if (ju == 1) {
				JOptionPane.showMessageDialog(null, "has preferido no acariciarlo por tu bien");
			} else {
				JOptionPane.showMessageDialog(null, "Has cancelado la accion");

			}
		}
		return "";
	}

//Método vida
	public void vida() {

		int b = 0;

		if (vida > b) {

			JOptionPane.showMessageDialog(null, "Tu lobo está vivo ");
		} else if (b >= vida) {

			JOptionPane.showMessageDialog(null, "Tu lobo esta muerto");

		}

		JOptionPane.showMessageDialog(null, "Vida: " + vida + "%");

	}

//Método estado
	public void estado() {
		int a = 5;

		if (estado > a) {
			JOptionPane.showMessageDialog(null, "Tu lobo está feliz");
		} else if (a >= estado) {
			JOptionPane.showMessageDialog(null, "Tu lobo está triste");

		}

		JOptionPane.showMessageDialog(null, "Estado de ánimo: " + estado + "%");
	}

	public String ObtenerSkin(int s) {
		return SKIN[s];
	}
}
