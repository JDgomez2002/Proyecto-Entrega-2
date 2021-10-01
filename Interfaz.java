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

    /**
     * Bienvenida al usuario.
     * 
     * @author Grupo 8
     * @version bienvenida 1.1
     */
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

    /**
     * Muestra el menu principal y devuelve la opcion que desee elegir del menu.
     * 
     * @author Grupo 8
     * @version menuOpciones 1.1
     * @return int
     */
    public int menuOpciones(){
        boolean siguiente = true;
        int opcion = 0;
        while(siguiente){
            try {
                System.out.println();
                System.out.println("------------ MENU PRINCIPAL ------------");
                System.out.println("1. Mostras Biblioteca");
                System.out.println("2. Buscar Lección");
                System.out.println("3. Simulador de examen de admisión");
                System.out.println("4. Historial de Lecciones");
                System.out.println("5. Mi cuenta");
                System.out.println("6. Salir\n");
                System.out.print("Digite su opcion aqui: ");
                opcion = sn.nextInt();
                if((opcion>0) && (opcion<7)){
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
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

    /**
     * Metodo encargado de administrar la biblioteca.
     * Utiliza el metodo indice_leccion_biblioteca y mostrar_leccion.
     * 
     * @author Grupo 8
     * @version biblioteca 1.1
     */
    public void biblioteca(){
        boolean continuar = true;
        String volver_al_menu = "";

        while(continuar){
            int leccion = 0;
            leccion = indice_leccion_biblioteca();
            Leccion leccion_a_mostrar = null;
            leccion_a_mostrar = this.biblioteca.obtener_leccion(leccion);
            mostrar_leccion(leccion_a_mostrar);
            try{
                System.out.print("Desea seguir en la biblioteca? (Si/No): ");
                sn = new Scanner(System.in);
                volver_al_menu = sn.nextLine();
                System.out.println();
                if((volver_al_menu.equals("No"))||(volver_al_menu.equals("NO"))||(volver_al_menu.equals("no"))){
                    continuar = false;
                }
            }
            catch(Exception e){
                continuar = true;
            }
        }
        System.out.println();
        System.out.println("- Regresando al menu...");
        System.out.println();
    }

    /**
     * Metodo encargado de mostrar la biblioteca y de retornar el indice de leccion que se desea acceder.
     * 
     * @author Grupo 8
     * @version indice_leccion_biblioteca 1.1
     * @return int
     */
    public int indice_leccion_biblioteca(){
        boolean siguiente = true;
        int opcion = 0;
        while(siguiente){
            try {
                System.out.println();
                System.out.println("------------ BIBLIOTECA ------------");
                System.out.println("--- MATEMATICA ---");
                for(int k = 0; k<4; k++){
                    System.out.println((k+1)+" "+this.biblioteca.get_lecciones().get(k).get_titulo());
                }
                System.out.println();
                System.out.println("--- FISICA ---");
                for(int i = 4; i<8; i++){
                    System.out.println((i+1)+" "+this.biblioteca.get_lecciones().get(i).get_titulo());
                }
                System.out.println();
                System.out.print("Digite su opcion aqui: ");
                opcion = sn.nextInt();
                if((opcion>0) && (opcion<9)){
                    opcion -= 1;
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    System.out.println();
                    siguiente = false;
                } else{
                    System.out.println();
                    System.out.println("\t\tError: Su opcion debe de ser un indice de las lecciones de la biblioteca...");
                    System.out.println();
                    sn.next();
                }
            } catch (Exception e) {
                System.out.println();
                System.out.println("\t\tError: Su opcion debe de ser un indice de las lecciones de la biblioteca...");
                System.out.println();
            }
        }
        return opcion;
    }

    /**
     * Metodo encargado de administrar la pestana busqueda.
     * Utiliza los metodos mostrar_pestana_buscar, solicitar_leccion_buscar y obtener_leccion_2.
     * 
     * @author Grupo 8
     * @version buscar_leccion 1.1
     */
    public void buscar_leccion(){
        boolean continuar = true;
        String volver_al_menu = "";

        while(continuar){
            mostrar_pestana_buscar();
            String leccion_a_buscar = solicitar_leccion_a_buscar();
            Leccion leccion_a_mostrar = null;
            leccion_a_mostrar = this.biblioteca.obtener_leccion_2(leccion_a_buscar);
            if(!(leccion_a_mostrar == null)){
                mostrar_leccion(leccion_a_mostrar);
            }
            else{
                System.out.println();
                System.out.println("\t Lo sentimos...");
                System.out.println("\t Leccion no encontrada en la base de datos...");
                System.out.println();
            }
            try{
                System.out.print("Desea seguir buscando? (Si/No): ");
                sn = new Scanner(System.in);
                volver_al_menu = sn.nextLine();
                System.out.println();
                if((volver_al_menu.equals("No"))||(volver_al_menu.equals("NO"))||(volver_al_menu.equals("no"))){
                    continuar = false;
                }
            }
            catch(Exception e){
                continuar = true;
            }
        }
        System.out.println();
        System.out.println("- Regresando al menu...");
        System.out.println();
    }

    /**
     * Muestra el encabezado de la pestana buscar.
     * 
     * @author Grupo 8
     * @version mostrar_pestana_buscar 1.1
     */
    public void mostrar_pestana_buscar(){
        System.out.println();
        System.out.println("------------ BUSCAR LECCION ------------");
        System.out.println("- En esta pestana podras buscar lecciones por medio de su titulo.");
        System.out.println("- Solo basta escribir el nombre de la leccion.");
        System.out.println("- Sin embargo, tambien puedes buscarlas por palabras claves!");
        System.out.println("- Que el aprendizaje nunca termine!!!");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
    }

    /**
     * Solicita un String de la leccion que desea buscar al usuario.
     * Si el texto es vacio o hay una excepcion, el metodo se mantiene solicitando el String al usuario.
     * 
     * @author Grupo 8
     * @version solicitar_leccion_a_buscar 1.1
     * @return String
     */
    public String solicitar_leccion_a_buscar(){
        boolean continuar = true;
        String leccion_buscada = "";
        while(continuar){
            try{
                System.out.println();
                System.out.print("\t- Digite el nombre o palabra clave de la leccion que desea buscar: ");
                sn = new Scanner(System.in);
                leccion_buscada = sn.nextLine();
                if(leccion_buscada.equals("")){
                    System.out.println("\t\t- ERROR: digite un titulo de leccion valido.");
                }
                else{
                    leccion_buscada = leccion_buscada.toLowerCase();
                    continuar = false;
                }
            }
            catch(Exception e){
                System.out.println("\t\t- ERROR: digite un titulo de leccion valido.");
            }
        }
        return leccion_buscada;   
    }

    /**
     * Metodo encargado de mostrar una leccion.
     * Se utiliza en la biblioteca y busqueda.
     * 
     * @author Grupo 8
     * @version mostrar_leccion 1.1
     * @param Leccion
     */
    public void mostrar_leccion(Leccion leccion_a_mostrar){
        String[] datos_leccion = leccion_a_mostrar.get_info_leccion();
        String[] texto_leccion = datos_leccion[2].split(":");
        System.out.println();
        System.out.println("-- LECCION --");
        System.out.println();
        System.out.print("Titulo: ");
        System.out.println(datos_leccion[0]);
        System.out.println();
        System.out.print("Referencia: ");
        System.out.println(datos_leccion[1]);
        System.out.println();
        for(int k = 0; k<texto_leccion.length; k++){
            System.out.println(texto_leccion[k]);
        }
        System.out.println();
    }

    /**
     * Despedida para el usuario.
     * 
     * @author Grupo 8
     * @version despedida 1.1
     */
    public void despedida(){
        System.out.println();
        System.out.println("- Gracias por utilizar Tututor!!!");
        System.out.println("- Vuelve pronto!");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println();
    }

    /**
     * Mensaje informativo para el usuario.
     * 
     * @author Grupo 8
     * @version simulador_no_disponible 1.1
     */
    public void simulador_no_disponible(){
        System.out.println();
        System.out.println("\t\t- Lo sentimos, el simulador de examen aun no esta disponible...");
        System.out.println("\t\t- Estara disponible en la FASE 03 del Proyecto POO 2021.");
        System.out.println("\t- Regresando al Menu...");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
    }

    /**
     * Mensaje informativo para el usuario.
     * 
     * @author Grupo 8
     * @version historial_no_disponible 1.1
     */
    public void historial_no_disponible(){
        System.out.println();
        System.out.println("\t\t- Lo sentimos, el historial de sus lecciones aun no esta disponible...");
        System.out.println("\t\t- Estara disponible en la FASE 03 del Proyecto POO 2021.");
        System.out.println("\t- Regresando al Menu...");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
    }

    /**
     * Mensaje informativo para el usuario.
     * 
     * @author Grupo 8
     * @version mi_cuenta_no_disponible 1.1
     */
    public void mi_cuenta_no_disponible(){
        System.out.println();
        System.out.println("\t\t- Lo sentimos, su cuenta aun no esta disponible...");
        System.out.println("\t\t- Estara disponible en la FASE 03 del Proyecto POO 2021.");
        System.out.println("\t- Regresando al Menu...");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
    }
}