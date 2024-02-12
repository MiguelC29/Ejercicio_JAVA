package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App2 {
	static Scanner teclado = new Scanner(System.in);
	static int opcion, opcion2;
	static boolean primeraEjecucion;
	
	public static void main(String[] args) {
		CalculadoraBasica calculadora = new CalculadoraBasica();
		
		do {
            // Verifica si la opción ingresada está en el rango de 1 a 7
			if (opcion >= 1 && opcion <= 7) {
				// Operaciones básicas
				if (opcion >= 1 && opcion <= 5) {
					System.out.print("\nIngrese un número: ");	
					calculadora.setNumero1(teclado.nextDouble());
					
					// Opcion de dividir
					if (opcion == 4) {
						// Se va ejecutar hasta que el número 2 es decir el denominador sea diferente de 0
						do {
							System.out.print("Ingrese otro número: ");
							calculadora.setNumero2(teclado.nextDouble());
							if (calculadora.getNumero2() == 0) {
								System.out.println("El denominador no puede ser 0");
							}
						} while (calculadora.getNumero2() == 0);
					} else {
						// Opcion diferente de 4
						if (opcion == 5) {
							System.out.print("Ingrese el valor del porcentaje a calcular: ");
						} else {
							System.out.print("Ingrese otro número: ");
						}
						calculadora.setNumero2(teclado.nextDouble());
					}
					
	                // Realiza la operación seleccionada e imprime el resultado
					operaciones(calculadora);
	                // Pregunta al usuario si desea continuar con la operación
					do {
						System.out.println("\n¿Deasea continuar con esta operación?: ");
						System.out.println("1. SI");
						System.out.println("2. NO");
						continuarOperacion(calculadora);
					} while(opcion2 != 2);
				} else if (opcion >= 6) {
					System.out.print("\nIngrese un número: ");
					calculadora.setNumero1(teclado.nextDouble());
					// Realiza la operación seleccionada e imprime el resultado
					operaciones(calculadora);
					// Pregunta al usuario si desea continuar con la operación
					do {
						System.out.println("\n¿A este resultado desea realizarle otra operación?: ");
						System.out.println("1. SI");
						System.out.println("2. NO");
						continuarOperacion(calculadora);
					} while(opcion2 != 2);
				}
			} else {
                // Informa al usuario si la opción ingresada no está en el rango permitido
				if (opcion != 0) {
					System.out.println("\nOpción incorrecta, por favor ingrese una de las opciones del menú");
				}
			}
		} while (opcion != 0);
		
		System.out.println("Programa finalizado");
	}
	
    // Pregunta al usuario si desea continuar con la operación actual o reiniciar el programa para realizar una nueva operación
	public static void continuarOperacion(CalculadoraBasica calculadora) {
		try {
			opcion2 = teclado.nextInt();
        } catch (InputMismatchException e) {
            // Maneja la excepción si el usuario ingresa un valor no válido
            System.out.println("Error: Ingrese un número válido.");
            teclado.nextLine(); // Limpiar el buffer del scanner
            opcion2 = -1; // Asignar un valor no válido para repetir el bucle
        }
		if(opcion2 == 1) {
            // Bucle para seleccionar una nueva operación y continuar con la calculadora
			do {
				System.out.println("\nSeleccione la operación que desea aplicarle al resultado obtenido");
                // Verifica si la opción ingresada está en el rango de 1 a 4
				if (opcion >= 1 && opcion <= 4) {
                    // Actualiza el primer número con el resultado anterior
					calculadora.setNumero1(calculadora.getResultado());
					System.out.println("\nPrimer número: " + calculadora.getNumero1());
					System.out.print("Ingrese el segundo número: ");
					calculadora.setNumero2(teclado.nextDouble());
					System.out.println("");
                    // Realiza la nueva operación y muestra el resultado
					operaciones(calculadora);
					break;
				} else {
                    // Informa al usuario si la opción ingresada no está en el rango permitido
					System.out.println("Opción incorrecta, por favor ingrese una de las opciones del menú");
				}
			} while(true);
		} else {
			if (opcion2 != 2) {
	            // Informa al usuario si la opción ingresada no está en el rango permitido
				System.out.println("Opción incorrecta, por favor ingrese 1 para continuar o 2 para NO continuar");	
			}
		}
	}
}