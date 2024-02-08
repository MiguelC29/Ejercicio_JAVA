package demofundamentos.figuries;

public class Triangle extends Figure {
	
	double result;

	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Triangle(int side, int height, int base, int area) {
		super(side, height, base, area);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		this.setArea((getBase() * getHeight()) / 2);
		System.out.println("El area del triangulo es = " + this.getArea());
	}

	@Override
	public double sumar() {
		// TODO Auto-generated method stub
		return this.result = this.getBase() + this.getArea();
	}

	@Override
	public double sumar(double x, double y) {
		// TODO Auto-generated method stub
		return x + y;
	}

	@Override
	public double restar() {
		// TODO Auto-generated method stub
		return this.result = this.getBase() - this.getHeight();
	}

	@Override
	public double restar(double x, double y) {
		// TODO Auto-generated method stub
		return x - y;
	}	
}