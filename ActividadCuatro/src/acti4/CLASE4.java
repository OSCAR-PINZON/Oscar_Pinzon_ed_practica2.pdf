
//1 Crear un programa en java que permita Invertir una cadena usando una Pila.
//- Este programa leerá una cadena de texto ingresada por el usuario, utilizará una pila para
//invertir la cadena y luego mostrará la cadena invertida. Ejemplo Ingresa “ESTUDIANTES”, mostrará “SETNAIDUTSE”

package acti4;

import java.util.Scanner;
import java.util.Stack;

public class CLASE4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();
        
        String cadenaInvertida = invertirCadena(cadena);
        
        System.out.println("Cadena invertida: " + cadenaInvertida);
    }
    
    public static String invertirCadena(String cadena) {
        Stack<Character> pila = new Stack<>();
        
        // Llenar la pila con los caracteres de la cadena original
        for (char c : cadena.toCharArray()) {
            pila.push(c);
        }
        
        // Construir la cadena invertida
        StringBuilder cadenaInvertida = new StringBuilder();
        while (!pila.isEmpty()) {
            cadenaInvertida.append(pila.pop());
        }
        
        return cadenaInvertida.toString();
    }
}
