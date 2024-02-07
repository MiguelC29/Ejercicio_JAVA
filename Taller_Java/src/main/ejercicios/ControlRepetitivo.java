package main.ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ControlRepetitivo {
	static Scanner teclado = new Scanner(System.in);
	// Estructuras de Control Repetitivo
	// NÚMERO DETERMINADO DE ITERACIONES.
	public static void ejercicio47() {
		// Ejercicio 47
		for (int numero = 1; numero < 100; numero+=2) {
			if(numero % 7  == 0) {
				continue;
				// se omiten 7, 21, 35, 49, 63, 77, 91
			}
			System.out.println(numero);
		}
	}
	
	public static void ejercicio49() {
		// Ejercicio 49
		// Declaracion de variables
		final String rtaCorrecta1 = "A", rtaCorrecta2 = "C", rtaCorrecta3 = "D";
		String pregunta1, pregunta2, pregunta3;
		// Contadores
		int bien3 = 0, bien1y2 = 0, bien1y3 = 0, bien2y3 = 0, bienPTres = 0, bienPDos = 0, bienPUno = 0, ninguna = 0;
		
		System.out.println("PREGUNTAS DE A, B, C o D");
		for (int personas = 1; personas < 6; personas++) {
			System.out.print("Respuestas de la persona " + personas);
			System.out.print("\nRespuesta pregunta 1: ");
			pregunta1 = (teclado.next()).toUpperCase();
			System.out.print("Respuesta pregunta 2: ");
			pregunta2 = (teclado.next()).toUpperCase();
			System.out.print("Respuesta pregunta 3: ");
			pregunta3 = (teclado.next()).toUpperCase();
			System.out.println("");
			
			if (pregunta1.equals(rtaCorrecta1) && pregunta2.equals(rtaCorrecta2) && pregunta3.equals(rtaCorrecta3)) {
				//Tres preguntas bien
				bien3++;
			} else if (pregunta1.equals(rtaCorrecta1) && pregunta2.equals(rtaCorrecta2)) {
				// Primera y segunda pregunta bien
				bien1y2++;
			} else if (pregunta1.equals(rtaCorrecta1) && pregunta3.equals(rtaCorrecta3)) {
				// Primera y tercera pregunta bien
				bien1y3++;
			} else if (pregunta2.equals(rtaCorrecta2) && pregunta3.equals(rtaCorrecta3)) {
				// Segunda y tercera pregunta bien
				bien2y3++;
			} else if (pregunta1.equals(rtaCorrecta1)) {
				// Solo la primera pregunta bien
				bienPUno++;
			} else if (pregunta2.equals(rtaCorrecta2)) {
				// Solo la segunda pregunta bien
				bienPDos++;
			} else if (pregunta3.equals(rtaCorrecta3)) {
				// Solo la tercera pregunta bien
				bienPTres++;
			} else {
				// Ninguna pregunta bien
				ninguna++;
			}
		}
		
		// Mostrar totales
		System.out.println("Cantidad de personas: 100");
		System.out.println("Resumen respuestas de acuerdo a las siguientes condiciones:");
		System.out.println("Tres preguntas bien: " + bien3);
		System.out.println("Primera y segunda pregunta bien: " + bien1y2);
		System.out.println("Primera y tercera pregunta bien: " + bien1y3);
		System.out.println("Segunda y tercera pregunta bien: " + bien2y3);
		System.out.println("Solo la primera pregunta bien: " + bienPUno);
		System.out.println("Solo la segunda pregunta bien: " + bienPDos);
		System.out.println("Solo la tercera pregunta bien: " + bienPTres);
		System.out.println("Ninguna pregunta bien: " + ninguna);
	}
	
	public static void ejercicio51() {
		// Ejercicio 51
		// Declaracion de variables
		int sucesion = 6, suma = sucesion; // sucession se inicializa con el primer valor de la sucesion en este caso el 6
		
		for (int i = 1; i < 12; i++) {
			sucesion += 5; // la sucesion aumenta de 5 en 5
			suma += sucesion; // Vamos acumulando y sumando los numeros
		}
		// Mostrar datos
		System.out.println("Término doceavo(a12): " + sucesion);
		System.out.println("Suma de los doce primeros términos: " + suma);
	}
	
	public static void ejercicio53() {
		// Ejercicio 53
		// Declaracion de variables
		int cantEmpleados, edad, tipoEmpleado, numHorasTrabajadas, cantExtranjeros = 0, vn1 = 0, vn2 = 0, vn3 = 0, sumEdades = 0, promedioEdad;
		String nombreEmpleado, nacionalidad;
		double sueldoBasico, pagoPorHora, seguroSocial, totalSueldos = 0, sueldoBruto;
		
		// Solicitar el número de empleados (M)
		System.out.print("Ingrese el número de empleados: ");
		cantEmpleados = teclado.nextInt();
		
		// Procesar cada empleado
		for (int i = 1; i <= cantEmpleados; i++) {
			System.out.println("Datos del empleado " + i);
			System.out.print("Nombre del empleado: ");
			teclado.nextLine();
			nombreEmpleado = teclado.nextLine();
			
			System.out.print("Nacionalidad (V para venezolano, E para extranjero): ");
			nacionalidad = teclado.next();
			
			System.out.print("Edad: ");
			edad = teclado.nextInt();
			
			System.out.print("Tipo de empleado (1,2 o 3): ");
			tipoEmpleado = teclado.nextInt();
			
			System.out.print("Número de horas trabajadas: ");
			numHorasTrabajadas = teclado.nextInt();
			
			// Calcular Sueldo Básico
			switch (tipoEmpleado) {
				case 1: {
					pagoPorHora = 5000;
					break;
				}
				case 2: {
					pagoPorHora = 10000;
					break;
				}
				case 3: {
					pagoPorHora = 15000;
					break;
				}
				default:
					System.out.println("No es un tipo de empleado válido");
					pagoPorHora = 0;
			}
			
			// Calcular sueldo
			sueldoBasico = numHorasTrabajadas * pagoPorHora;
			
			// Calcular Seguro Social
			seguroSocial = ((sueldoBasico > 100000) ? sueldoBasico * 0.03 : 0);
			
			// Calcular sueldo con seguro social
			sueldoBruto = sueldoBasico + seguroSocial;
			
			// RESUMEN DATOS EMPLEADO
			System.out.println("\nNombre empleado " + i + ": " + nombreEmpleado);
			System.out.println("Nacionalidad: " + (nacionalidad.toUpperCase().equals("V") ? "Venezolano" : "Extranjero"));
			System.out.println("Edad: " + edad);
			System.out.println("Tipo de empleado: " + tipoEmpleado);
			System.out.println("Horas trabajadas: " + numHorasTrabajadas);
			System.out.println("Salario: " + sueldoBruto);
			System.out.println("");
			
			// Calcular Total general
			totalSueldos += sueldoBruto;
			// Calcular Total edades
			sumEdades += edad;
			
			// Calcular Totales de venezolanos por tipo de empleado
			if(nacionalidad.toUpperCase().equals("V")) {
				switch (tipoEmpleado) {
					case 1: {
						vn1++;
						break;
					}
					case 2: {
						vn2++;
						break;
					}
					case 3: {
						vn3++;
						break;
					}
				}
			}
			
			// Calcular Total de extranjeros cuya edad es impar
			if(nacionalidad.toUpperCase().equals("E") && edad % 2 != 0) {
				cantExtranjeros++;
			}
		}
		
		// Calcular Promedio de edad
		promedioEdad = sumEdades / cantEmpleados;
		
		// Mostrar datos
		System.out.println("Resumen Nómina semanal");
		System.out.println("Cantidad de empleados: " + cantEmpleados);
		System.out.println("Empleados venezolanos tipo 1: " + vn1);
		System.out.println("Empleados venezolanos tipo 2: " + vn2);
		System.out.println("Empleados venezolanos tipo 3: " + vn3);
		System.out.println("Empleados extranjeros con edad impar: " + cantExtranjeros);
		System.out.println("Promedio de edad de los empleados: " + promedioEdad);
		System.out.println("Valor general a pagar en sueldos: " + totalSueldos);
	}
	
	//NÚMERO INDETERMINADO DE ITERACIONES.
	public static void ejercicio55() {
		// Ejercicio 55
		// Declaracion de variables
		double  k = 1, sumatoria, sumaTotal = 0, pruebaMenor;
		DecimalFormat df = new DecimalFormat("#.##");
		
		while (sumaTotal <= 1000) {
			// Podemos simplificar la fracción (k∧2+1)/k) com k + 1/k
			sumatoria = k + (1/k);
			// Vamos acumulado y sumando los resultados de la variable sumatoria
			sumaTotal += sumatoria;
			// Aumentamos en 1 el valor de la variable k
			k++;
			
			// Comprobamos que la siguiente iteracion de la operacion no sea mayor a 1000, ya que sin esto como el valor aun sigue menor a 1000 va entrar
			// y cuando haga el proceso nos va devolver un numero mayor a 1000
			pruebaMenor = sumaTotal + (k + (1/k));
			if(pruebaMenor > 1000) {
				// Restamos 1 al valor de k, ya que como exdio el valor de 1000, no nos sirve que le sume 1
				k--;
				break;
			}
		}
		// Mostrar datos
		System.out.println("Suma aproximada a 1000: " + df.format(sumaTotal));
		System.out.println("Número de términos necesarios: " + k);
	}
	
	public static void ejercicio57() {
		// Ejercicio 57
		// Declaracion de variables
		double numero, raizCuadrada, x = 0.1;
		// Validar la entrada del usuario
		do {
			System.out.print("Ingrese un número positivo: ");
			numero = teclado.nextDouble();
		} while(numero <= 0);
		
		// Calcular la raíz cuadrada
		do {
            raizCuadrada = (x + numero / x) / 2;
            // Asegurar que la diferencia sea suficientemente pequeña
            if (Math.abs(x - raizCuadrada) <= 0.000001) {
                break;
            }
            x = raizCuadrada;
        } while (true);
		// Mostrar la raiz cuadrada
		System.out.println("Raiz cuadrada de " + numero + ": " + raizCuadrada);
	}
	
	public static void ejercicio59() {
		// Ejercicio 59
		// Declaracion de variables
		double notaMenorProgra = 6,porcentajeNoIngles, promedioGeneralProgramacion, porcentajeAlumnosMatematicas;
		double notaMatematicas, notaProgramacion, notaIngles;
		int cantEstudiantes = 0, cantEstudiantesNoIngles = 0, cantEstAprobaronTodo = 0, sumNotasProgramacion = 0, canEstReprobaronMatematicas = 0, cantEstPrMatematicas = 0;
		int cantProgramacion = 0, cantIngles, cantMatematicas = 0;
		String opcion;
		
		System.out.println("Ingrese las notas del primer parcial (notas de 1 a 5)");
		
		do {
			System.out.println("Ingrese -1 en la nota si el alumno no presento el examen");
			System.out.print("Nota de Matemáticas: ");
			notaMatematicas = teclado.nextDouble();
			
			System.out.print("Nota de Programación: ");
			notaProgramacion = teclado.nextDouble();
			
			System.out.print("Nota de Inglés: ");
			notaIngles = teclado.nextDouble();
			
			cantEstudiantes++;
			
			// Nota menor de Programación.
			if(notaProgramacion != -1 && notaProgramacion < notaMenorProgra) {
				notaMenorProgra = notaProgramacion;
			}
			
			// Cantidad de alumnos que no presentaron el examen de ingles
			if(notaIngles == -1) {
				cantEstudiantesNoIngles++;
			}
			
			// Cantidad de alumnos que obtuvieron una nota igual o superior a 3 en los 3 examen
			if(notaIngles >= 3 && notaProgramacion >= 3 && notaMatematicas >= 3) {
				cantEstAprobaronTodo++;
			}
			
			// Acumulamos y Sumamos las notas de programacion 
			if (notaProgramacion != -1 && notaProgramacion >= 0) {
				sumNotasProgramacion += notaProgramacion;	
			}
			
			// Cantidad de alumnos que aprobaron el examen de matematicas
			if(notaMatematicas != -1 && notaMatematicas >= 0) {
				cantEstPrMatematicas++;
			}
			
			// Cantidad de alumnos que reprobaron el examen de matematicas
			if (notaMatematicas != -1 && notaMatematicas >= 0 && notaMatematicas < 3) {
				canEstReprobaronMatematicas++;
			}
			
			// Cantidad de alumnos que presentaron el examen de matematicas
			if(notaMatematicas >= 0) {
				cantMatematicas++;
			}
			
			// Cantidad de alumnos que presentaron el examen de programacion
			if(notaProgramacion >= 0) {
				cantProgramacion++;
			}
			
			// Cantidad de estudiantes que presentaron el examen de ingles
			cantIngles = cantEstudiantes - cantEstudiantesNoIngles;
						
			System.out.print("\nIngrese S ó SI para seguir agregando notas y N ó No para finalizar: ");
			opcion = teclado.next();
			System.out.println("");
		} while ((opcion.toUpperCase().equals("SI")) || (opcion.toUpperCase().equals("S")));	
		
		// Porcentaje de alumnos que no presentaron el examen de inglés, respecto a los que sí presentaron.
		porcentajeNoIngles = (double) cantEstudiantesNoIngles / cantEstudiantes;
		
		// Promedio general en Programación. - los que presentaron el examen, si se desea que asi no se presente el examen entonces usar var canEstudiantes
		promedioGeneralProgramacion = sumNotasProgramacion / (double)cantProgramacion;
		
		// Porcentaje de alumnos que reprobaron Matemática, respecto al total de alumnos que presentaron el examen de matemática.
		porcentajeAlumnosMatematicas = (double) canEstReprobaronMatematicas / cantEstPrMatematicas;
		
		// Mostrar información
		System.out.println("Cantidad total de alumnos: " + cantEstudiantes);
		System.out.println("Cantidad alumnos que presentaron el examen de Inglés: " + cantIngles);
		System.out.println("Cantidad alumnos que presentaron el examen de Matemáticas: " + cantMatematicas);
		System.out.println("Cantidad alumnos que presentaron el examen de Programación: " + cantProgramacion);
		System.out.println("Nota menor de programación: " + notaMenorProgra);
		System.out.println("Porcentaje alumnos que no presentaron el examen de inglés: " + (porcentajeNoIngles * 100) + "%");
		System.out.println("Número de alumnos que aprobaron todas las materias: " + cantEstAprobaronTodo);
		System.out.println("Promedio general en Programación: " + promedioGeneralProgramacion);
		System.out.println("Porcentaje de alumnos que reprobaron Matemáticas: " + (porcentajeAlumnosMatematicas * 100) + "%");
	}
	
	public static void ejercicio61() {
		// Ejercicio 61
		// Declaracion de variables
		int multiplicador, multiplicando, mulMultiplicando, resultado = 0, divMultiplicador;
		
		// Solicitud de datos
		System.out.print("Ingrese el primer número (multiplicador): ");
		multiplicador = teclado.nextInt();
		
		System.out.print("Ingrese el segundo número (multiplicando): ");
		multiplicando = teclado.nextInt();
		
		// Asignamos el valor para que tome los valores digitados por el usuario
		mulMultiplicando = multiplicando;
		divMultiplicador = multiplicador;
		
		do {
			// Si el multiplicador es impar se suma su respectivo multiplicando
			if(divMultiplicador % 2 != 0) {
				resultado += mulMultiplicando;
			}
			// Multiplicamos por 2 el multiplicando
			mulMultiplicando *= 2;
			// Dividimos por 2 el multiplicador
			divMultiplicador /= 2;
		} while (divMultiplicador >= 1);
		
		// Mostrar resultado
		System.out.println(multiplicador + " x " + multiplicando + " = " + resultado);
	}
	
	public static void ejercicio63() {
		System.out.println("En proceso pronto lo tendras disponible");
	}
	
	public static void ejercicio65() {
		System.out.println("En proceso pronto lo tendras disponible");
	}
	
	public static void ejercicio67() {
		System.out.println("En proceso pronto lo tendras disponible");
	}
	
	public static void ejercicio69() {
		System.out.println("En proceso pronto lo tendras disponible");
	}
	
	public static void ejercicio71() {
		System.out.println("En proceso pronto lo tendras disponible");
	}
}