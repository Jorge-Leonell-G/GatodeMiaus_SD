/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gatoofmiaus;

import java.io.IOException;
import servidor.ServidorGato;

/**
 *
 * @author Valery
 */
public class GatoOfMiaus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ServidorGato sg = new ServidorGato();
        clienteMiau cm = new clienteMiau();
        sg.recibir();
        cm.ConectarAServidor();
        ventanaPadre ventPadre = new ventanaPadre();
        //abrimos primero el servidor
        ventPadre.setVisible(true);
        ventPadre.setLocationRelativeTo(null);
    }
    
}
