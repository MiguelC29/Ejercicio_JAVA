package main.ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ControlSecuencial {
	static Scanner teclado = new Scanner(System.in);
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
}