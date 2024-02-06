package demofundamentos.figuries;

public class Circle extends Figure {
	
	private final double PI = 3.1416;
	
	public Circle() {
		// Llamado del metodo de Figure
		this.nameFigure();
	}
	
	public void calculateArea() {
		System.out.println("Favor escriba el radio del circulo");
		this.radio = this.teclado.nextInt();
		double result = PI * Math.pow(this.radio, 2);
		System.out.println("El area del circulo es = " + result);
	}
}