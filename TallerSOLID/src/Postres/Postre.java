/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Postres;

import Adicionales.Aderezo;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Postre {
    protected String sabor;
    protected ArrayList<Aderezo> aderezos;

    public Postre(String sabor, ArrayList<Aderezo> aderezos) {
        this.sabor = sabor;
        this.aderezos = aderezos;
    }
    
    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }
    public static void anadirAderezoPastel(Postre postre,Aderezo aderezo){
        postre.getAderezos().add(aderezo);
    }
}
