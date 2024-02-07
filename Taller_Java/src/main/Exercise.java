package main;

import java.util.Scanner;

import main.ejercicios.ControlDecision;
import main.ejercicios.ControlRepetitivo;
import main.ejercicios.ControlSecuencial;

public class Exercise {
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opcion, opcion2;
		
		do {
			// MENU PRINCIPAL
			System.out.println("Menú principal");
			System.out.println("1. Estructura de Control Secuencial");
			System.out.println("2. Estructura de Control de Decisión");
			System.out.println("3. Estructuras de Control Repetitivo");
			System.out.println("0. Salir");
			
			System.out.print("Ingrese el número de la opción: ");
			opcion = teclado.nextInt();
			
			switch (opcion) {
				case 1: {
					System.out.println("\nEstructuras de Control Secuencial");
					System.out.print("Por favor, ingrese un número del 1 al 23 sin contar los pares o ingrese 0 para volver: ");
					opcion2 = teclado.nextInt();
					System.out.println("");
					
					while (opcion2 != 0) {
						switch (opcion2) {
							case 1: {
								ControlSecuencial.ejercicio1();
								break;
							}
							case 3: {
								ControlSecuencial.ejercicio3();
								break;
							}
							case 5: {
								ControlSecuencial.ejercicio5();
								break;
							}
							case 7: {
								ControlSecuencial.ejercicio7();
								break;
							}
							case 9: {
								ControlSecuencial.ejercicio9();
								break;
							}
							case 11: {
								ControlSecuencial.ejercicio11();
								break;
							}
							case 13: {
								ControlSecuencial.ejercicio13();
								break;
							}
							case 15: {
								ControlSecuencial.ejercicio15();
								break;
							}
							case 17: {
								ControlSecuencial.ejercicio17();
								break;
							}
							case 19: {
								ControlSecuencial.ejercicio19();
								break;
							}
							case 21: {
								ControlSecuencial.ejercicio21();
								break;
							}
							case 23: {
								ControlSecuencial.ejercicio23();
								break;
							}
							default :
								do {
									System.out.print("Debe ingresar un número entre 1-23 y que sea impar: ");
									opcion2 = teclado.nextInt();
									System.out.println("");
								} while((opcion2 < 0 && opcion2 > 23) || opcion2 % 2 == 0);
						}
					}
				}
				case 2: {
					System.out.println("\nEstructura de Control de Decisión");
					System.out.print("Por favor, ingrese un número del 25 al 45 sin contar los pares o ingrese 0 para volver: ");
					opcion2 = teclado.nextInt();
					System.out.println("");
					
					while (opcion2 != 0) {
						switch (opcion2) {
							case 25: {
								ControlDecision.ejercicio25();
								break;
							}
							case 27: {
								ControlDecision.ejercicio27();
								break;
							}
							case 29: {
								ControlDecision.ejercicio29();
								break;
							}
							case 31: {
								ControlDecision.ejercicio31();
								break;
							}
							case 33: {
								ControlDecision.ejercicio33();
								break;
							}
							case 35: {
								ControlDecision.ejercicio35();
								break;
							}
							case 37: {
								ControlDecision.ejercicio37();
								break;
							}
							case 39: {
								ControlDecision.ejercicio39();
								break;
							}
							case 41: {
								ControlDecision.ejercicio41();
								break;
							}
							case 43: {
								ControlDecision.ejercicio43();
								break;
							}
							case 45: {
								ControlDecision.ejercicio45();
								break;
							}
							default :
								do {
									System.out.print("Debe ingresar un número entre 25-45 y que sea impar: ");
									opcion2 = teclado.nextInt();
									System.out.println("");
								} while((opcion2 < 25 && opcion2 > 45) || opcion2 % 2 == 0);
						}
					}
				} case 3: {
					System.out.println("\nEstructuras de Control Repetitivo");
					System.out.print("Por favor, ingrese un número del 47 al 71 sin contar los pares o ingrese 0 para volver: ");
					opcion2 = teclado.nextInt();
					System.out.println("");
					
					while (opcion2 != 0) {
						switch (opcion2) {
							case 47: {
								ControlRepetitivo.ejercicio47();
								break;
							}
							case 49: {
								ControlRepetitivo.ejercicio49();
								break;
							}
							case 51: {
								ControlRepetitivo.ejercicio51();
								break;
							}
							case 53: {
								ControlRepetitivo.ejercicio53();
								break;
							}
							case 55: {
								ControlRepetitivo.ejercicio55();
								break;
							}
							case 57: {
								ControlRepetitivo.ejercicio57();
								break;
							}
							case 59: {
								ControlRepetitivo.ejercicio59();
								break;
							}
							case 61: {
								ControlRepetitivo.ejercicio61();
								break;
							}
							case 63: {
								ControlRepetitivo.ejercicio63();
								break;
							}
							case 65: {
								ControlRepetitivo.ejercicio65();
								break;
							}
							case 67: {
								ControlRepetitivo.ejercicio67();
								break;
							}
							case 69: {
								ControlRepetitivo.ejercicio69();
								break;
							}
							case 71: {
								ControlRepetitivo.ejercicio71();
								break;
							}
							default :
								do {
									System.out.print("Debe ingresar un número entre 47-71 y que sea impar: ");
									opcion2 = teclado.nextInt();
									System.out.println("");
								} while((opcion2 < 47 && opcion2 > 71) || opcion2 % 2 == 0);
						}
					}
				}
				default :
					if(opcion < 0 || opcion > 3) {
						System.out.println("Opción incorrecta");
						System.out.println("");
					}
			}
		} while (opcion != 0);
		
		System.out.println("\nFIN DEL PROGRAMA");
	}
}