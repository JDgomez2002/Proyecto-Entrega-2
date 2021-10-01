//Este es un archivo de pruebas

import java.util.*;

public class pruebasDaniel{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String titulo = "Numeros Enteros";

        System.out.print("Escriba: ");
        scan = new Scanner(System.in);
        String comparacion = scan.nextLine();

        comparacion = comparacion.toLowerCase();
        titulo = titulo.toLowerCase();
        if(titulo.contains(comparacion)){
            System.out.println("EXITO!");
        }
        else{
            System.out.println("NO SIRVE");
        }
    }
}
