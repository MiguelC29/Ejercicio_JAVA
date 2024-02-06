package main;

import java.text.DecimalFormat;
import java.util.Scanner;

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
								ejercicio1();
								break;
							}
							case 3: {
								ejercicio3();
								break;
							}
							case 5: {
								ejercicio5();
								break;
							}
							case 7: {
								ejercicio7();
								break;
							}
							case 9: {
								ejercicio9();
								break;
							}
							case 11: {
								ejercicio11();
								break;
							}
							case 13: {
								ejercicio13();
								break;
							}
							case 15: {
								ejercicio15();
								break;
							}
							case 17: {
								ejercicio17();
								break;
							}
							case 19: {
								ejercicio19();
								break;
							}
							case 21: {
								ejercicio21();
								break;
							}
							case 23: {
								ejercicio23();
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
								ejercicio25();
								break;
							}
							case 27: {
								ejercicio27();
								break;
							}
							case 29: {
								ejercicio29();
								break;
							}
							case 31: {
								ejercicio31();
								break;
							}
							case 33: {
								ejercicio33();
								break;
							}
							case 35: {
								ejercicio35();
								break;
							}
							case 37: {
								ejercicio37();
								break;
							}
							case 39: {
								ejercicio39();
								break;
							}
							case 41: {
								ejercicio41();
								break;
							}
							case 43: {
								ejercicio43();
								break;
							}
							case 45: {
								ejercicio45();
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
								ejercicio47();
								break;
							}
							case 49: {
								ejercicio49();
								break;
							}
							case 51: {
								ejercicio51();
								break;
							}
							case 53: {
								ejercicio53();
								break;
							}
							case 55: {
								ejercicio55();
								break;
							}
							case 57: {
								ejercicio57();
								break;
							}
							case 59: {
								ejercicio59();
								break;
							}
							case 61: {
								ejercicio61();
								break;
							}
							case 63: {
								ejercicio63();
								break;
							}
							case 65: {
								ejercicio65();
								break;
							}
							case 67: {
								ejercicio67();
								break;
							}
							case 69: {
								ejercicio69();
								break;
							}
							case 71: {
								ejercicio71();
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
	
	// Estructura de Control Secuencial
	public static void ejercicio1() {
		// Ejercicio 1
		// DECLARACIÓN DE VARIABLES
		int edadPersona1, edadPersona2, edadPersona3;
		double promedio;
		DecimalFormat df = new DecimalFormat("#.##"); // FORMATO PARA QUE SOLO HAYAN DOS DECIMALES
		
		// SOLICITUD DATOS
		System.out.println("PROMEDIO DE EDADES DE 3 PERSONAS");
		System.out.print("Por favor, ingrese la edad de la persona 1: ");
		edadPersona1 = teclado.nextInt();
		
		System.out.print("Por favor, ingrese la edad de la persona 2: ");
		edadPersona2 = teclado.nextInt();
		
		System.out.print("Por favor, ingrese la edad de la persona 3: ");
		edadPersona3 = teclado.nextInt();
		
		// CALCULO DEL PROMEDIO
		promedio = (double)(edadPersona1 + edadPersona2 + edadPersona3) / 3;
		System.out.println("\nEl promedio de edad de las 3 personas es: " + df.format(promedio));
	}
	
	public static void ejercicio3() {
		// Ejercicio 3
		// Declaración de variables
		double porcentajeComision = 0.1, sueldoBase, valorVentas, comision, total;
		
		// Solicitud de datos
		System.out.print("Ingrese su sueldo base: ");
		sueldoBase = teclado.nextDouble();
		
		// Se le solicita el valor total de las ventas, es decir la sumatoria del total de las 3 ventas
		System.out.print("Ingrese el saldo total de ventas del mes: ");
		valorVentas = teclado.nextDouble();
		
		// Calculo comisión, teniendo en cuenta el total de las ventas multiplicado por el porcentaje de comisión
		comision = valorVentas * porcentajeComision;
		
		// Calculo del sueldo total, sumando el sueldo base más las comisiones
		total = sueldoBase + comision;
		
		System.out.println("\nSueldo base: " + sueldoBase);
		System.out.println("% por comisión: " + (int)(porcentajeComision*100) + "%");
		System.out.println("Valor por comisiones: " + comision);
		System.out.println("Total: " + total);
	}
	
	public static void ejercicio5() {
		// Ejercicio 5
		// Declaració de variables
		double nota1, nota2, nota3, promedioNotas, notaExamen, trabajoFinalNota, notaFinal;
		DecimalFormat df = new DecimalFormat("#.##"); // FORMATO PARA QUE SOLO HAYAN DOS DECIMALES
		
		// Solicitud de datos
		System.out.print("Ingrese la nota parcial 1: ");
		nota1 = teclado.nextDouble();
		
		System.out.print("Ingrese la nota parcial 2: ");
		nota2 = teclado.nextDouble();
		
		System.out.print("Ingrese la nota parcial 3: ");
		nota3 = teclado.nextDouble();
		
		System.out.print("Ingrese la nota del examen final: ");
		notaExamen = teclado.nextDouble();
		
		System.out.print("Ingrese la nota del trabajo final: ");
		trabajoFinalNota = teclado.nextDouble();
		
		//Calculo del promedio de las 3 notas parciales
		promedioNotas = (nota1 + nota2 + nota3) / 3;
		
		// Calculo de la nota final
		notaFinal = (promedioNotas*0.55) + (notaExamen*0.30) + (trabajoFinalNota*0.15);
		
		System.out.println("\nCalificación final de computación");
		System.out.println("Su nota final es: " + df.format(notaFinal));
	}
	
	public static void ejercicio7() {
		// Ejercicio 7
		// 1 metro = 39.27 pulgadas; 1 pie = 12 pulgadas.
		// Declaración de variables
		final double pulgadasXmetro = 39.27;
		final int pulgadasXpie = 12;
		double cantidadMetros, pies, pulgadas, pulgadasRestantes;
		DecimalFormat df = new DecimalFormat("#.##"); // FORMATO PARA QUE SOLO HAYAN DOS DECIMALES
		
		// Solicitud de datos
		System.out.print("Cantidad de metros: ");
		cantidadMetros = teclado.nextDouble();
		
		// Calculo para obtener las pulgadas, multiplicamos los metros ingresados por el valor de pulgadaspormetro
		pulgadas = cantidadMetros * pulgadasXmetro;
		// Calculo para obtener los pies, para esto dividimos las pulgadas obtenidas en el calculo anterior por el valor de pulgadasporpies
		pies = pulgadas / pulgadasXpie;
		pulgadasRestantes = (pulgadas % pulgadasXpie);
		
		System.out.println("\nDATOS CONVERSIÓN");
		System.out.println("Metros: " + cantidadMetros);
		System.out.println("Pulgas: " + df.format(pulgadas));
		System.out.println("Pulgas Restantes: " + df.format(pulgadasRestantes));
		System.out.println("Pies: " + (int)pies);
	}
	
	public static void ejercicio9() {
		// Ejercicio 9
		// Declaración de variables
		double salarioNeto, precioHora, salario;
		int horasTrabajadas;
		
		// Solicitud de datos
		System.out.print("Ingrese el precio por hora: ");
		precioHora = teclado.nextDouble();
		
		System.out.print("Ingrese el número de horas trabajadas: ");
		horasTrabajadas = teclado.nextInt();
		
		// Calculo de salario bruto, multiplicamos el precio por hora por la cantidad de horas trabajadas
		salario = precioHora * horasTrabajadas;
		// Calculo el salario neto que seria el salario menos los impuestos
		salarioNeto = salario - (salario * 0.2);
		
		System.out.println("\nHoras trabajadas: " + horasTrabajadas);
		System.out.println("Valor hora: " + precioHora);
		System.out.println("Sueldo base: " + salario);
		System.out.println("Descuento fijo (20%): " + (salario * 0.2));
		System.out.println("Salario neto: " + salarioNeto);
	}
	
	public static void ejercicio11() {
		// Ejercicio 11
		//Declaración de variables
		String nombre;
		//porcentajes
		final double porcentajeHoraExtra = 1.25, paroForzoso = 0.05, politicaHabitacional = 0.02, cajaAhorro = 0.07;
		int horasNomarles, horasExtras, numeroHijos;
		double valorHoraNormal, actualizacionAcademica, primaHogar, totalHorasExtras, totalParoForzoso, totalCajaAhorro, salarioBase;
		double totalPoliticaHabitacional, totalAsigXHijos, salarioNeto, totalDeducciones, totalAsignaciones;
		
		//Solicitud de datos
		System.out.print("¿Cuál es su nombre?: ");
		nombre = teclado.nextLine();
		
		System.out.print("Número de horas normales trabajadas: ");
		horasNomarles = teclado.nextInt();
		
		System.out.print("Valor de 1 hora normal: ");
		valorHoraNormal = teclado.nextDouble();
		
		System.out.print("Número de horas extras trabajadas: ");
		horasExtras = teclado.nextInt();
		
		System.out.print("¿Cuántos hijos tiene?: ");
		numeroHijos = teclado.nextInt();
		
		// CALCULO DEL TOTAL A DEVENGAR DE HORAS EXTRAS, TENIENDO EN CUENTO EN NUMERO DE HORAS EXTRAS Y EL PRECIO DE HORA NORMAL MAS 25%
		totalHorasExtras = horasExtras * (valorHoraNormal * porcentajeHoraExtra);
		
		//CALCULO SALARIO BASE
		salarioBase = (horasNomarles * valorHoraNormal) + totalHorasExtras;

		// DEDUCCIONES - LO QUE SE LE REDUCE AL SUELDO UN TRABAJADOR
		totalParoForzoso = salarioBase * paroForzoso;
		totalPoliticaHabitacional = salarioBase * politicaHabitacional;
		totalCajaAhorro = salarioBase * cajaAhorro;
		totalDeducciones = totalParoForzoso + totalPoliticaHabitacional + totalCajaAhorro;
		
		// Asignaciones - LO QUE SE LE DA EXTRA AL SALARIO DEL TRABAJADOR
		actualizacionAcademica = 25000;
		totalAsigXHijos = 17300 * numeroHijos;
		primaHogar = 18000;
		totalAsignaciones = actualizacionAcademica + totalAsigXHijos + primaHogar;
		
		salarioNeto = salarioBase - totalDeducciones + totalAsignaciones;
		
		// DATOS A MOSTRAR
		System.out.println("\nRESUMEN PAGO AL TRABAJADOR/A " + nombre.toUpperCase());
		System.out.println("Horas normales trabajadas: " + horasNomarles);
		System.out.println("Horas extra trabajadas: " + horasExtras);
		System.out.println("Salario base: " + salarioBase);
		System.out.println("-----------------------------------------");
		System.out.println("DEDUCCIONES");
		System.out.println("  -Paro forzoso(5%): " + totalParoForzoso);
		System.out.println("  -Politica habitacional(2%): " + totalPoliticaHabitacional);
		System.out.println("  -Caja de ahorro(7%): " + totalCajaAhorro);
		System.out.println("Total deducciones: " + totalDeducciones);
		System.out.println("-----------------------------------------");
		System.out.println("ASIGNACIONES");
		System.out.println("  -Actualización academica: " + actualizacionAcademica);
		System.out.println("  -Número de hijos: " + numeroHijos);
		System.out.println("  -Total asignación por hijos: " + totalAsigXHijos);
		System.out.println("  -Prima por hogar: " + primaHogar);
		System.out.println("Total asignaciones: " + totalAsignaciones);
		System.out.println("-----------------------------------------");
		System.out.println("Salario neto: " + salarioNeto);
	}
	
	public static void ejercicio13() {
		// Ejercicio 13
		int bll50000, bll20000, bll10000, bll5000, bll2000, bll1000, bll500, bll100, plataBanco;
		
		System.out.print("Cantidad de billetes de $50000: ");
		bll50000 = teclado.nextInt();
		
		System.out.print("Cantidad de billetes de $20000: ");
		bll20000 = teclado.nextInt();
		
		System.out.print("Cantidad de billetes de $10000: ");
		bll10000 = teclado.nextInt();
		
		System.out.print("Cantidad de billetes de $5000: ");
		bll5000 = teclado.nextInt();
		
		System.out.print("Cantidad de billetes de $2000: ");
		bll2000 = teclado.nextInt();
		
		System.out.print("Cantidad de billetes de $1000: ");
		bll1000 = teclado.nextInt();
		
		System.out.print("Cantidad de billetes de $500: ");
		bll500 = teclado.nextInt();
		
		System.out.print("Cantidad de billetes de $100: ");
		bll100 = teclado.nextInt();
		
		
		plataBanco = (bll50000 * 50000) + (bll20000 * 20000) + (bll10000 * 10000) + (bll5000 * 5000) + (bll2000 * 2000) + (bll1000 * 1000) + (bll500 * 500) + (bll100 * 100);
		System.out.println("En total en el banco hay: $" + plataBanco);
	}
	
	public static void ejercicio15() {
		// Ejercicio 15
		// Declaracion de variables
		double totalaPagar, lecturaAnterior, lecturaActual, costoPorKilovatio, kWConsumidos;
		
		//Solicitud de datos
		System.out.print("Ingrese el costo por kilovatio: ");
		costoPorKilovatio = teclado.nextDouble();
		
		System.out.print("Ingrese el valor de la lectura anterior: ");
		lecturaAnterior = teclado.nextDouble();
		
		System.out.print("Ingrese el valor de la lectura actual: ");
		lecturaActual = teclado.nextDouble();
		
		// Calculamos el total de kilovatios consumidos en el mes, para esto restamos el valor de la lectura actual menos el valor de la lectura anterior
		kWConsumidos = lecturaActual - lecturaAnterior;
		// Calculamos el total a pagar tomando el total de kilovatios consumidos por el valor del kilovatio
		totalaPagar = kWConsumidos * costoPorKilovatio;
		
		System.out.println("Monto total a pagar: $" + totalaPagar);
	}
	
	public static void ejercicio17() {
		// Ejercicio 17
		double precioFinal, precioVpublico, porcentaje, ahorrado;
		
		System.out.print("Ingrese el precio de venta al público: ");
		precioVpublico = teclado.nextDouble();
		
		System.out.print("Ingrese el precio final pagado: ");
		precioFinal = teclado.nextDouble();
		
		// obtenemos el valor ahorrado para esto tomamos el pvp y lo restamos por el precio pagado
		ahorrado = precioVpublico - precioFinal;
		
		// Calculamos el porcentaje que se desconto, tomamos el valor ahorrado y lo dividimos por el pvp, luego para que nos de un número entero lo múltiplicamos por 100
		porcentaje = (ahorrado / precioVpublico) * 100;
		
		System.out.println("\nPrecio al público: " + precioVpublico);
		System.out.println("Precio con descuento: " + precioFinal);
		System.out.println("Descuento: " + (int) (porcentaje) + "%");
		System.out.println("Ahorró: " + ahorrado);
	}
	
	public static void ejercicio19() {
		// Ejercicio 19
		// Ginecología(40%), Pediatría(%30) y Traumatología(30%)
		// Declaracion de variables
		final double porcentajeGineco = 0.4, porcentajePedia = 0.3, porcentajeTrauma = 0.3;
		double cantGineco, cantPedia, cantTrauma, presupuesto;
		
		// Solicitud de datos
		System.out.print("Ingrese el presupuesto: ");
		presupuesto = teclado.nextDouble();
		
		// Obtener el valor para cada area, en este caso como pediatria y traumatologia tienen el mismo porcentaje lo dejamos en una unica variable
		cantGineco = presupuesto * porcentajeGineco;
		cantPedia = presupuesto * porcentajePedia;
		cantTrauma = presupuesto * porcentajeTrauma;
		
		System.out.println("\nPresupuesto anual: " + presupuesto);
		System.out.println("Ginecología(" + (int)(porcentajeGineco*100) + "%): " + cantGineco);
		System.out.println("Pediatría(" + (int)(porcentajePedia*100) + "%): " + cantPedia);
		System.out.println("Traumatología(" + (int)(porcentajeTrauma*100) + "%): " + cantTrauma);
	}
	
	public static void ejercicio21() {
		// Ejercicio 21
		// Declaracion de variables
		double cantNaranjas, valorDocena, valorVenta, ganancia, valorCompra, precioUnitario, porcentajeGanancia;
		// Solicitud de datos
		System.out.println("Ingrese los siguientes datos");
		System.out.print("Cantidad de naranjas del lote: ");
		cantNaranjas = teclado.nextDouble();
		System.out.print("Precio por docena de naranjas: ");
		valorDocena = teclado.nextDouble();
		System.out.print("Precio total de venta de las naranjas: ");
		valorVenta = teclado.nextDouble();
		
		//Calculos
		// Calculamos el precio de cada naranja, para eso dividimos el valor de la 12 por 12
		precioUnitario = valorDocena / 12;
		// Ahora con el precio de cada naranja podemos calcular cuanto valio todo el lote, por lo tanto múltiplicamos el precio unitario por la cantidad de naranjas del lote
		valorCompra = precioUnitario * cantNaranjas;
		// Calculamos la ganancia para eso restamos el valor de venta del lote menos el valor de compra
		ganancia = valorVenta - valorCompra;
		// Calculamos el porcentaje de la ganancia, tomamos la ganancia y la dividimos sobre el valor de compra del lote, luego lo multiplicamos por 100 para optener el porcentaje
		porcentajeGanancia = (ganancia / valorCompra) * 100;
		
		System.out.println("\nValor de compra del lote: " + valorCompra);
		System.out.println("Valor de venta del lote: " + valorVenta);
		System.out.println("Ganancia: " + ganancia);
		System.out.println("% de ganancia: " + porcentajeGanancia + "%");
	}
	
	public static void ejercicio23() {
		// Ejercicio 23
		// Declaracion de variables
		int kgHarina, lAceite, kgSobrantes, lSobrantes, cantKgPorBultos, cantLPorCaja, cantBultos, cantCajas;
		double precioButoHarina, precioCajaAceite, ingresoTotal, precioHarinaRestante, precioAceiteRestante, totalHarina, totalAceite, totalHarinaRestante, totalAceiteRestante;
		
		//Solicitud de datos
		System.out.print("¿Cuántos Kg de harina obtuvo?: ");
		kgHarina = teclado.nextInt();

		System.out.print("¿Cuántos L de aceite obtuvo?: ");
		lAceite = teclado.nextInt();
		
		System.out.print("Precio del bulto de harina: ");
		precioButoHarina = teclado.nextDouble();
		
		System.out.print("Precio de la caja de aceites: ");
		precioCajaAceite = teclado.nextDouble();
		
		System.out.print("Precio de los Kg de hariana restantes: ");
		precioHarinaRestante = teclado.nextDouble();

		System.out.print("Precio de los L de aceite restantes: ");
		precioAceiteRestante = teclado.nextDouble();

		//OPERACIONES
		// HARINA
		// Calcular cuantos bultos salen de la cantidad de kg obtenidos, teniendo en cuenta que cada bulto es de 24kg
		cantBultos = kgHarina / 24;
		// Una vez tenemos cuantos bultos salieron debemos calcular cuantos kg corresponden a esos bultos, para ello tomamos la cantidad de bultos y lo multiplicamos por 24 que son los kg de cada bulto
		cantKgPorBultos = cantBultos * 24;
		// Calcular cuantos kg nos sobraron, para ello tomamos los kg obtenidos menos los kg de los bultos
		kgSobrantes = kgHarina - cantKgPorBultos;

		// ACEITE
		// Calcular cuantas cajas salen de la cantidad de L obtenidos, teniendo en cuenta que cada caja tiene 15 envases de 1L
		cantCajas = lAceite / 15;
		// Una vez tenemos cuantas cajas salieron debemos calcular cuantos L corresponden a esas cajas, para ello tomamos la cantidad de cajas y lo multiplicamos por 15 que son los L de cada caja
		cantLPorCaja = cantCajas * 15;
		// Calcular cuantos L nos sobraron, para ello tomamos los L obtenidos menos los L de las cajas
		lSobrantes = lAceite - cantLPorCaja;
		
		// Calcular la ganancia de los bultos para ello tomamos la cantidad de bultos por el precio de cada bulto
		totalHarina = cantBultos * precioButoHarina;
		// Calcular la ganancia de las cajas para ello tomamos la cantidad de cajas por el precio de cada caja
		totalAceite = cantCajas * precioCajaAceite;
		// Calcular la ganacia de la harina que sobro para ello tomamos la cantidad de kg sobrantes por el precio de cada kg restante
		totalHarinaRestante = kgSobrantes * precioHarinaRestante;
		// Calcular la ganacia del aceite que sobro para ello tomamos la cantidad de L sobrantes por el precio de cada L restante
		totalAceiteRestante = lSobrantes * precioAceiteRestante;
		// Por ultimo calculamos la ganancia total que es sumar todas las ganancias calculadas anteriormente (bultos,cajas,harinaSobrante,AceiteSobrante)
		ingresoTotal = totalHarina + totalAceite + totalHarinaRestante + totalAceiteRestante;
		
		// Mostrar datos
		System.out.println("\nCantidad bultos: " + cantBultos);
		System.out.println("Cantidad cajas: " + cantCajas);
		System.out.println("Cantidad kg sobrantes: " + kgSobrantes + "Kg");
		System.out.println("Cantidad L sobrantes: " + lSobrantes + "L");
		System.out.println("Ingreso total: $" + ingresoTotal);
	}
	
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
		double numero, raizCuadrada, x = 0.1, diferencia;
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
		double notaMenorProgra = 6,porcentajeNoIngles, almunosAprobaronTodo, promedioGeneralProgramacion, porcentajeAlumnosMatematicas;
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