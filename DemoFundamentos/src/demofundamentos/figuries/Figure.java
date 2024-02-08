package demofundamentos.figuries;

import java.util.Scanner;

public abstract class Figure implements IFunciones {
	Scanner teclado = new Scanner(System.in);
	private int side, height, base;
	private double area;

	// Sobrecarga - varios constructores
	public Figure() {
		System.out.println("Estamos trabajando con figuras");
	}

	public Figure(int side, int height, int base) {
		super();
		this.side = side;
		this.height = height;
		this.base = base;
	}

	public Figure(int side, int height, int base, int area) {
		super();
		this.side = side;
		this.height = height;
		this.base = base;
		this.area = area;
	}
	
	// Getters and Setters
	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	public abstract void calcularArea();

	@Override
	public String toString() {
		return "Figure [side=" + side + ", height=" + height + ", base=" + base + ", area=" + area + "]";
	}
}