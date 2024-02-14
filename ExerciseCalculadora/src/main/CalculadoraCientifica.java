package main;

public class CalculadoraCientifica extends Calculadora implements FuncionesCalculadoraCientifica {

	@Override
	public void menu() {
    	System.out.println(" 2. Raíz cuadrada");
    	System.out.println(" 3. Raíz cúbica");
    	System.out.println(" 4. Elevar al cuadrado");
    	System.out.println(" 5. Elevar al cubo");
    	System.out.println(" 6. Valor absoluto");
    	System.out.println(" 7. Seno");
    	System.out.println(" 8. Coseno");
    	System.out.println(" 9. Tangente");
    	System.out.println("10. Arcoseno");
    	System.out.println("11. Arcocoseno");
    	System.out.println("12. Arcotangente");
	}
	
	@Override
	public void realizarOperacion(int opcion, double num) {
		// Realiza la operación seleccionada y muestra el resultado
        switch (opcion) {
            case 2: {
            	System.out.println("\nRAIZ CUADRADA");
            	raizCuadrada(num);
            	System.out.println("√" + num + " = " + this.resultado);
            	break;
            }
            case 3: {
            	System.out.println("\nRAIZ CÚBICA");
            	raizCubica(num);
            	System.out.println("3√" + num + " = " + this.resultado);
            	break;
            }
            case 4: {
            	System.out.println("\nELEVAR AL CUADRADO");
            	elevarCuadrado(num);
            	System.out.println(num + "²" + " = " + this.resultado);
            	break;
            }
            case 5: {
            	System.out.println("\nELEVAR AL CUBO");
            	elevarCubo(num);
            	System.out.println(num + "³" + " = " + this.resultado);
            	break;
            }
            case 6: {
            	System.out.println("\nVALOR ABSOLUTO");
            	valorAbsoluto(num);
            	System.out.println("El abs de " + num + " es " + this.resultado);
            	break;
            }
            case 7: {
            	System.out.println("\nSENO");
            	seno(num);
            	System.out.println("sen(" + num + "°) es " + this.resultado);
            	break;
            }
            case 8: {
            	System.out.println("\nCOSENO");
            	coseno(num);
            	System.out.println("cos(" + num + "°) es " + this.resultado);
            	break;
            }
            case 9: {
            	System.out.println("\nTANGENTE");
            	tangente(num);
            	System.out.println("tan(" + num + "°) es " + this.resultado);
            	break;
            }
            case 10: {
            	System.out.println("\nARCOSENO");
            	arcoseno(num);
            	System.out.println("sen-1(" + num + ") es " + this.resultado + "°");
            	break;
            }
            case 11: {
            	System.out.println("\nARCOCOSENO");
            	arcocoseno(num);
            	System.out.println("cos-1(" + num + ") es " + this.resultado + "°");
            	break;
            }
            case 12: {
            	System.out.println("\nTANGENTE");
            	arcotangente(num);
            	System.out.println("tan-1(" + num + ") es " + this.resultado + "°");
            	break;
            }
        }
	}
	
	@Override
	public double raizCuadrada(double num1) {
		this.resultado = Math.sqrt(num1);
		return this.resultado;
	}
	
	@Override
	public double raizCubica(double num1) {
		this.resultado = Math.cbrt(num1);
		return this.resultado;
	}

	@Override
	public double elevarCuadrado(double num1) {
		this.resultado = Math.pow(num1, 2);
		return this.resultado;
	}
	
	@Override
	public double elevarCubo(double num1) {
		this.resultado = Math.pow(num1, 3);
		return this.resultado;
	}

	@Override
	public void realizarOperacion(int opcionMenu, double numero1, double numero2) {}

	@Override
	public double valorAbsoluto(double num1) {
		this.resultado = Math.abs(num1);
		return this.resultado;
	}
	
	@Override
	public double seno(double num1) {
		double anguloEnRadianes = Math.toRadians(num1);
		this.resultado = Math.sin(anguloEnRadianes);
		return this.resultado;
	}

	@Override
	public double coseno(double num1) {
		double anguloEnRadianes = Math.toRadians(num1);
		this.resultado = Math.cos(anguloEnRadianes);
		return this.resultado;
	}

	@Override
	public double tangente(double num1) {
		double anguloEnRadianes = Math.toRadians(num1);
		this.resultado = Math.tan(anguloEnRadianes);
		return this.resultado;
	}
	
	@Override
	public double arcoseno(double num1) {
		double anguloEnRadianes = Math.asin(num1);
		this.resultado = Math.toDegrees(anguloEnRadianes);
		return this.resultado;
	}

	@Override
	public double arcocoseno(double num1) {
		double anguloEnRadianes = Math.acos(num1);
		this.resultado = Math.toDegrees(anguloEnRadianes);
		return this.resultado;
	}

	@Override
	public double arcotangente(double num1) {
		double anguloEnRadianes = Math.atan(num1);
		this.resultado = Math.toDegrees(anguloEnRadianes);
		return this.resultado;
	}
}