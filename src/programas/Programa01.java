package programas;
/*
Crear un programa que permita ingresar la edad, sexo delas personas 
y preguntar al usaurio si desea continuar o finalizarcon el proceso 
de registro de datos. Visualizar la cantidad de personasy el promedio 
de edad, la cantidad de personas de sexo masculino y femenino.
EJEMPLO:
nrp edad sexo opcion
1   20   m    s
2   30   m    s
3   24   f    s
4   28   f    n
RESULTADOS:
nro personas=4
cpsm=2
cpsf=2
pe=25.5
*/
import java.util.Scanner;
public class Programa01 {
    public static void main(String[] args){
        //DECLARAR VARIABLES
        int edad, cpsm, cpsf, cp; 
        String opc="", sexo="";
        double pe, se;
        Scanner lectura = new Scanner(System.in);
        //PROCESO
        cpsm = 0;
        cpsf = 0;
        cp = 0;
        se = 0;
        do{
            System.out.println("Ingresa edad:");
            edad = lectura.nextInt();
            System.out.println("Ingresa Sexo:");
            sexo=lectura.next();
            cp++;//contador
            se+=edad;//acumulador
            if(sexo.equals("m")){
                cpsm++; //contador de masculino
            }else{
                cpsf++; //contador de femenino
            }
            System.out.println("DESEA CONTINUAR SI/NO?:");
            opc = lectura.next();
        }while(opc.equals("si"));
        pe = se / cp;
        //SALIDA DE DATOS
        System.out.println("Cantidad de personas:" + cp);
        System.out.println("Cantidad de personas de sexo M:" + cpsm);
        System.out.println("Cantidad de personas de sezo F:" + cpsf);
        System.out.println("Promedio de edad de las personas:" + pe);
    }
}
