package mascota;

import skin.FormMascota;

public class Mascota implements InterfazComunicacion {// El implements es para agregar los 
													//métodos de comunicación
	// Atributos de la clase Padre
	public String nombre;
	private String especie;
	protected int vida;
	protected int estado;

	// SobreCarga de constructores
	// Constructor por defecto
	public Mascota() {
		super();
		this.estado = 10;
		this.vida = 100;
	}

	// Constructor
	public Mascota(String especie, String nombre) {
		super();
		this.nombre = nombre;
		this.especie = especie;
		this.vida = 100;
		this.estado = 10;
	}
	// Getter & Setter

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Métodos de la clase Interfaz
	@Override
	public String alimentar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String jugar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cargarMascota() {
		// TODO Auto-generated method stub
		new FormMascota(this).setVisible(true);
	}

	@Override
	public void vida() {
		// TODO Auto-generated method stub

	}

	@Override
	public void estado() {
		// TODO Auto-generated method stub

	}

	// Métodos
	// Polimorfismo
	public String acariciar() {
		return "Me has acariciado";
	}

	public String ObtenerSkin(int s) {
		return ""; 
			
	}
}
