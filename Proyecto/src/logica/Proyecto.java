/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logica;


import igu.Administrador;
import igu.Curso;
import igu.Ingreso;
import igu.Pantalla;
import igu.Profesores;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Proyecto {
 
    public static ArrayList<Curso> cursos;
    public static ArrayList<Profesores> profesor;
    
    
    
   
    
    public static void main(String[] args) {
              
        Pantalla panta = new Pantalla ();
        panta.setVisible(true);
        panta.setLocationRelativeTo(null);
        
       Ingreso in = new Ingreso ();
       in.setLocationRelativeTo(null);
       
       Administrador adm = new Administrador ();
       adm.setLocationRelativeTo(null);
       
       cursos = new ArrayList<>();
       
       profesor = new ArrayList<>();
    
        
    }
     
    
}
