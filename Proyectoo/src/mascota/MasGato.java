package mascota;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MasGato extends Mascota implements InterfazComunicacion { // El implements es para agregar los métodos de  comunicación
	private static final String[] SKIN = new String[] { "/recursos/Gato.png" };															

	// Constructor heredado
	public MasGato(String especie, String nombre) {
		super(especie, nombre);
		// TODO Auto-generated constructor stub
	}
//Acciones del objeto Gato
	// Metodo alimentar para el objeto Gato
	@Override
	public String alimentar() {
		if (getEstado() > 0) {
			int op = JOptionPane.showOptionDialog(null, "Con qué alimentarás al gato.", "Alimentar",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
					new Object[] { "Leche", "Atún" }, "Agua");
			if (op == 0) {
				Icon icono2 = new ImageIcon (getClass().getResource("/recursos/gato  leche.jpg"));
				JOptionPane.showMessageDialog(null, "Bebiendo leche","Comida", JOptionPane.PLAIN_MESSAGE, icono2 );
				JOptionPane.showMessageDialog(null,
						"Tu gato ha bebido leche. Ha aumentado (10%) de vida y ha aumentado (2%) de ánimo");
				this.vida = this.vida + 10;
				this.estado = this.estado + 2;
			} else if (op == 1) {
				Icon icono = new ImageIcon (getClass().getResource("/recursos/Gato atun.png"));
				JOptionPane.showMessageDialog(null, "Comiendo atún ", "Comida", JOptionPane.PLAIN_MESSAGE, icono);
				
				JOptionPane.showMessageDialog(null,
						"Tu gato ha comido una lata de atún. Ha aumentado (10%) de vida y ha aumentado (1%) de ánimo");
				this.vida = this.vida + 10;
				this.estado = this.estado + 1;
			} else {
				JOptionPane.showMessageDialog(null, "Ha cancelado la alimentación");

			}

		}
		return "";
	}

//Metodo jugar para el objeto gato
	@Override
	public String jugar() {

		if (getEstado() > 0) {
			int ju = JOptionPane.showOptionDialog(null, "Con qué jugara el gato.", "Jugar",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
					new Object[] { "Ratón", "Bola de estambre" }, "Lana");
			if (ju == 0) {
				Icon icono3 = new ImageIcon (getClass().getResource("/recursos/gato raton.jpg"));
				JOptionPane.showMessageDialog(null, "Jugando con el ratón", "Juego", JOptionPane.PLAIN_MESSAGE, icono3);
				JOptionPane.showInternalMessageDialog(null, "Se me escapó");
				JOptionPane.showMessageDialog(null, "Tu gato a jugado con el ratón a restado(-10%) vida y (-4%) ánimo");
				this.vida = this.vida - 10;
				this.estado = this.estado - 4;
			} else if (ju == 1) {
				Icon icono4 = new ImageIcon (getClass().getResource("/recursos/gato bola.jpg"));
				JOptionPane.showMessageDialog(null, "Jugando con bola de estambre","Juego", JOptionPane.PLAIN_MESSAGE, icono4);
				JOptionPane.showInternalMessageDialog(null, "Se ha destruido :C");
				JOptionPane.showMessageDialog(null,
						"Tu gato a jugado con la bola de estambre pero la ha destruido, a restado (-2%) de ánimo");
				this.estado = this.estado - 2;
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
			int ju = JOptionPane.showOptionDialog(null, "Acariciar.", "Acariciar", JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Si", "No" }, "Si");
			if (ju == 0) {
				Icon icono5 = new ImageIcon (getClass().getResource("/recursos/Gato erizado.png"));
				JOptionPane.showMessageDialog(null, "Casi no megusta","Acaricia", JOptionPane.PLAIN_MESSAGE, icono5 );
				JOptionPane.showMessageDialog(null, "Tu gato erizados (-3)estado ");
				JOptionPane.showMessageDialog(null, "Te araño");
				this.estado = this.estado - 3;
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

			JOptionPane.showMessageDialog(null, "Tu michi esta viva ");
		} else if (b >= vida) {

			JOptionPane.showMessageDialog(null, "Tu michi esta muerto");

		}

		JOptionPane.showMessageDialog(null, "Vida: " + vida + "%");

	}

	// Método estado
	public void estado() {
		int a = 5;

		if (estado > a) {
			JOptionPane.showMessageDialog(null, "Tu michi está feliz");
		} else if (a >= estado) {
			JOptionPane.showMessageDialog(null, "Tu michi está triste");

		}

		JOptionPane.showMessageDialog(null, "Estado de ánimo: " + estado + "%");
	}
	public String ObtenerSkin(int s) {
		return SKIN[s];
	}
}
