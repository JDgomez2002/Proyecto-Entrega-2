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
        Usuarios data = new Usuarios();

        boolean continuar = true;
        int opcion_usuario = 0;
        int opcion = 0;
        int opcion2 = 0;

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
                    vista.simuladores();
                    opcion2 = vista.Biologia();
                    break;

                //Historial de lecciones
                case 4:
                    vista.historial_no_disponible();
                    break;

                //Mi cuenta
                case 5:
                    //Crear usuario o iniciar sesion
                    vista.cuenta();
                    if(data.get_usuario_actual()==null){
                        boolean continuar_sesion_cerrada = true;
                        while(continuar_sesion_cerrada){
                            int crear_usuario_o_iniciar_sesion = vista.acceder_o_crear_usuario();
                            if(crear_usuario_o_iniciar_sesion==1){
                                //crear usuario
                                int estudiante_o_profesor = vista.estudiante_o_profesor();
                                String[] datos_crear_usuario = vista.get_info_usuario();
                                data.crear_usuario(estudiante_o_profesor, datos_crear_usuario);
                                vista.usuario_creado_exito();
                                continuar_sesion_cerrada = !(vista.volver_al_menu());
                            }
                            else{
                                String[] datos_inicio_sesion = vista.solicitar_datos_acceder_cuenta();
                                String nombre_sesion = datos_inicio_sesion[0];
                                String contra_sesion = datos_inicio_sesion[1];
                                boolean accedio = data.acceder_cuenta(nombre_sesion, contra_sesion);
                                vista.inicio_sesion(accedio);
                                continuar_sesion_cerrada = !(vista.volver_al_menu());
                            }
                        }
                        vista.volvinedo_al_menu();
                    }
                    //menu usuario
                    else{
                        
                    }
                    // vista.mi_cuenta_no_disponible();
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
