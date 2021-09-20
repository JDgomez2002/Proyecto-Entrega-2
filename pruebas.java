//Este es un archivo de pruebas

import javax.swing.*;
import java.awt.*;

public class pruebas extends JFrame{

    public static void main(String[] args){
        pruebas miVentana = new pruebas();
        miVentana.menu_principal();
        miVentana.biblioteca();
        // miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // public pruebas(){
    //     setVisible(true);
    //     setSize(600,450);
    //     setLocation(400,200);
    //     setTitle("Tututor");
    //     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    // }

    public void crear_ventana(String titulo){
        setVisible(true);
        
        setSize(600,450);
        setLocation(400,200);
        setTitle(titulo);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void menu_principal(){
        setVisible(true);
        setSize(600,450);
        setLocation(400,200);
        setTitle("Tututor APP");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    public void biblioteca(){
        setVisible(true);
        setSize(600,450);
        setLocation(400,200);
        setTitle("Tututor Biblioteca");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel1 milamina = new panel1();
        add(milamina);
        
    }
}

class panel1 extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("Matemáticas!",100,100);
        g.drawString("Sigue aprendiendo con nosotros!",100,120);
        g.drawString("",100,140);
    }
}
