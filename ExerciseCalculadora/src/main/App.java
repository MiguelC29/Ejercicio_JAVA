package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
	static Scanner teclado = new Scanner(System.in);
	static int opcionMenuPp, opcionMenuBs, opcionContinuar;
	static CalculadoraBasica calBasica = new CalculadoraBasica();
	static CalculadoraCientifica calCientifica = new CalculadoraCientifica();
	static double num1, num2;
	
	public static void main(String[] args) {
		do {
			System.out.println("\nMENÚ PRINCIPAL CALCULADORA");
			System.out.println("0. Salir");
			mostrarMenuPp();
	        
	        switch (opcionMenuPp) {
			case 1: {
				System.out.print("\nIngrese un número: ");	
				num1 = teclado.nextDouble();
				calBasica.menu();
				System.out.print("Seleccione la operacion a realizar: ");
				opcionMenuBs = teclado.nextInt();
				
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
				do {
					System.out.println("\n¿A este resultado desea realizarle otra operación?: ");
					System.out.println("1. SI");
					System.out.println("2. NO");
					continuarOperacion();
				} while (opcionContinuar != 2);
				break;
			}
			case 2:
			case 3: {
				System.out.print("\nIngrese un número: ");	
				num1 = teclado.nextDouble();
				
				calCientifica.realizarOperacion(opcionMenuBs, num1);
				
				continuarOperacion();
				break;
			}
			}
		} while(opcionMenuPp != 0);
		
		System.out.println("\nPrograma finalizado");
	}
	
	public static void mostrarMenuPp() {
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
	        
	        if(!(opcionMenuPp >= 1 && opcionMenuPp <= 3)) {
	        	System.out.println("Opción incorrecta\n");
	        } else {
	        	break;
	        }
		} while(true);
		
	}
	
	// Pregunta al usuario si desea continuar con la operación actual o reiniciar el programa para realizar una nueva operación
		public static void continuarOperacion() {
			try {
				opcionContinuar = teclado.nextInt();
	        } catch (InputMismatchException e) {
	            // Maneja la excepción si el usuario ingresa un valor no válido
	            System.out.println("Error: Ingrese un número válido.");
	            teclado.nextLine(); // Limpiar el buffer del scanner
	            opcionMenuPp = -1; // Asignar un valor no válido para repetir el bucle
	        }
			if(opcionContinuar == 1) {
	            // Bucle para seleccionar una nueva operación y continuar con la calculadora
				do {
					System.out.println("\nSeleccione la operación que desea aplicarle al resultado obtenido");
					calBasica.menu();
					System.out.print("Seleccione la operacion a realizar: ");
					opcionMenuBs = teclado.nextInt();
	                // Verifica si la opción ingresada está en el rango de 1 a 4
					if (opcionMenuBs >= 1 && opcionMenuBs <= 5) {
						num1 = calBasica.resultado;
						
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
		}
}