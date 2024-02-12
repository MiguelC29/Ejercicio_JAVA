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
	}

	@Override
	public void realizarOperacion(int opcion, double num1, double num2) {
	        String signo = " ";
	        switch (opcion) {
	            case 1: {
	            	System.out.println("\nSUMA");
	            	sumar(calculadora.getNumero1(), calculadora.getNumero2());
	                signo = " + ";
	                break;
	            }
	            case 2: {
	            	System.out.println("\nRESTA");
	            	restar(calculadora.getNumero1(), calculadora.getNumero2());
	                signo = " - ";
	                break;
	            }
	            case 3: {
	            	System.out.println("\nMULTIPLICACIÓN");
	            	multiplicar(calculadora.getNumero1(), calculadora.getNumero2());
	                signo = " x ";
	                break;
	            }
	            case 4: {
	            	System.out.println("\nDIVISIÓN");
	            	dividir(calculadora.getNumero1(), calculadora.getNumero2());
	                signo = " ÷ ";
	                break;
	            }
	            case 5: {
	            	System.out.println("\nPORCENTAJE");
	            	porcentaje(calculadora.getNumero1(), calculadora.getNumero2());
	            	System.out.println("El " + calculadora.getNumero2() + "% de " + calculadora.getNumero1() + " es " + calculadora.getResultado());
	            	break;
	            }
	        }
        	System.out.println(calculadora.getNumero1() + signo + calculadora.getNumero2() + " = " + calculadora.getResultado());
	    }
		
	}

	@Override
	public double sumar(double numero1, double numero2) {
		this.resultado = this.numero1 + this.numero2;
		return this.resultado;
	}

	@Override
	public double restar(double numero1, double numero2) {
		this.resultado = this.numero1 - this.numero2;
		return this.resultado;
	}

	@Override
	public double multiplicar(double numero1, double numero2) {
		this.resultado = this.numero1 * this.numero2;
		return this.resultado;
	}

	@Override
	public double dividir(double numero1, double numero2) {
		this.resultado = this.numero1 / this.numero2;
		return this.resultado;
	}

	@Override
	public double porcentaje(double num1, double num2) {
		this.resultado = (this.numero1 * this.numero2) / 100;
		return this.resultado;
	}
}