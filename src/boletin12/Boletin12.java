/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12;

import javax.swing.JOptionPane;

/**
 *
 * @author bhernandezsouto
 */
public class Boletin12 {
    public static void main(String[] args) {
      Garaje obj = new Garaje();
      int opcion;
        do{
        opcion = JOptionPane.showOptionDialog(null, "Escoja una Opcion", "MENU", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Aparcar un coche", "Sacar un coche","Salir"}, "Entrar");
        if (opcion == 0){
            obj.plazaAparcamiento();
            if (obj.getSitio() ==1){
                obj.registroCoche();
            }
        }
        if (opcion == 1){
            
        }
        }while (opcion == 3);
    }
    
}
