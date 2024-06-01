package acti4;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class CLASE2 {
    public static void main(String[] args) {
        Queue<Integer> colaValores = ingresarValoresEnCola();
        mostrarColaOrdenada(colaValores);
    }
    
    public static Queue<Integer> ingresarValoresEnCola() {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> cola = new PriorityQueue<>();
        
        System.out.println("INGRESA 10 NUMERO EN COLA :");
        for (int i = 1; i <= 10; i++) {
            while (true) {
                try {
                    System.out.print("INGRESE VALOR " + i + ": ");
                    int valor = scanner.nextInt();
                    cola.add(valor);
                    break;
                } catch (Exception e) {
                    System.out.println("SOLO ENTERO .");
                    scanner.next(); // Limpiar el buffer de entrada
                }
            }
        }
        
        return cola;
    }
    
    public static void mostrarColaOrdenada(Queue<Integer> cola) {
        PriorityQueue<Integer> colaOrdenada = new PriorityQueue<>(cola);
        
        System.out.println("Cola ordenada en forma ascendente:");
        while (!colaOrdenada.isEmpty()) {
            System.out.println(colaOrdenada.poll());
        }
    }
}
