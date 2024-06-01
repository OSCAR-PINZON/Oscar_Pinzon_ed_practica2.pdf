package acti4;

import java.util.PriorityQueue;
import java.util.Queue;

public class CLASE3 {
    public static void main(String[] args) {
        // Crear dos colas ordenadas
        Queue<Integer> cola1 = new PriorityQueue<>();
        cola1.add(1);
        cola1.add(3);
        cola1.add(5);

        Queue<Integer> cola2 = new PriorityQueue<>();
        cola2.add(2);
        cola2.add(4);
        cola2.add(6);

        // Unir las colas y obtener una nueva cola ordenada
        Queue<Integer> nuevaCola = unirColas(cola1, cola2);

        // Imprimir la nueva cola
        System.out.println("Nueva cola ordenada:");
        while (!nuevaCola.isEmpty()) {
            System.out.print(nuevaCola.poll() + " ");
        }
    }

    public static Queue<Integer> unirColas(Queue<Integer> cola1, Queue<Integer> cola2) {
        Queue<Integer> nuevaCola = new PriorityQueue<>();
        nuevaCola.addAll(cola1);
        nuevaCola.addAll(cola2);
        return nuevaCola;
    }
}
