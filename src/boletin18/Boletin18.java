/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author otorradomiguez
 */
public class Boletin18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion=10;
        Buzon miBuzon=new Buzon();
        
        do{
        opcion=Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a tu correo\nElige una opcion:\n1.Crear correo"
                + "\n2.Mostrar numero de correos\n3.Mostrar correos sin leer\n4.Mostrar primer correo sin leer"
                + "\n5.Muestra el correo guardado en la posicion indicada\n6.Eliminar el correo guardado en la posicion n\n0.Salir"));
                
        switch(opcion){
            case 1:
                miBuzon.engade(new Correo(JOptionPane.showInputDialog("Escribe tu correo")));
                break;
            case 2:
                System.out.println(miBuzon.numeroDeCorreos());
                break;
            case 3:
                System.out.println(miBuzon.porLer());
                break;
            case 5:
                System.out.println(miBuzon.amosa(Integer.parseInt(JOptionPane.showInputDialog("Indica el numero del correo a leer"))));
                break;
            case 4:
                System.out.println(miBuzon.amosaPrimerNoLeido());
                break;
            case 6:
                miBuzon.elimina(Integer.parseInt(JOptionPane.showInputDialog("Indica el numero del correo a eliminar")));
                break;
            case 0:
                System.out.println("Adiosito!");
                break;
            default:
                System.out.println("Nothing happends");
                break;
        }
        }while(opcion!=0);
        
    }
    
}
