package demofundamentos.figuries;

public class Square extends Figure {

	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Square(int side, int height, int base, int area) {
		super(side, height, base, area);
		// TODO Auto-generated constructor stub
	}

	public Square(int side, int height, int base) {
		super(side, height, base);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		this.setArea(getSide() * getSide());
		System.out.println("El area del cuadrado es = " + this.getArea());
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