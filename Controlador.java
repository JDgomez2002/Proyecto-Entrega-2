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

public class Controlador {
    
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
                    vista.despedida();
                    continuar = false;
                    break;
            
                default:
                    // vista.mostrar_mensaje_error_consola();
                    break;
            }
        }
    }
}
