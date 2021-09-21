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

public class Leccion {
    private int indice;
    private String titulo;
    private String texto;
    private String cita;
    private int frecuencia_visita;

    public Leccion(int indice, String titulo, String cita, String texto){
        this.indice = indice;
        this.titulo = titulo;
        this.texto = texto;
        this.cita = cita;
    }

    public void set_Frecuenciavisitas(){
        this.frecuencia_visita += 1;
    }

    public String[] get_info_leccion(){
        String[] info_leccion = new String[3];
        info_leccion[0] = this.titulo;
        info_leccion[1] = this.cita;
        info_leccion[2] = this.texto;
        return info_leccion;
    }

    public int get_frecuencia(){
        return this.frecuencia_visita;
    }
}
