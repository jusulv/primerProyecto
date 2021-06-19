package skin;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import mascota.Mascota;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;

public class FormMascota extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;

	public FormMascota(Mascota mascota) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 681, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		// Se acabo de hacer
		JLabel lblImagen = new JLabel("");

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(new GridLayout(5, 0, 0, 0));

		JButton btnAlimentar = new JButton("Alimentar");
		btnAlimentar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mascota.alimentar();
				// Se llama al metodo alimentar de la clase padre para su ejecucion en el boton
				// "Alimentar" del programa
				/* Linea copiada */lblImagen
						.setIcon(new ImageIcon(FormMascota.class.getResource(mascota.ObtenerSkin(0))));
			}
		});
		panel.add(btnAlimentar);

		JButton btnJugar = new JButton("Jugar");
		btnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mascota.jugar();// Se llama al metodo jugar de la clase padre para su ejecucion en el boton
								// "Jugar" del programa

			}
		});
		panel.add(btnJugar);

		JButton btnEstado = new JButton("Estado emocional");
		btnEstado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mascota.estado();// Se llama al metodo estado de la clase padre para su ejecucion en el boton
									// "Estado emocional" del programa
			}
		});
		
				JButton btnAcariciar = new JButton("Acariciar");
				btnAcariciar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						mascota.acariciar();// Se llama al metodo Acariciar de la clase padre para su ejecucion en el boton
											// "Acariciar" del programa
					}
				});
				panel.add(btnAcariciar);
		panel.add(btnEstado);

		JButton btnVida = new JButton("Estado de vida");
		btnVida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mascota.vida();// Se llama al metodo vida de la clase padre para su ejecucion en el boton
								// "Estado de vida" del programa
			}
		});
		panel.add(btnVida);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(176, 224, 230));
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(176, 224, 230));
		panel_2.setBounds(37, 209, 412, 181);
		panel_1.add(panel_2);

		lblImagen.setIcon(new ImageIcon(FormMascota.class.getResource(mascota.ObtenerSkin(0))));
		panel_2.add(lblImagen);

		JLabel lblNewLabel = new JLabel("Nombre: ");
		lblNewLabel.setFont(new Font("Sylfaen", Font.ITALIC, 20));
		lblNewLabel.setBounds(10, 141, 84, 27);
		panel_1.add(lblNewLabel);

		txtNombre = new JTextField(mascota.getNombre());
		txtNombre.setFont(new Font("Sitka Subheading", Font.BOLD, 13));
		txtNombre.setEditable(false);
		txtNombre.setBounds(120, 142, 112, 20);
		panel_1.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Proyecto \"VOLI\"");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_1.setBounds(161, 11, 263, 60);
		panel_1.add(lblNewLabel_1);
	}
}
