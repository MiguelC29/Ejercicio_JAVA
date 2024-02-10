package main;

import java.util.Scanner;

public class App {
	static Scanner teclado = new Scanner(System.in);
	static int opcion, opcion2;
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();

		do {
			System.out.println("\nMENÚ PRINCIPAL CALCULADORA");
			menuPrincipal();
			
			if(opcion != 0 && (opcion > 0 && opcion < 5)) {
				System.out.print("Ingrese el primer número: ");
				calculadora.setNumero1(teclado.nextDouble());
				
				System.out.print("Ingrese el segundo número: ");
				calculadora.setNumero2(teclado.nextDouble());
			}
			
			switch (opcion) {
				case 1: {
					System.out.println("\nSUMA");
					calculadora.sumar(calculadora.getNumero1(), calculadora.getNumero2());
					System.out.println(calculadora.getNumero1() + " + " + calculadora.getNumero2() + " = " + calculadora.getResultado());
					continuarOperacion(calculadora);
					break;
				}
				case 2: {
					System.out.println("\nRESTA");
					calculadora.restar(calculadora.getNumero1(), calculadora.getNumero2());
					System.out.println(calculadora.getNumero1() + " - " + calculadora.getNumero2() + " = " + calculadora.getResultado());
					continuarOperacion(calculadora);
					break;
				}
				case 3: {
					System.out.println("\nMULTIPLICACIÓN");
					calculadora.multiplicar(calculadora.getNumero1(), calculadora.getNumero2());
					System.out.println(calculadora.getNumero1() + " x " + calculadora.getNumero2() + " = " + calculadora.getResultado());
					continuarOperacion(calculadora);
					break;
				}
				case 4: {
					System.out.println("\nDIVISIÓN");
					calculadora.dividir(calculadora.getNumero1(), calculadora.getNumero2());
					System.out.println(calculadora.getNumero1() + " ÷ " + calculadora.getNumero2() + " = " + calculadora.getResultado());
					continuarOperacion(calculadora);
					break;
				}
				default: {
					if(opcion != 0) {
						System.out.println("\nOpción incorrecta, por favor ingrese una de las opciones del menú");	
					} else {
						System.out.println("\nPrograma terminado");
					}
				}
			}
		} while (opcion != 0);
	}
	
	public static void menuPrincipal() {
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("0. Salir");
		System.out.print("Por favor ingrese la operación a realizar: ");
		opcion = teclado.nextInt();
	}
	
	public static void menuSecundario() {
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.print("Por favor ingrese la operación a realizar: ");
		opcion = teclado.nextInt();
	}
	
	public static void operaciones(Calculadora calculadora) {
		String signo = " ";
		switch(opcion) {
			case 1: {
				calculadora.sumar(calculadora.getNumero1(), calculadora.getNumero2());
				signo = " + ";
				break;
			}
			case 2: {
				calculadora.restar(calculadora.getNumero1(), calculadora.getNumero2());
				signo = " - ";
				break;
			}
			case 3: {
				calculadora.multiplicar(calculadora.getNumero1(), calculadora.getNumero2());
				signo = " x ";
				break;
			}
			case 4: {
				calculadora.dividir(calculadora.getNumero1(), calculadora.getNumero2());
				signo = " ÷ ";
				break;
			}
		}
		System.out.println(calculadora.getNumero1() + signo + calculadora.getNumero2() + " = " + calculadora.getResultado());
	}
	
	public static void continuarOperacion(Calculadora calculadora) {
		do {
			System.out.println("\n¿Deasea continuar con esta operación?: ");
			System.out.println("1. SI");
			System.out.println("2. NO");
			opcion2 = teclado.nextInt();
			
			if(opcion2 == 1) {
				do {
					System.out.println("\nSeleccione la operación que desea aplicarle al resultado obtenido");
					menuSecundario();
					if (opcion >= 1 && opcion <= 4) {
						System.out.println("Primer número: " + calculadora.getResultado());
						System.out.print("Ingrese el segundo número: ");
						calculadora.setNumero2(teclado.nextDouble());
						System.out.println("");
						calculadora.setNumero1(calculadora.getResultado());
						operaciones(calculadora);
						break;
					} else {
						System.out.println("Opción incorrecta, por favor ingrese una de las opciones del menú");
					}
				} while(true);
			} else if (opcion2 == 2 || opcion == 0) {
				break;
			} else {
				System.out.println("Opción incorrecta, por favor ingrese 1 para continuar o 2 para NO continuar");
			}
		} while(true);
	}
}