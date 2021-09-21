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
    private String autor;
    private String referencias;
    private String fichabibliografica;
    private int frecuencia_visita;

    public void Leccion(){
        
        ArrayList<String> numeros_c = new ArrayList<String>();
        numeros_c.add("Números Complejos;La noción de número complejo aparece ante la imposibilidad de los números reales de abarcar a las raíces de orden par del conjunto de los números negativos. Los números complejos pueden, por lo tanto, reflejar a todas las raíces de los polinomios, algo que los números reales no están en condiciones de hacer. Gracias a esta particularidad, los números complejos se emplean en diversos campos de las matemáticas, en la física y en la ingeniería. Por su capacidad para representar la corriente eléctrica y las ondas electromagnéticas, por citar un caso, son utilizados con frecuencia en la electrónica y las telecomunicaciones. Y es que el llamado análisis complejo, o sea la teoría de las funciones de este tipo, se considera una de las facetas más ricas de las matemáticas. Cabe resaltar que el cuerpo de cada número real está formado por pares ordenados (a, b). El primer componente (a) es la parte real, mientras que el segundo componente (b) es la parte imaginaria. Los números imaginarios puros son aquellos que sólo están formados por la parte imaginaria (por lo tanto, a=0). Los números complejos componen el denominado cuerpo complejo (C). Cuando el componente real a es identificado con el correspondiente complejo (a, 0), el cuerpo de estos números reales (R) se transforma en un subcuerpo de C. Por otra parte, C conforma un espacio vectorial de dos dimensiones sobre R. Esto demuestra que los números complejos no admiten la posibilidad de mantener un orden, a diferencia de los números reales.;Julián Pérez Porto");
        System.out.println(numeros_c);
        return;
    }

    public void setFrecuenciavisitas(){

    }

    public String getleccion(){
        return titulo;
    }

    public int getfrecuencia(){
        return 0;
    }
}
