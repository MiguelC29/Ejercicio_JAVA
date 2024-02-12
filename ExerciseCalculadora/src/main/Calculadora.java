package main;

public abstract class Calculadora {
	public double resultado;
	
	public abstract void menu();
	public abstract void realizarOperacion(int opcionMenu, double numero1);
	public abstract void realizarOperacion(int opcionMenu, double numero1, double numero2);
}