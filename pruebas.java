//Este es un archivo de pruebas

import javax.swing.*;
import java.awt.*;

public class pruebas extends JFrame{

    public static void main(String[] args){
        pruebas miVentana = new pruebas();
        miVentana.biblioteca();
    }

    public void biblioteca(){
        setVisible(true);
        setSize(600,450);
        setLocation(400,200);
        setTitle("Tututor Biblioteca");
        Panel_texto milamina = new Panel_texto("Matemáticas!","","Daniel Gomez");
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
        g.drawString(this.titulo,100,100);
        g.drawString(this.texto_leccion,100,120);
        g.drawString(this.cita,100,140);
    }
}
