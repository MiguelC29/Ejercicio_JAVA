package demofundamentos.figuries;

public class Circle extends Figure {
	
	private final double PI = 3.1416;
	protected int radio;
	
	public Circle() {
		super(); // Llamar al constructor de la clase padre
		/*
		// Llamado del metodo de Figure
		this.nameFigure();*/
	}
	
	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	@Override
	public void calcularArea() {
		this.setArea(PI * Math.pow(this.radio, 2));
		System.out.println("El area del circulo es = " + this.getArea());
	}

	@Override
	public double sumar() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double sumar(double x, double y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double restar() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double restar(double x, double y) {
		// TODO Auto-generated method stub
		return 0;
	}
}