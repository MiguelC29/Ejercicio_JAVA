package demofundamentos.figuries;

import java.util.Scanner;

public class Figure {
	Scanner teclado = new Scanner(System.in);
	int side, radio, base;

	public Figure() {
		super();
	}

	public Figure(int side, int radio, int base) {
		super();
		this.side = side;
		this.radio = radio;
		this.base = base;
	}
	
	public void nameFigure() {
		System.out.println("Identique la figura");
	}

	@Override
	public String toString() {
		return "Figure [side=" + side + ", radio=" + radio + ", base=" + base + "]";
	}
}