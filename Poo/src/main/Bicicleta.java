package main;

public class Bicicleta {
	// Declaración de variables
	private int velocidadActual, platoActual, piñonActual;
	
	// Constructor
	public Bicicleta() {
		this.velocidadActual = 0;
		this.platoActual = 1;
		this.piñonActual = 1;
	}
	
	public Bicicleta (int velocidadActual, int platoActual, int piñonActual) {
		this.velocidadActual = velocidadActual;
		this.platoActual = platoActual;
		this.piñonActual = piñonActual;
	}
	
	// Metodos getters y setters
	public int getVelocidadActual() {
		return this.velocidadActual;
	}
	
	public int getPlatoActual() {
		return this.platoActual;
	}
	
	public int getPiñonActual() {
		return this.piñonActual;
	}
	
	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}
	
	public void setPlatoActual(int platoActual) {
		this.platoActual = platoActual;
	}
	
	public void setPiñonActual(int piñonActual) {
		this.piñonActual = piñonActual;
	}
	
	// Metodos propios de la clase
	public void acelerar() {
		this.velocidadActual *= 2;
	}
	
	public void frenar() {
		this.velocidadActual /= 2;
	}
	
	public void cambiarPlato() {
		this.platoActual = 1;
	}
	
	public void cambiarPiñon() {
		this.piñonActual = 1;
	}
	
	public void cambiarPlato(int plato) {
		this.platoActual = plato;
	}
	
	public void cambiarPiñon(int piñon) {
		this.piñonActual = piñon;
	}
	
	
}