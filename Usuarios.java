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

    /**
     * Constructor Usuarios.
     * 
     * @author Grupo 8
     * @version Usuarios 1.1
     */
    public Usuarios(Usuario usuario){
        this.lista_usuarios.add(usuario);
    }
}
