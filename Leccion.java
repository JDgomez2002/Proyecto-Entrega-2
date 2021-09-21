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
    private String titulo;
    private String texto;
    private String cita;
    private int frecuencia_visita;

    public void Leccion(String titulo, String texto, String cita){
        this.titulo = titulo;
        this.texto = texto;
        this.cita = cita;
    }

    public void setFrecuenciavisitas(){
        this.frecuencia_visita += 1;
    }

    // public String getleccion(){
    //     return titulo;
    // }

    public int getfrecuencia(){
        return this.frecuencia_visita;
    }
}
