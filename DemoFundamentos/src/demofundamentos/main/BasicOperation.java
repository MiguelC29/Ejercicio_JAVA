package demofundamentos.main;

import java.util.Scanner;

public class BasicOperation {
	
	static Scanner teclado = new Scanner(System.in);
	private int num1, num2, res;
	
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getRes() {
		return res;
	}

	public void setRes(int res) {
		this.res = res;
	}

	public void sumar() {
		this.res = num1 + num2;
		System.out.println("La suma es = " + res);
	}
	
	public void restar() {
		this.res = num1 - num2;
		System.out.println("La resta es = " + res);
	}
}