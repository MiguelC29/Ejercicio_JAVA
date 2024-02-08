package demofundamentos.main;

import java.util.Scanner;

import demofundamentos.figuries.*;

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
		
		// circle.calculateArea();
		/* como la clase es abstracta no se puede instanciar
		Figure objFigure = new Figure();
		objFigure.setBase(3);
		objFigure.setHeight(89);
		objFigure.setSide(23);
		System.out.println(objFigure.toString());*/
		/*
		Circle circle = new Circle();
		circle.setRadio(6);
		circle.calcularArea();
		System.out.println(circle.toString());
		System.out.println("==============================================");*/
		Triangle triangle = new Triangle();
		triangle.setBase(4);
		triangle.setHeight(8);
		triangle.calcularArea();
		System.out.println(triangle.sumar(triangle.getBase(), triangle.getArea()));
		System.out.println(triangle.toString());
		/*
		System.out.println("==============================================");
		Square square = new Square();
		square.setSide(5);
		square.calcularArea();
		System.out.println(square.toString());
		
		// Polimorfismo
		Figure objFigure = new Circle();
		objFigure.calcularArea();*/
	}
}