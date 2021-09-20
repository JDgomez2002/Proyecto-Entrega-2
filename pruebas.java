//Este es un archivo de pruebas

import javax.swing.*;

public class pruebas extends JFrame{

    public static void main(String[] args){
        pruebas miVentana = new pruebas();
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public pruebas(){
        setVisible(true);
        setSize(600,450);
        setLocation(400,200);
        setTitle("Tututor");
        
    }
}
