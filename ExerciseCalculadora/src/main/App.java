package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
	// Declaración de variables
	private static Scanner teclado = new Scanner(System.in);
	private static int opcionMenuPp, opcionMenuBs, opcionContinuar;
	private static CalculadoraBasica calBasica = new CalculadoraBasica();
	private static CalculadoraCientifica calCientifica = new CalculadoraCientifica();
	private static double num1, num2;
	
	// Método principal
	public static void main(String[] args) {
		// Bucle principal del programa
		do {
			// Mostrar el menú principal de la calculadora
			System.out.println("\nMENÚ PRINCIPAL CALCULADORA");
			System.out.println(" 0. Salir");
			mostrarMenuPp();
			// Si la opción es válida, realizar la operación seleccionada
			if (opcionMenuPp >= 1) {
                if (opcionMenuPp == 1) {
                    realizarOperacionBasica();
                } else if (opcionMenuPp >= 2) {
                    realizarOperacionCientifica();
                }
                continuarOperacion();
            }
		} while(opcionMenuPp != 0);
		 // Mensaje de despedida
		System.out.println("Programa finalizado");
	}
	// Método para mostrar el menú principal de operaciones básicas
	private static void mostrarMenuPp() {
		// Bucle para mostrar el menú y obtener la opción del usuario
		do {
			// Muestra el menú principal y solicita la operación al usuario
			System.out.println(" 1. Ingresar número natural");
			calCientifica.menu();
			System.out.print("Por favor ingrese la operación a realizar: ");
	        
	        try {
                opcionMenuPp = teclado.nextInt();
            } catch (InputMismatchException e) {
                manejarExcepcion();
                opcionMenuPp = -1; // Asignar un valor no válido para repetir el bucle
            }
	        
	        if(!(opcionMenuPp >= 0 && opcionMenuPp <= 15)) {
	        	System.out.println("Opción incorrecta, por favor ingrese una opción del menú\n");
	        } else {
	        	System.out.println("");
	        	break;
	        }
		} while(true);
	}
	// Método para mostrar el menú de operaciones básicas
	private static void mostrarMenuBs() {
		// Bucle para mostrar el menú y obtener la opción del usuario
		do {
			// Muestra el menú de calBasica y solicita la operación al usuario
			calBasica.menu();
			System.out.print("Seleccione la operacion a realizar: ");
	        
	        try {
                opcionMenuBs = teclado.nextInt();
            } catch (InputMismatchException e) {
                manejarExcepcion();
                opcionMenuBs = -1; // Asignar un valor no válido para repetir el bucle
            }
	        
	        if(!(opcionMenuBs >= 1 && opcionMenuBs <= 5)) {
	        	System.out.println("Opción incorrecta, por favor ingrese una opción del menú\n");
	        } else {
	        	break;
	        }
		} while(true);
	}
	
	// Método para realizar una operación básica
	private static void realizarOperacionBasica() {
		// Obtener el primer número del usuario
		System.out.print("Ingrese un número: ");	
		num1 = teclado.nextDouble();
		
		solicitudNumero2();
		// De acuerdo a la operacion seleccionada se ejecuta la calculadora correspondiente
		ejecutarOperacion();
	}
	
	// Método para realizar una operación científica
	private static void realizarOperacionCientifica() {
	    // Obtener el primer número del usuario
		System.out.print("Ingrese un número: ");	
		num1 = teclado.nextDouble();
	    // Realizar la operación con la calculadora científica
		calCientifica.realizarOperacion(opcionMenuPp, num1);
	}
	
	// Método para preguntar al usuario si desea continuar con la operación actual o reiniciar el programa para realizar una nueva operación
	public static void continuarOperacion() {
	    // Bucle para preguntar al usuario y validar la opción
		do {
			System.out.println("\n¿A este resultado desea realizarle otra operación?: ");
			System.out.println("1. SI");
			System.out.println("2. NO");
			
			try {
	            opcionContinuar = teclado.nextInt();
	        } catch (InputMismatchException e) {
	            manejarExcepcion();
	            opcionContinuar = -1; // Asignar un valor no válido para repetir el bucle
	        }
			
            // Si desea continuar, realizar la operación seleccionada
			if(opcionContinuar == 1) {
	            // Bucle para seleccionar una nueva operación y continuar con la calculadora
				do {
					// Obtener el primer número (resultado anterior)
					num1 = (opcionMenuPp == 1) ? calBasica.resultado : calCientifica.resultado;
					solicitudNumero2();
					// Verifica si la opción ingresada está en el rango de 1 a 5
					if (opcionMenuBs >= 1 && opcionMenuBs <= 5) {
						// De acuerdo a la operacion seleccionada se ejecuta la calculadora correspondiente
						ejecutarOperacion();
						break; // Salir del bucle interno si la operación es válida
					} else {
			            // Informa al usuario si la opción ingresada no está en el rango permitido
						System.out.println("Opción incorrecta, por favor ingrese una de las opciones del menú");
					}
				} while(true);
			} else {
				if (opcionContinuar != 2) {
		            // Informa al usuario si la opción ingresada no está en el rango permitido
					System.out.println("Opción incorrecta, por favor ingrese 1 para continuar o 2 para NO continuar");	
				} else {
					// Reiniciamos los valores de la calculadora - no es necesario porque los valor 
					num1 = 0;
					num2 = 0;
					calBasica.resultado = 0;
					calCientifica.resultado = 0;
				}
			}
		} while (opcionContinuar != 2);
	}
	
	// Función para manejar la excepción InputMismatchException
	private static void manejarExcepcion() {
        // Maneja la excepción si el usuario ingresa un valor no válido
	    System.out.println("Error: Ingrese un número válido.");
	    teclado.nextLine(); // Limpiar el buffer del scanner
	}
	
	
	public static void solicitudNumero2() {
		// Mostrar el menú de operaciones básicas
		mostrarMenuBs();
		System.out.println("");
		// Si la operación no es porcentaje, obtener el segundo número del usuario
		if(opcionMenuBs != 5) {
			do {
				mostrarMenuPp();
				if (opcionMenuPp == 0) {
					// Esto se hace porque al volver a mostrar el menu por segunda vez no se muestra la opcion 0. salir, solo cuando inicia o se reinicia la calculadora
					System.out.println("Opción incorrecta, por favor ingrese una opción del menú\n");	
				}
			} while (opcionMenuPp == 0);
		}
		System.out.println("Primer número: " + num1);
		// Opcion de dividir
		if (opcionMenuBs == 4) {
			// Se va ejecutar hasta que el número 2 es decir el denominador sea diferente de 0
	        // Bucle para obtener un denominador diferente de 0
			do {
				System.out.print("Ingrese el valor del denominador: ");
				num2 = teclado.nextDouble();
				if (num2 == 0) {
					System.out.println("El denominador no puede ser 0\n");
				}
			} while (num2 == 0);
		} else {
			// Opcion diferente de 4
			if (opcionMenuBs == 5) {
				// Opcion 5 porcentaje
				System.out.print("Ingrese el valor del porcentaje a calcular: ");
				opcionMenuPp = 1;
			} else {
				// Opciones básicas 1, 2, 3
				System.out.print("Ingrese otro número: ");
			}
			num2 = teclado.nextDouble();
		}
	}
	
	private static void ejecutarOperacion() {
		// Seleccionar la calculadora a usar y Realizar la operación en base a la calculadora seleccionada
		if (opcionMenuPp == 1) {
	        // Calculadora básica
			calBasica.realizarOperacion(opcionMenuBs, num1, num2);
		} else {
	        // Calculadora científica
			calCientifica.realizarOperacion(opcionMenuPp, num2);
	        // Actualizar el segundo número con el resultado de la operación científica
			num2 = calCientifica.resultado;
	        // Realizar la operación básica con el resultado como primer número
			calBasica.realizarOperacion(opcionMenuBs, num1, num2);
		}
	}
}