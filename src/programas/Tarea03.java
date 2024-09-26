package programas;
import java.util.Scanner;
public class Tarea03 {
    public static void main(String[] args) {
        // Variables
        double temperatura;
        double temperaturaMaxima = Double.MIN_VALUE;
        double temperaturaMinima = Double.MAX_VALUE;
        String continuar;
        Scanner scanner = new Scanner(System.in);
        // Entrada y Proceso
        do {
            System.out.print("Ingresa una temperatura: ");
            temperatura = scanner.nextDouble();
            if (temperatura > temperaturaMaxima) {
                temperaturaMaxima = temperatura;
            }
            if (temperatura < temperaturaMinima) {
                temperaturaMinima = temperatura;
            }
            System.out.print("¿Deseas ingresar otra temperatura? (s/n): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("s"));
        // Salida
        System.out.println("La temperatura más alta es: " + temperaturaMaxima);
        System.out.println("La temperatura más baja es: " + temperaturaMinima);
    }
}
