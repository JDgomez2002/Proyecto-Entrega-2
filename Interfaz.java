//Universidad del Valle de Guatemala
//Programación Orientada a Objetos
//Catedrático Tomás Gálvez
//Segundo Semestre 2021
//Sección 11
//Actividad: Proyecto Entrega 2
//Grupo 8
//José Daniel Gómez Cabrera 21429
//Linda Inés Jiménez Vides 21169
//Mario Antonio Guerra Morales 21008
//Estuardo José Francisco Ayala Argueta 21315

import java.util.Scanner;

/**
 * Clase de Interfaz 
 * 
 * @author Grupo 8
 * @version Class Interfaz 0
 */
public class Interfaz{
    Scanner sn = new Scanner(System.in);

    public int menuOpciones(){
        boolean siguiente = true;
        int opcion = 0;
        while(siguiente){
            try {
                System.out.println();
                System.out.print("Digite su opcion aqui: ");
                opcion = sn.nextInt();
                if((opcion>0) && (opcion<7)){
                    System.out.println();
                    siguiente = false;
                } else{
                    System.out.println();
                    System.out.println("\t\tError: ingrese un número del 1 al 6");
                    System.out.println();
                    sn.next();
                }
            } catch (Exception e) {
                System.out.println();
                System.out.println("\t\tError: ingrese un número válido");
                System.out.println();
            }
        }
        return opcion;
    }

    public void bienvenida(){
        System.out.println();
        System.out.println();
        System.out.println("Tututor APP");
        System.out.println("- BIENVENIDO");
        //System.out.println("- Hora: "+LocalTime.now().getHour()+" horas con "+LocalTime.now().getMinute()+" minutos.");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("- Esta APP es Tututor, de estudiantes para estudiantes.");
        System.out.println("- En esta aplicacion podras prepararte para tu examen de admision de la universidad.");
        System.out.println("- Podras encontrar distintos temas, como Matematica, Fisica, Biologia, Computacion, Estadistica, y entre muchos mas!");
        System.out.println("- Podras acceder a muchas lecciones, y poder crear tu cuenta.");
        System.out.println("- Tu historial se mantendra para que puedas regresar a las lecciones que dejaste pendiente.");
        System.out.println("Recuerda que el mayor logro, se obtiene con el mayor esfuerzo!");
        System.out.println("- Siempre sigue aprendiendo!!");
    }

    public void presione_enter(){
        System.out.println();
        System.out.println("Presione ENTER para continuar...");
        sn.nextLine();
        System.out.println();
    }

}