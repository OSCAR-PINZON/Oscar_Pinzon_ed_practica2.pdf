package acti4;

import java.util.Scanner;
import java.util.Stack;

public class CLASE1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> pila = new Stack<>();

        // Ingresar 10 números en la pila
        System.out.println("Ingresa 10 números (entre cero y diez):");
        for (int i = 0; i < 10; i++) {
            int numero = obtenerNumeroValido(scanner);
            pila.push(numero);
        }

        // Imprimir el número contenido en la pila en letras
        while (!pila.isEmpty()) {
            int numero = pila.pop();
            String numeroEnLetras = convertirNumeroALetras(numero);
            System.out.println("El número " + numero + " en letras es: " + numeroEnLetras);
        }
    }

    // Método para obtener un número válido (entre cero y diez)
    private static int obtenerNumeroValido(Scanner scanner) {
        while (true) {
            System.out.print("Ingrese un número (entre cero y diez): ");
            int numero = scanner.nextInt();
            if (numero >= 0 && numero <= 10) {
                return numero;
            } else {
                System.out.println("Número fuera del rango. Inténtelo nuevamente.");
            }
        }
    }

    // Método para convertir un número a su representación en letras
    private static String convertirNumeroALetras(int numero) {
        // Implementa la lógica para convertir el número a letras aquí
        switch (numero) {
            case 0:
                return "cero";
            case 1:
                return "uno";
            case 2:
                return "dos";
            case 3:
                return "tres";
            case 4:
                return "cuatro";
            case 5:
                return "cinco";
            case 6:
                return "seis";
            case 7:
                return "siete";
            case 8:
                return "ocho";
            case 9:
                return "nueve";
            case 10:
                return "diez";
            default:
                return "Número no reconocido";
        }
    }
}
