package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
	private static Scanner teclado = new Scanner(System.in);
	private static int opcionMenuPp, opcionMenuBs, opcionContinuar;
	private static CalculadoraBasica calBasica = new CalculadoraBasica();
	private static CalculadoraCientifica calCientifica = new CalculadoraCientifica();
	private static double num1, num2;
	
	public static void main(String[] args) {
		do {
			System.out.println("\nMENÚ PRINCIPAL CALCULADORA");
			System.out.println("0. Salir");
			mostrarMenuPp();
	        
			if (opcionMenuPp == 1) {
				realizarOperacionBasica();
				continuarOperacion();
			} else if(opcionMenuPp >= 2 && opcionMenuPp <=3) {
				realizarOperacionCientifica();
				continuarOperacion();
			}
		} while(opcionMenuPp != 0);
		
		System.out.println("\nPrograma finalizado");
	}
	
	private static void mostrarMenuPp() {
		do {
			// Muestra el menú principal y solicita la operación al usuario
			System.out.println("1. Ingresar número natural");
			calCientifica.menu();
			System.out.print("Por favor ingrese la operación a realizar: ");

	        try {
	        	opcionMenuPp = teclado.nextInt();
	        } catch (InputMismatchException e) {
	            // Maneja la excepción si el usuario ingresa un valor no válido
	            System.out.println("Error: Ingrese un número válido.");
	            teclado.nextLine(); // Limpiar el buffer del scanner
	            opcionMenuPp = -1; // Asignar un valor no válido para repetir el bucle
	        }
	        
	        if(!(opcionMenuPp >= 0 && opcionMenuPp <= 3)) {
	        	System.out.println("Opción incorrecta, por favor ingrese una opción del menú");
	        	break;
	        } else {
	        	break;
	        }
		} while(true);
	}
	
	private static void mostrarMenuBs() {
		do {
			// Muestra el menú de calBasica y solicita la operación al usuario
			calBasica.menu();
			System.out.print("Seleccione la operacion a realizar: ");

	        try {
	        	opcionMenuBs = teclado.nextInt();
	        } catch (InputMismatchException e) {
	            // Maneja la excepción si el usuario ingresa un valor no válido
	            System.out.println("Error: Ingrese un número válido.");
	            teclado.nextLine(); // Limpiar el buffer del scanner
	            opcionMenuBs = -1; // Asignar un valor no válido para repetir el bucle
	        }
	        
	        if(!(opcionMenuBs >= 1 && opcionMenuBs <= 5)) {
	        	System.out.println("Opción incorrecta, por favor ingrese una opción del menú");
	        } else {
	        	break;
	        }
		} while(true);
	}
	
	private static void realizarOperacionBasica() {
		System.out.print("\nIngrese un número: ");	
		num1 = teclado.nextDouble();
		
		mostrarMenuBs();
		System.out.println("");
		mostrarMenuPp();
		
		System.out.print("\nIngrese otro número: ");	
		num2 = teclado.nextDouble();
		
		if (opcionMenuPp == 1) {
			calBasica.realizarOperacion(opcionMenuBs, num1, num2);
		} else {
			calCientifica.realizarOperacion(opcionMenuBs, num2);
			num2 = calCientifica.resultado;
			calBasica.realizarOperacion(opcionMenuBs, num1, num2);
		}
	}
	
	private static void realizarOperacionCientifica() {
		System.out.print("\nIngrese un número: ");	
		num1 = teclado.nextDouble();
		calCientifica.realizarOperacion(opcionMenuPp, num1);
	}
	
	// Pregunta al usuario si desea continuar con la operación actual o reiniciar el programa para realizar una nueva operación
	public static void continuarOperacion() {
		do {
			System.out.println("\n¿A este resultado desea realizarle otra operación?: ");
			System.out.println("1. SI");
			System.out.println("2. NO");
			
			try {
				opcionContinuar = teclado.nextInt();
	        } catch (InputMismatchException e) {
	            // Maneja la excepción si el usuario ingresa un valor no válido
	            System.out.println("Error: Ingrese un número válido.");
	            teclado.nextLine(); // Limpiar el buffer del scanner
	            opcionContinuar = -1; // Asignar un valor no válido para repetir el bucle
	        }

			if(opcionContinuar == 1) {
	            // Bucle para seleccionar una nueva operación y continuar con la calculadora
				do {
					mostrarMenuBs();
	                // Verifica si la opción ingresada está en el rango de 1 a 5
					if (opcionMenuBs >= 1 && opcionMenuBs <= 5) {
						num1 = (opcionMenuPp == 1) ? calBasica.resultado : calCientifica.resultado;
						
						System.out.println("");
						mostrarMenuPp();
						
						System.out.println("\nPrimer número: " + num1);
						System.out.print("Ingrese otro número: ");	
						num2 = teclado.nextDouble();
						
						if (opcionMenuPp == 1) {
							calBasica.realizarOperacion(opcionMenuBs, num1, num2);
						} else {
							calCientifica.realizarOperacion(opcionMenuPp, num2);
							num2 = calCientifica.resultado;
							calBasica.realizarOperacion(opcionMenuBs, num1, num2);
						}
						break;
					} else {
	                    // Informa al usuario si la opción ingresada no está en el rango permitido
						System.out.println("Opción incorrecta, por favor ingrese una de las opciones del menú");
					}
				} while(true);
			} else {
				if (opcionContinuar != 2) {
		            // Informa al usuario si la opción ingresada no está en el rango permitido
					System.out.println("Opción incorrecta, por favor ingrese 1 para continuar o 2 para NO continuar");	
				}
			}
		} while (opcionContinuar != 2);
	}
}