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

import java.util.ArrayList;

/**
 * Clase Usuarios.
 * 
 * @author Grupo 8
 * @version Usuarios Class 1.1
 */
public class Usuarios {
    private ArrayList<Usuario> lista_usuarios = new ArrayList<Usuario>();
    private Usuario usuario_actual;

    public void acceder_cuenta(String nombre, String contra){
        if(!(this.lista_usuarios.isEmpty())){
            for(int k = 0; k<this.lista_usuarios.size() ;k++){
                if((nombre.equals(this.lista_usuarios.get(k).get_nombre()))&&(contra.equals(this.lista_usuarios.get(k).get_contra()))){
                    this.usuario_actual = lista_usuarios.get(k);
                }
            }
        }
    }

    public void crear_usuario(int tipo_usuario, String[] info_usuario){
        switch (tipo_usuario){
            case 1: //estudiante
                Estudiante estudiante = new Estudiante(info_usuario[0], info_usuario[1], info_usuario[2], info_usuario[3], info_usuario[4], info_usuario[5], info_usuario[6]);
                agregar_usuarios(estudiante);
                break;

            case 2://profesor
                Profesor profe = new Profesor(info_usuario[0], info_usuario[1], info_usuario[2], info_usuario[3], info_usuario[4], info_usuario[5], info_usuario[6]);
                agregar_usuarios(profe);
                break;
        
            default:
                break;
        }
    }

    /**
     * Constructor Usuarios.
     * 
     * @author Grupo 8
     * @version Usuarios 1.1
     */
    public void agregar_usuarios(Usuario usuario){
        this.lista_usuarios.add(usuario);
    }

    public ArrayList<String> get_historial_usuario_actual(){
        return this.usuario_actual.get_historial();
    }
}
