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

public class MAIN {
    
    public static void main(String[] args){
        Interfaz vista = new Interfaz();
        boolean continuar = true;
        int opcion_usuario = 0;

        while(continuar){
            // vista.mostrar_bienvenida();
            // opcion_usuario = vista.mostrar_menu();
            switch (opcion_usuario){
                //Biblioteca
                case 1:
                    // vista.mostrar_leccion(opcion_usuario);
                    vista.presione_enter();
                    break;

                //Buscar_leccion
                case 2:

                    break;

                //Simluador de examen de admision
                case 3:
                    
                    break;

                //Historial de lecciones
                case 4:

                    break;

                //Mi cuenta
                case 5:
                    
                    break;

                //finalizar programa
                case 6:
                    continuar = false;
                    break;
            
                default:
                    // vista.mostrar_mensaje_error_consola();
                    break;
            }
        }
    }
}
