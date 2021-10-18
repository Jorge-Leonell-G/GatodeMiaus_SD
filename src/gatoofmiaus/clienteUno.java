/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gatoofmiaus;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author leone
 */
public class clienteUno {
    
    private int puerto = 56076;
    private String host= "localhost";
    private Socket client;
    private DataInputStream in;
    private DataOutputStream out;
    
    private ventanaPadre frame;
    private JLabel[] casillas;
    
    public clienteUno(){
        
    }
    
    public boolean ConectarAServidor(){
        try {
            client = new Socket(host, puerto);
            out = new DataOutputStream(client.getOutputStream());
            return true;
        } catch (IOException ex) {
            return false;
        }
    }
    
    public String IPConectado(){
        return client.getInetAddress().toString();
    }

    public String PuertoConectado(){
        return String.valueOf(client.getPort());
    }
    
    public void EnviarDato(String data){
        try {
            out.writeUTF(data);
        } catch (IOException ex) {
            Logger.getLogger(clienteMiau.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void CerrarConexion(){
        try {
            client.close();
        } catch (IOException ex) {
            Logger.getLogger(clienteMiau.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
