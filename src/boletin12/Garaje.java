/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12;

import java.util.Date;
import javax.swing.JOptionPane;

public class Garaje {
    private int numeroCoches;
    private int sitio;
    private String matricula;
    private Date tiempo;

    public int getNumeroCoches() {
        return numeroCoches;
    }

    public void setNumeroCoches(int numeroCoches) {
        this.numeroCoches = numeroCoches;
    }

    public int getSitio() {
        return sitio;
    }

    public void setSitio(int sitio) {
        this.sitio = sitio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void plazaAparcamiento (){
        if ((5-numeroCoches)> 0){
            JOptionPane.showMessageDialog(null, "Plazas Disponibles");
            sitio=1;
        }
        else {
            JOptionPane.showMessageDialog(null, "Completo");
            sitio=0;
        }
    }
    
    public void registroCoche (){
        String respuesta = JOptionPane.showInputDialog("Introduzca la matricula del coche");
        matricula = respuesta;             
    }
    
    public void salidaCoche (){
        
    }
    
}
