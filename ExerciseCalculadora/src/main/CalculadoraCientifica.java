package main;

public class CalculadoraCientifica extends Calculadora implements FuncionesCalculadoraCientifica {

	@Override
	public void menu() {
    	System.out.println("2. Raíz cuadrada");
    	System.out.println("3. Elevar al cuadrado");
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

	@Override
	public void realizarOperacion(int opcion, double num) {
		// Realiza la operación seleccionada y muestra el resultado
        switch (opcion) {
            case 2: {
            	System.out.println("\nRAIZ CUADRADA");
            	raizCuadrada(num);
            	System.out.println("√" + num + " = " + resultado);
            	break;
            }
            case 3: {
            	System.out.println("\nELEVAR AL CUADRADO");
            	elevarCuadrado(num);
            	System.out.println(num + "²" + " = " + resultado);
            	break;
            }
        }
	}

	@Override
	public void realizarOperacion(int opcionMenu, double numero1, double numero2) {}
}