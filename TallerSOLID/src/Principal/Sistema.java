/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Adicionales.Aderezo;
import Adicionales.Crema;
import Adicionales.Frutilla;
import Postres.*;
import Procesos.*;
import Leche.*;
import java.util.ArrayList;
/**
 *
 * @author djurado
 */
public class Sistema {
    public static void main(String [ ] args){
        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        // y cambiar el tipo de leche por Leche Descremada
        // Finalmente mostrar el precio final de cada uno
        /*LecheEntera leche = new LecheDeslactosada();
        ManejadorDeLeche mnj_leche = new ManejadorDeLeche();
        
        // Producir Helado
        Helado helado_vainilla = new Helado("Vainilla");
        OperacionesAderezo.anadirAderezoHelado(helado_vainilla, Aderezo.CREMA);
        OperacionesAderezo.anadirAderezoHelado(helado_vainilla, Aderezo.FRUTILLA);
        System.out.println(helado_vainilla);
        mnj_leche.cambiarTipoLeche(leche, helado_vainilla);
        System.out.println(helado_vainilla.showPrecioFinal());
        
        // Producir Pastel
        Pastel pastel_chocolate = new Pastel("Chocolate");
        OperacionesAderezo.quitarAderezoPastel(pastel_chocolate, Aderezo.CREMA);
        OperacionesAderezo.anadirAderezoPastel(pastel_chocolate, Aderezo.FRUTILLA);
        System.out.println(pastel_chocolate);
        mnj_leche.cambiarTipoLeche(leche, pastel_chocolate);
        System.out.println(helado_vainilla.showPrecioFinal());*/
       
        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        // y cambiar el tipo de leche por Leche Deslactosada
        ArrayList<Postre> arrPostres = new ArrayList<>();
        //ManejadorDeLeche mnj_leche = new ManejadorDeLeche(new LecheDescremada());
        LecheEntera leche = new LecheDeslactosada();
        // Producir Helado
        ArrayList<Aderezo> arrAderezo = new ArrayList<>();
        Helado helado_vainilla = new Helado("Vainilla", arrAderezo);
        arrPostres.add(helado_vainilla);
        ManejadorDeLeche mnj_leche = new ManejadorDeLeche();
        
        mnj_leche.cambiarTipoLeche(leche, arrPostres);
        // Producir Pastel
        Pastel pastel_chocolate = new Pastel("Chocolate", arrAderezo);
        arrPostres.add(pastel_chocolate);
        ManejadorDeLeche mnj_leche_chocolate = new ManejadorDeLeche();
        mnj_leche_chocolate.cambiarTipoLeche(leche, arrPostres);
        
        Pastel.anadirAderezoPastel(pastel_chocolate,new Crema("Crema"));
        Pastel.anadirAderezoPastel(pastel_chocolate, new Frutilla("Frutilla"));
        Helado.anadirAderezoHelado(helado_vainilla, new Crema("Crema"));
        Helado.anadirAderezoHelado(helado_vainilla, new Frutilla("Frutilla"));
        System.out.println(helado_vainilla);
        System.out.println(helado_vainilla.showPrecioFinal());
        
        System.out.println(pastel_chocolate);
        System.out.println(pastel_chocolate.showPrecioFinal());
    }
}
