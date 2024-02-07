package main;

public class EjemploManejoExcepciones {

    public static void main(String[] args) {
        try {
            // Bloque 1: Código propenso a excepciones
            int resultado = dividir(10, 0);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            // Bloque 2: Manejo de la excepción ArithmeticException
            System.err.println("Error: División por cero. Detalles: " + e.getMessage());
        } finally {
            // Bloque 3: Código que siempre se ejecuta
            System.out.println("Este bloque se ejecuta siempre, independientemente de las excepciones.");
        }
    }

    public static int dividir(int numerador, int denominador) {
        return numerador / denominador;
    }
}