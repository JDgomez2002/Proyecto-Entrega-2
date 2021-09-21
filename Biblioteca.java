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

import java.util.*;
import java.io.File;

/**
 * Clase de Biblioteca.
 * Almacena las lecciones en un ArrayList.
 * 
 * @author Grupo 8
 * @version Class Biblioteca 1.1
 */
public class Biblioteca{
    private ArrayList<Leccion> Lecciones = new ArrayList<Leccion>();

    /**
     * Constructor de Biblioteca.
     * Lee todos los archivos de texto que contienen la informacion de las lecciones.
     * 
     * @author Grupo 8
     * @version Biblioteca 1.1
     */
    public Biblioteca(){
        try{
        for(int k = 0; k<3; k++){
            String numero_leccion = k+".txt";
            File myFile = new File(numero_leccion);
            Scanner scan = new Scanner(myFile);
            String info_archivo = scan.nextLine();
            String[] info_separada = info_archivo.split(";");
            Leccion leccion_n = new Leccion((k+1), info_separada[0], info_separada[1], info_separada[2]);
            Lecciones.add(leccion_n);
        }
        
        }
        catch(Exception e){
            String s = "Biblioteca: leer archivos: " + e.getMessage();
            throw new RuntimeException(s);
        }
    }

    public ArrayList<Leccion> get_lecciones(){
        return this.Lecciones;
    }

}
