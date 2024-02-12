package main;

public class CalculadoraCientifica extends Calculadora implements FuncionesCalculadoraCientifica {

	@Override
	public void menu() {
    	System.out.println("2. Porcentaje");
    	System.out.println("3. Raíz cuadrada");
    	System.out.println("4. Elevar al cuadrado");
	}

	@Override
	public void realizarOperacion() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public double raizCuadrada(double num1) {
		this.resultado = Math.sqrt(num1);
		return this.resultado;
	}

	@Override
	public double elevarCuadrado(double num1) {
		this.resultado = Math.pow(num1, 2);
		return this.resultado;
	}
}