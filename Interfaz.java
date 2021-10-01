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
import java.time.LocalTime;

/**
 * Clase de Interfaz 
 * 
 * @author Grupo 8
 * @version Class Interfaz 0
 */
public class Interfaz{
    private Scanner sn = new Scanner(System.in);
    private Biblioteca biblioteca = new Biblioteca();

    public void bienvenida(){
        System.out.println();
        System.out.println();
        System.out.println("------------ Tututor APP ------------");
        System.out.println();
        System.out.println("------------ BIENVENIDO ------------");
        System.out.println("- Hora de Entrada: "+LocalTime.now().getHour()+" horas con "+LocalTime.now().getMinute()+" minutos.");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("- Esta APP es Tututor, de estudiantes para estudiantes.");
        System.out.println("- En esta aplicacion podras prepararte para tu examen de admision de la universidad.");
        System.out.println("- Podras encontrar distintos temas, como Matematica, Fisica, Biologia, Computacion, Estadistica, y entre muchos mas!");
        System.out.println("- Podras acceder a muchas lecciones, y poder crear tu cuenta.");
        System.out.println("- Tu historial se mantendra para que puedas regresar a las lecciones que dejaste pendiente.");
        System.out.println("- Recuerda que el mayor logro, se obtiene con el mayor esfuerzo!");
        System.out.println("- Siempre sigue aprendiendo!!");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
    }

    public int menuOpciones(){
        boolean siguiente = true;
        int opcion = 0;
        while(siguiente){
            try {
                System.out.println();
                System.out.println("1. Mostras Biblioteca");
                System.out.println("2. Buscar Lección");
                System.out.println("3. Simulador de examen de admisión");
                System.out.println("4. Historial de Lecciones");
                System.out.println("5. Mi cuenta");
                System.out.println("6. Salir\n");
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

    public void recibir_indice_leccion(){

    }

    //LINDA
    public void mostrar_leccion(Leccion leccion_a_mostrar){
        String[] datos_leccion = leccion_a_mostrar.get_info_leccion();
        System.out.println();
        //titulo
        System.out.println();
        //cita
        System.out.println();
        //texto
        System.out.println();
    }



}