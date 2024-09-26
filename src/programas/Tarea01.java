package programas;
import java.util.Scanner;
public class Tarea01 {
    public static void main(String[] args) {
        // Variables
        int edad;
        int sumaEdades = 0;
        int contador = 0;
        String respuesta;
        double promedio;
        Scanner scanner = new Scanner(System.in);
        // Entrada y Proceso
        do {
            System.out.print("Ingresa una edad: ");
            edad = scanner.nextInt();
            sumaEdades += edad;
            contador++;
            System.out.print("¿Deseas ingresar otra edad? (s/n): ");
            respuesta = scanner.next();
        } while (respuesta.equalsIgnoreCase("s"));
        // Proceso (Cálculo del promedio)
        promedio = (double) sumaEdades / contador;
        // Salida
        System.out.println("La edad promedio es: " + promedio);
    }
}

