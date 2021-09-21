//Este es un archivo de pruebas

import javax.swing.*;
import java.awt.*;

public class pruebasDaniel extends JFrame{

    public static void main(String[] args){
        pruebasDaniel miVentana = new pruebasDaniel();
        Biblioteca lecciones = new Biblioteca();
        String[] info_programa = lecciones.get_lecciones().get(2).get_info_leccion();
        miVentana.biblioteca(info_programa[0],info_programa[1],info_programa[2]);
    }

    public void biblioteca(String titulo, String cita, String texto){
        setVisible(true);
        setSize(600,450);
        setLocation(400,200);
        setTitle("Tututor Biblioteca");

        Panel_texto milamina = new Panel_texto(titulo, cita, texto);
        add(milamina);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Panel_texto extends JPanel{
    private String titulo;
    private String texto_leccion;
    private String cita;

    public Panel_texto(String titulo, String texto, String cita){
        this.titulo = titulo;
        this.texto_leccion = texto;
        this.cita =cita;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString(this.titulo,25,75);
        g.drawString(this.texto_leccion,45,120);
        g.drawString(this.cita,45,200);
    }
}
