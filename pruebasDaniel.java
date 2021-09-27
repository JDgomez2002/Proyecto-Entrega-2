//Este es un archivo de pruebas

import java.util.*;
import javax.swing.*;
import java.awt.*;

// public class pruebasDaniel extends JFrame{


//     public static void main(String[] args){
//         Scanner scan = new Scanner(System.in);
//     }

//     // public static void main(String[] args){
//     //     pruebasDaniel miVentana = new pruebasDaniel();
//     //     Biblioteca lecciones = new Biblioteca();
//     //     String[] info_programa = lecciones.get_lecciones().get(2).get_info_leccion();
//     //     miVentana.mostrar_leccion(info_programa[0],info_programa[1],info_programa[2]);
//     //     miVentana.mostrar_menu();
//     // }

//     public void mostrar_leccion(String titulo, String cita, String texto){
//         setVisible(true);
//         setSize(1500,800);
//         setLocation(100,100);
//         setTitle("Tututor APP");
//         Panel_leccion leccion = new Panel_leccion(titulo, cita, texto);
//         add(leccion);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }

//     public void mostrar_bienvenida(){
//         setVisible(true);
//         setSize(1500,800);
//         setLocation(100,100);
//         setTitle("Tututor APP");
//         Panel_Bienvenida bienvenida = new Panel_Bienvenida();
//         add(bienvenida);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }

//     public void mostrar_menu(){
//         setVisible(true);
//         setSize(1500,800);
//         setLocation(100,100);
//         setTitle("Tututor APP");
//         Panel_Menu menu = new Panel_Menu();
//         add(menu);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }
// }


// class Panel_leccion extends JPanel{
//     private String titulo;
//     private String texto_leccion;
//     private String cita;

//     public Panel_leccion(String titulo, String cita, String texto){
//         this.titulo = titulo;
//         this.texto_leccion = texto;
//         this.cita = cita;
//         setFont(new java.awt.Font("Arial",0,20));
//     }

//     public void paintComponent(Graphics g){
//         super.paintComponent(g);

//         g.setColor(Color.green);
//         g.drawRect(14, 34, 690, 825);
//         g.drawRect(15, 35, 690, 825);
//         g.drawRect(16, 36, 690, 825);

//         g.setColor(Color.blue);
//         g.drawRect(20, 40, 680, 47);
//         g.drawRect(22, 42, 676, 43);
//         g.drawRect(20, 135, 680, 720);
//         g.drawRect(22, 137, 676, 716);

//         g.setColor(Color.black);
//         g.drawString(this.titulo,30,75);
//         g.drawString("- Fuente: "+this.cita,45,120);
//         g.drawString(this.texto_leccion,55,170);
        
//     }
// }

// class Panel_Bienvenida extends JPanel{

//     public void paintComponent(Graphics g){
//         super.paintComponent(g);

//         setFont(new java.awt.Font("Arial",1,20));

//         g.setColor(Color.green);
//         g.drawRect(14, 34, 690, 825);
//         g.drawRect(15, 35, 690, 825);
//         g.drawRect(16, 36, 690, 825);

//         g.setColor(Color.blue);
//         g.drawRect(20, 40, 680, 47);
//         g.drawRect(22, 42, 676, 43);
//         g.drawRect(20, 135, 680, 720);
//         g.drawRect(22, 137, 676, 716);

//         g.setColor(Color.black);
//         g.drawString(" Tututor APP",30,75);
//         g.drawString("-   BIENVENIDO   -",45,120);
//         g.drawString("  Esta APP es Tututor, de estudiantes para estudiantes.",55,170);
//         g.drawString("- En esta aplicacion podras prepararte para tu examen de admision",55,210);
//         g.drawString(" de la universidad.",55,240);
//         g.drawString("- Podras encontrar distintos temas, como Matematica, Fisica,",55,270);
//         g.drawString(" Biologia, Computacion, Estadistica, y entre muchos mas!",55,300);
//         g.drawString("- Podras acceder a muchas lecciones, y poder crear tu cuenta.",55,330);
//         g.drawString("- Tu historial se mantendra para que puedas regresar a las",55,360); 
//         g.drawString(" lecciones que dejaste pendiente.",55,390);
//         g.drawString("- Recuerda que el mayor logro, se obtiene con el mayor esfuerzo!",55,420);
//         g.drawString(" Siempre sigue aprendiendo!!",55,480);
//         g.drawString("          -  Presiona ENTER para continuar...",55,550);
        
//     }
// }

// class Panel_Menu extends JPanel{

//     public void paintComponent(Graphics g){
//         super.paintComponent(g);

//         setFont(new java.awt.Font("Arial",1,20));

//         g.setColor(Color.green);
//         g.drawRect(14, 34, 690, 825);
//         g.drawRect(15, 35, 690, 825);
//         g.drawRect(16, 36, 690, 825);

//         g.setColor(Color.blue);
//         g.drawRect(20, 40, 680, 47);
//         g.drawRect(22, 42, 676, 43);
//         g.drawRect(20, 135, 680, 720);
//         g.drawRect(22, 137, 676, 716);

//         g.setColor(Color.black);
//         g.drawString(" Tututor APP",30,75);
//         g.drawString("-   MENU PRINCIPAL   -",45,120);
//         g.drawString("Elige entre las opciones del menu para poder avanzar.",55,170);
//         g.drawString("1. Biblioteca de Lecciones.",55,210);
//         g.drawString("2. Busqueda de Lecciones.",55,240);
//         g.drawString("3. Simulador de Examen de Admision.",55,270);
//         g.drawString("4. Historial de Lecciones.",55,300);
//         g.drawString("5. Mi Cuenta.",55,330);
//         g.drawString("6. Finalizar Programa.",55,360);
        
//     }
// }
