package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
	static Scanner teclado = new Scanner(System.in);
	static int opcion, opcion2;
	
	public static void main(String[] args) {
		CalculadoraBasica calBasica = new CalculadoraBasica();
		CalculadoraCientifica calCientifica = new CalculadoraCientifica();
		
		// Muestra el menú principal y solicita la operación al usuario
		System.out.println("1. Ingresar número natural");
		calCientifica.menu();
		System.out.println("0. Salir");
		
		System.out.print("Por favor ingrese la operación a realizar: ");

        try {
            opcion = teclado.nextInt();
        } catch (InputMismatchException e) {
            // Maneja la excepción si el usuario ingresa un valor no válido
            System.out.println("Error: Ingrese un número válido.");
            teclado.nextLine(); // Limpiar el buffer del scanner
            opcion = -1; // Asignar un valor no válido para repetir el bucle
        }

	}
}