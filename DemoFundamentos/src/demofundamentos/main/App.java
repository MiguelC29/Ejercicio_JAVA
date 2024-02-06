package demofundamentos.main;

import java.util.Scanner;

import demofundamentos.figuries.Circle;

public class App {
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		/*
		int op = 0;
		BasicOperation basicOp = new BasicOperation();
		
		do {
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("0. Salir");
			
			op = teclado.nextInt();
			
			switch (op) {
				case 1: {
					System.out.println("Operación de suma");
					System.out.println("Favor, escribir el valor del primero número");
					basicOp.setNum1(teclado.nextInt());
					System.out.println("Favor, escribir el valor del segundo número");
					basicOp.setNum2(teclado.nextInt());
					basicOp.sumar();
					break;
				}
				case 2: {
					System.out.println("Operación de resta");
					System.out.println("Favor, escribir el valor del primero número");
					basicOp.setNum1(teclado.nextInt());
					System.out.println("Favor, escribir el valor del segundo número");
					basicOp.setNum2(teclado.nextInt());
					basicOp.restar();
					break;
				}
				default : {
					System.out.println("Finalizo");
				}
			}
			
		} while(op != 0);
		*/
		
		Circle circle = new Circle();
		circle.calculateArea();
	}
}