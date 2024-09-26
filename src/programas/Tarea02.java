package programas;
import java.util.Scanner;
public class Tarea02 {
    public static void main(String[] args) {
        // Variables
        double nota;
        double sumaNotas = 0;
        int cantidadNotas = 0;
        String continuar;
        double promedio;
        Scanner scanner = new Scanner(System.in);
        // Entrada y Proceso
        do {
            System.out.print("Ingresa una nota: ");
            nota = scanner.nextDouble();
            sumaNotas += nota;
            cantidadNotas++;
            System.out.print("¿Deseas ingresar otra nota? (s/n): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("s"));
        // Proceso (Cálculo del promedio)
        promedio = sumaNotas / cantidadNotas;
        // Salida
        System.out.println("El promedio de las notas es: " + promedio);
    }
}