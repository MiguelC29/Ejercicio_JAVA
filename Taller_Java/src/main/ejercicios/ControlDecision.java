package main.ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ControlDecision {
	static Scanner teclado = new Scanner(System.in);
	// Estructura de Control de Decisión
	public static void ejercicio25() {
		// Ejercicio 25
		// Declaracion de variables
		double sueldo, aumento, nuevoSueldo;
		// Solicitud de datos
		System.out.print("Ingrese el sueldo del trabajador: ");
		sueldo = teclado.nextDouble();
		
		// Condicional si el sueldo es menor a 40.000 tiene un aumento del 15% en caso contrario del 12%
		if (sueldo < 40000) {
			aumento = 0.15;
		} else {
			aumento = 0.12;
		}
		
		// Calculamos el nuevo salario de acuerdo al aumento obtenido
		nuevoSueldo = sueldo + (sueldo * aumento);
		
		// Mostrar datos
		System.out.println("\nSueldo anterior: " + sueldo);
		System.out.println("Aumento: " + (aumento * 100) + "%");
		System.out.println("Nuevo sueldo: " + nuevoSueldo);
	}
	
	public static void ejercicio27() {
		// Ejercicio 27
		// Declaracion de variables
		double valor1, valor2, valor3, areaTriangulo, areaCirculo, areaRectangulo;
		String figura;
		// String areaTrFormated, areaCrFormated, areaRgFormated;
		DecimalFormat df = new DecimalFormat("#.##"); // FORMATO PARA QUE SOLO HAYAN DOS DECIMALES
		
		//Solicitud de datos
		System.out.print("Ingrese el valor 1: ");
		valor1 = teclado.nextDouble();
		
		System.out.print("Ingrese el valor 2: ");
		valor2 = teclado.nextDouble();
		
		System.out.print("Ingrese el valor 3: ");
		valor3 = teclado.nextDouble();
		
		// Calculo del area de triangulo (b * h) / 2
		areaTriangulo = (valor1 * valor2) / 2;
		// Calculo del area del circulo pi * r2
		areaCirculo = valor2 * Math.pow(valor1, 2);
		// Calculo del area del reactangulo b * h
		areaRectangulo = valor1 * valor2;
		
		// FORMATEAMOS LOS RESULTADOS PARA QUE LOS RESULTADOS SOLO TENGAN 2 DECIMALES.
		// TAMBIEN DEBEMOS HACER UN REPLACE YA QUE EL PARSE FUNCIONA CON . Y NOSOTROS POR CONSOLA DAMOS EL NUMERO CON ,
		//areaTrFormated = df.format(areaTriangulo).replace(',', '.');
		//areaCrFormated = df.format(areaCirculo).replace(',', '.');
		//areaRgFormated = df.format(areaRectangulo).replace(',', '.');

		// Retomamos el número a double
		//areaTriangulo = Double.parseDouble(areaTrFormated);
		areaTriangulo = Double.parseDouble(df.format(areaTriangulo).replace(',', '.'));
		areaCirculo = Double.parseDouble(df.format(areaCirculo).replace(',', '.'));
		areaRectangulo = Double.parseDouble(df.format(areaRectangulo).replace(',', '.'));

		
		//Condicional para saber a que figura pertenencen los datos proporcionados
		if (valor3 == areaTriangulo) {
			figura = "Triángulo";
		} else if (valor3 == areaCirculo) {
			figura = "Círculo";
		} else if (valor3 == areaRectangulo){
			figura = "Rectángulo";
		} else {
			figura = "No corresponde a ninguna figura";
		}
		System.out.println("La figura es: " + figura);
	}
	
	public static void ejercicio29() {
		// Ejercicio 29
		final double porcentajeVentas = 0.33, porcentajeExtra = 0.2;
		double ventasDepartamento1, ventasDepartamento2, ventasDepartamento3, totalVentas, salarioMensual, parteVenta, salarioMensualDP1,salarioMensualDP2, salarioMensualDP3, salarioExtra;
		
		System.out.print("Importe de ventas globales departamento 1: ");
		ventasDepartamento1 = teclado.nextDouble();
		
		System.out.print("Importe de ventas globales departamento 2: ");
		ventasDepartamento2 = teclado.nextDouble();
		
		System.out.print("Importe de ventas globales departamento 3: ");
		ventasDepartamento3 = teclado.nextDouble();
		
		System.out.print("Ingrese el valor del salario mensual: ");
		salarioMensual = teclado.nextDouble();
		
		totalVentas = ventasDepartamento1 + ventasDepartamento2 + ventasDepartamento3;
		parteVenta = totalVentas * porcentajeVentas;
		
		// Salario si cumple con la condicion
		salarioExtra = salarioMensual + (salarioMensual * porcentajeExtra);
		
		// Operador ternario
		salarioMensualDP1 = (ventasDepartamento1 > parteVenta) ? salarioExtra : salarioMensual;
		salarioMensualDP2 = (ventasDepartamento2 > parteVenta) ? salarioExtra : salarioMensual;
		salarioMensualDP3 = (ventasDepartamento3 > parteVenta) ? salarioExtra : salarioMensual;
		
		System.out.println("\nSalario base mensual: " + salarioMensual);
		System.out.println("Salario departamento 1: " + salarioMensualDP1);
		System.out.println("Salario departamento 2: " + salarioMensualDP2);
		System.out.println("Salario departamento 3: " + salarioMensualDP3);
	}
	
	public static void ejercicio31() {
		// Ejercicio 31
		// Declaracion de variables
		int cantidadKm, totalPagar, cobroBase = 5000, adicional = 0;
		
		// Solicitud de datos
		System.out.print("¿Cuántos Km recorrió?: ");
		cantidadKm = teclado.nextInt();
		
		if (cantidadKm > 300) {
			if(cantidadKm <= 1000) {
				adicional = 200 * (cantidadKm - 300);
			} else {
				adicional = 200 * (1000 - 300) + 150 * (cantidadKm - 1000);
			}
		}
		
		// Calcular el total a pagar, teniendo en cuenta el cobro base mas el adicional
		totalPagar = cobroBase + adicional;
		
		// Mostrar datos
		System.out.println("\nRecorrio " + cantidadKm + "Km");
		System.out.println("Total a pagar: " + totalPagar);
	}
	
	public static void ejercicio33() {
		// Ejercicio 33
		// Declaracion de variables
		double montoCompra, descuento, montoPagar;
		String nombre;
		
		// Solicitud de datos
		System.out.print("Nombre del cliente: ");
		nombre = teclado.nextLine();
		
		System.out.print("Ingrese el monto de la compra: ");
		montoCompra = teclado.nextDouble();
		
		// asignamos el descuento de acuerdo al valor de la compra
		if(montoCompra > 15000) {
			descuento = 0.25;
		} else if (montoCompra > 7000 && montoCompra <= 15000) {
			descuento = 0.18;
		} else if (montoCompra > 1000 && montoCompra <= 7000) {
			descuento = 0.11;
		} else if (montoCompra > 500 && montoCompra <= 1000) {
			descuento = 0.05;
		} else {
			descuento = 0;
		}
		
		// Calcular el total a pagar, tomando el valor de la compra menos el descuento correspondiente
		montoPagar = montoCompra - (montoCompra * descuento);
		
		// Mostrar datos
		System.out.println("\nNombre del cliente: " + nombre);
		System.out.println("Monto de la compra: " + montoCompra);
		System.out.println("Monto a pagar: " + montoPagar);
		System.out.println("Descuento: " + (montoCompra * descuento) + "(" + (int)(descuento*100) + "%)");
	}
	
	public static void ejercicio35() {
		// Ejercicio 35
		// Declaracion de variables
		double temperatura;
		String deporte;
		
		// Solicitud de datos
		System.out.print("Ingrese la temperatura en Fahrenheit: ");
		temperatura = teclado.nextDouble();
		
		// De acuerdo a la temperatura se le asigna el valor correspondiente a la variable deporte
		if (temperatura <= 10) {
			deporte = "Marcha";
		} else if (temperatura <= 32) {
			deporte = "Esquí";
		} else if (temperatura <= 70) {
			deporte = "Golf";
		} else if (temperatura <= 85) {
			deporte = "Tenis";
		} else {
			deporte = "Natación";
		}
		
		// Mostrar datos
		System.out.println("Temperatura: " + temperatura + "°F");
		System.out.println("Se recomienda el deporte: " + deporte);
	}
	
	public static void ejercicio37() {
		// Ejercicio 37
		// Declaracion de variables
		double area, numero1, numero2, numero3, numeroMayor, sumaNumerosMenores, mitadNumeros;
		String tipoTriangulo;
		// String areaTrFormated, areaCrFormated, areaRgFormated;
		DecimalFormat df = new DecimalFormat("#.##"); // FORMATO PARA QUE SOLO HAYAN DOS DECIMALES
		
		// Solicitud de datos
		System.out.print("Ingrese el número 1: ");
		numero1 = teclado.nextDouble();
		
		System.out.print("Ingrese el número 2: ");
		numero2 = teclado.nextDouble();
		
		System.out.print("Ingrese el número 3: ");
		numero3 = teclado.nextDouble();
		
		// Indentificar cual de los 3 numeros es mayor
		if(numero1 > numero2 && numero1 > numero3) {
			numeroMayor = numero1;
			sumaNumerosMenores = numero2 + numero3;
		} else if(numero2 > numero3) {
			numeroMayor = numero2;
			sumaNumerosMenores = numero1 + numero3;
		} else {
			numeroMayor = numero3;
			sumaNumerosMenores = numero1 + numero2;
		}
		
		// Verificar si es un triango, para esto la suma de los dos lados menores debe ser mayor que el lado mayor
		if(sumaNumerosMenores > numeroMayor) {
			// Es un triangulo
			if(numero1 == numero2 && numero1 == numero3) {
				// todos los lados son iguales
				tipoTriangulo = "Equilátero";
			} else if(numero1 == numero2 || numero2 == numero3) {
				// 2 lados iguales y 1 diferente. 
				tipoTriangulo = "Isósceles";
			} else {
				// Todos los lados diferentes.
				tipoTriangulo = "Escaleno";
			}
			
			// Calculamos el valor de S para calcular el area S es la mitad de la suma de los lados A, B y C. 
			mitadNumeros = (numero1 + numero2 + numero3) / 2;
			
			// Calculamos el area del triangulo
			area = Math.sqrt(mitadNumeros * (mitadNumeros - numero1) * (mitadNumeros - numero2) * (mitadNumeros - numero3));
			
			System.out.println("\nTipo de triángulo: " + tipoTriangulo);
			System.out.println("Area: " + df.format(area));
			
		} else {
			// No es un triangulo
			tipoTriangulo = "\nLos valores no corresponden a un triángulo";
			System.out.println(tipoTriangulo);
		}
	}
	
	public static void ejercicio39() {
		// Ejercicio 39
		// Declaracion de variables
		double costoInicial, tasaDevaluacionCarro, tasaIncrementoTerreno, devaluacionTotalCarro, incrementoTotalTerreno, mitadIncrementoTerreno;
		
		// Solicitud de datos
		System.out.print("Ingrese el costo inicial del automóvil o terreno: ");
		costoInicial = teclado.nextDouble();
		
		System.out.print("Ingrese tasa de devaluación anual del automóvil: ");
		tasaDevaluacionCarro = teclado.nextDouble();
		
		System.out.print("la tasa de incremento anual del terreno: ");
		tasaIncrementoTerreno = teclado.nextDouble();
		
		// Calcular la devaluacion del carro a 3 años
		devaluacionTotalCarro = costoInicial * Math.pow((1 - tasaDevaluacionCarro), 3);
		// Calcular el incremento del terreno a 3 años
		incrementoTotalTerreno = costoInicial * Math.pow((1 + tasaIncrementoTerreno), 3);
		// Calcular la mitad del incremento del terreno
		mitadIncrementoTerreno = 0.5 * incrementoTotalTerreno;
		
		System.out.println("");
		
		if(devaluacionTotalCarro <= mitadIncrementoTerreno) {
			System.out.println("Es recomendable comprar el automóvil.");
		} else {
			System.out.println("Es recomendable comprar el terreno.");
		}
	}
	
	public static void ejercicio41() {
		// Ejercicio 41
		// Declaracion de variables
		double numMtsporHectareas, porcentajePino, porcentajeOyamel, porcentajeCedro, mtsPino, mtsOyael, mtsCedro;
		int cantHectareas, valorHectarea = 10000, numPino, numOyamel, numCedro;
		
		// Solicitud de datos
		System.out.print("Ingrese el número de hectareas: ");
		cantHectareas = teclado.nextInt();
		
		// Conversion de hectareas - cada hectarea equivale a 10mil metros cuadrados
		numMtsporHectareas = cantHectareas * valorHectarea;
		
		// condicion para ver la proporcion que tendra cada tipo de arbol
		if (numMtsporHectareas > 1000000) {
			porcentajePino = 0.7;
			porcentajeOyamel = 0.2;
			porcentajeCedro = 0.1;
		} else {
			porcentajePino = 0.5;
			porcentajeOyamel = 0.3;
			porcentajeCedro = 0.2;
		}
		
		//Metros disponibles
		mtsPino = numMtsporHectareas * porcentajePino;
		mtsOyael = numMtsporHectareas * porcentajeOyamel;
		mtsCedro = numMtsporHectareas * porcentajeCedro;
		
		//Calcular cuantos pinos, oyameles y cedros tendrá que sembrar en el bosque
		// en 10 metros cuadrados caben 8 pinos | 8 árboles / 10 metros cuadrados = 0.8 árboles por metro.
		// numPino = mtsPino * 0.8;
		numPino = (int) (mtsPino * 0.8);
		// en 15 metros cuadrados caben 15 oyameles | 15 árboles / 15 metros cuadrados = 1 árboles por metro.
		// numOyamel = mtsOyael * 1;
		numOyamel = (int) (mtsOyael * 1);
		// en 18 metros cuadrados caben 10 cedros | 10 árboles / 18 metros cuadrados = 0.56 árboles por metro.
		// numCedro = mtsCedro * 0.56;
		numCedro = (int) (mtsCedro * 0.56);
		
		// Mostrar datos
		System.out.println("\nNúmero de hectareas: " + cantHectareas);
		System.out.println("Número de metros cuadrados: " + numMtsporHectareas);
		System.out.println("Metros para los Pinos(" + (int)(porcentajePino * 100) + "%): " + mtsPino);
		System.out.println("Metros para los Oyamel(" + (int)(porcentajeOyamel * 100) + "%): " + mtsOyael);
		System.out.println("Metros para los Cedros(" + (int)(porcentajeCedro * 100) + "%): " + mtsCedro);
		System.out.println("Cantidad de Pinos a sembrar: " + numPino);
		System.out.println("Cantidad de Oyamel a sembrar: " + numOyamel);
		System.out.println("Cantidad de Cedros a sembrar: " + numCedro);
	}
	
	public static void ejercicio43() {
		// Ejercicio 43
		// Declaracion de variables
		double capitalActual, valorPrestamo = 0, nuevoCapital;
		
		System.out.print("Ingrese el valor de su capital: ");
		capitalActual = teclado.nextDouble();
		
		//Si actualmente su capital se encuentra con saldo negativo
		if(capitalActual < 0) {
			valorPrestamo = 10000 + Math.abs(capitalActual);;
			nuevoCapital = 10000;
		} else if(capitalActual < 20000) {
			// pedirá un préstamo bancario para tener un nuevo saldo de $20000
			valorPrestamo = 20000 - capitalActual;
			nuevoCapital = 20000;
		} else {
			// no pedirá un préstamo
			nuevoCapital = capitalActual;
		}
		
		// repartición presupuesto del presupuesto
		// $5000 para equipo de cómputo y $2000 para mobiliario
		nuevoCapital -= 7000;
		// el resto la mitad será para la compra de insumos y la otra para otorgar incentivos al personal
		nuevoCapital /= 2;
		
		// Mostrar datos
		System.out.println("\nValor para equipo de cómputo: $5000");
		System.out.println("Valor para mobiliario: $2000");
		System.out.println("Valor para Compra de insumos: $" + nuevoCapital);
		System.out.println("Valor para Compra de incentivos al personal: $" + nuevoCapital);
		System.out.println("Valor del prestamo al banco: $" + valorPrestamo);
	}
	
	public static void ejercicio45() {
		// Ejercicio 45
		double valorA, valorB, valorC, valorD, valorX1 = 0, valorX2 = 0;
		boolean esValido;
		DecimalFormat df = new DecimalFormat("#.##"); // FORMATO PARA QUE SOLO HAYAN DOS DECIMALES
		
		System.out.print("Ingrese el valor de A: ");
		valorA = teclado.nextDouble();
		
		System.out.print("Ingrese el valor de B: ");
		valorB = teclado.nextDouble();
		
		System.out.print("Ingrese el valor de C: ");
		valorC = teclado.nextDouble();
		
		// Calcular el discriminante - Formula D= Bˆ2­4*A*C
		valorD = Math.pow(valorB, 2) - 4 * valorA * valorC;
		
		if(valorD == 0) {
			esValido = true;
			// X1 = X2 = -B/(2*a)
			valorX1 = valorX2 = -valorB / (2 * valorA);
			if(valorX1 == -0.0) {
				valorX1 = valorX2 = 0;
			}
		} else if(valorD > 0) {
			esValido = true;
			// X1 = (-B + SQRT(Bˆ2­4*A*C))/(2*A)
			valorX1 = (-valorB + Math.sqrt(valorD)) / (2 * valorA);
			// X2 = (-B - SQRT(Bˆ2-4*A*C))/(2*A)
			valorX2 = (-valorB - Math.sqrt(valorD)) / (2 * valorA);
		} else {
			// No tiene solucion en los reales
			esValido = false;
		}
		System.out.println("");
		if(esValido) {
			System.out.println("Valor de X1: " + df.format(valorX1));
			System.out.println("Valor de X2: " + df.format(valorX2));
		} else {
			System.out.println("No tiene solución en los Reales");
		}
	}
}