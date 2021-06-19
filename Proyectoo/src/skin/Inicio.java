package skin;

import javax.swing.JFrame;


import principal.Principal;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class Inicio {

	public JFrame frame;

	public Inicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 160, 122));
		frame.setBounds(100, 100, 659, 432);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnGato = new JButton("");
		btnGato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FormMascota(Principal.cargarMascota("gato")).setVisible(true);//Se llama a la clase MasPerro
																				// para completar su
																				// constructor y que
																				// aparezcan sus diferentes
																				// metodos
			}
		});
		btnGato.setIcon(new ImageIcon(Inicio.class.getResource("/recursos/Gato.png")));
		btnGato.setBounds(29, 89, 123, 214);
		frame.getContentPane().add(btnGato);

		JButton btnPerro = new JButton("");
		btnPerro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FormMascota(Principal.cargarMascota("perro")).setVisible(true);// Se llama a la clase MasPerro
																							// para completar su
																							// constructor y que
																							// aparezcan sus diferentes
																							// metodos
			}
		});
		btnPerro.setIcon(new ImageIcon(Inicio.class.getResource("/recursos/Perr.png")));
		btnPerro.setBounds(180, 89, 123, 214);
		frame.getContentPane().add(btnPerro);

		JLabel lblNewLabel = new JLabel("SELECCIONA TU MASCOTA");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel.setBounds(150, 11, 356, 51);
		frame.getContentPane().add(lblNewLabel);

		JButton btnLobo = new JButton("");
		btnLobo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FormMascota(Principal.cargarMascota("lobo")).setVisible(true);//Se llama a la clase MasPerro
																					// para completar su
																					// constructor y que
																					// aparezcan sus diferentes
																					// metodos
			}
		});
		btnLobo.setIcon(new ImageIcon(Inicio.class.getResource("/recursos/lobo.png")));
		btnLobo.setBounds(335, 89, 119, 214);
		frame.getContentPane().add(btnLobo);

		JButton btnOsoPolar = new JButton("");
		btnOsoPolar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FormMascota(Principal.cargarMascota("oso")).setVisible(true);//Se llama a la clase MasPerro
																			// para completar su
																			// constructor y que
																			// aparezcan sus diferentes
																			// metodos
			}
		});
		btnOsoPolar.setIcon(new ImageIcon(Inicio.class.getResource("/recursos/panda.png")));
		btnOsoPolar.setBounds(483, 88, 123, 215);
		frame.getContentPane().add(btnOsoPolar);
		
		JLabel lblNewLabel_1 = new JLabel("Autores: Kevin Guerrero y Juan Sulvara...");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setBounds(29, 347, 293, 14);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
