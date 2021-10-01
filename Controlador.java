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

/**
 * Clase Controlador.
 * 
 * @author Grupo 8
 * @version Controlador 1.1
 */
public class Controlador {
    
    /**
     * Metodo del programa Tututor.
     * 
     * @author Grupo 8
     * @version Tututor 1.1
     */
    public void Tututor(){
        Interfaz vista = new Interfaz();

        boolean continuar = true;
        int opcion_usuario = 0;

        vista.bienvenida();

        while(continuar){
            opcion_usuario = vista.menuOpciones();
            switch (opcion_usuario){
                //Biblioteca
                case 1:
                    vista.biblioteca();
                    break;

                //Buscar_leccion
                case 2:
                    vista.buscar_leccion();
                    break;

                //Simluador de examen de admision
                case 3:
                    vista.simulador_no_disponible();
                    break;

                //Historial de lecciones
                case 4:
                    vista.historial_no_disponible();
                    break;

                //Mi cuenta
                case 5:
                    vista.mi_cuenta_no_disponible();
                    break;

                //finalizar programa
                case 6:
                    vista.despedida();
                    continuar = false;
                    break;
            
                default:
                    break;
            }
        }
    }
}
