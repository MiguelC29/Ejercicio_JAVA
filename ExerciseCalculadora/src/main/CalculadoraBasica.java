package main;

public class CalculadoraBasica extends Calculadora implements FuncionesCalculadoraBasica{

	public CalculadoraBasica() {
		super();
	}

	@Override
	public void menu() {
		System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Porcentaje");
	}

	@Override
	public void realizarOperacion(int opcion, double num1, double num2) {
	    // Realiza la operación seleccionada y muestra el resultado
        String signo = " ";
        switch (opcion) {
            case 1: {
            	System.out.println("\nSUMA");
            	sumar(num1, num2);
                signo = " + ";
                break;
            }
            case 2: {
            	System.out.println("\nRESTA");
            	restar(num1, num2);
                signo = " - ";
                break;
            }
            case 3: {
            	System.out.println("\nMULTIPLICACIÓN");
            	multiplicar(num1, num2);
                signo = " x ";
                break;
            }
            case 4: {
            	System.out.println("\nDIVISIÓN");
            	dividir(num1, num2);
                signo = " ÷ ";
                break;
            }
            case 5: {
            	System.out.println("\nPORCENTAJE");
            	porcentaje(num1, num2);
            	System.out.println("El " + num2 + "% de " + num1 + " es " + resultado);
            	break;
            }
        }
    	System.out.println(num1 + signo + num2 + " = " + resultado);
	}

	@Override
	public double sumar(double numero1, double numero2) {
		this.resultado = numero1 + numero2;
		return this.resultado;
	}

	@Override
	public double restar(double numero1, double numero2) {
		this.resultado = numero1 - numero2;
		return this.resultado;
	}

	@Override
	public double multiplicar(double numero1, double numero2) {
		this.resultado = numero1 * numero2;
		return this.resultado;
	}

	@Override
	public double dividir(double numero1, double numero2) {
		this.resultado = numero1 / numero2;
		return this.resultado;
	}

	@Override
	public double porcentaje(double numero1, double numero2) {
		this.resultado = (numero1 * numero2) / 100;
		return this.resultado;
	}

	@Override
	public void realizarOperacion(int opcionMenu, double numero1) {}
}