/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gatoofmiaus;

import java.io.DataInputStream;
import java.io.IOException;
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
public class clienteMiau implements Runnable{
    
    //Declaramos las variables necesarias para la conexion y comunicacion
    private Socket client;
    private DataOutputStream out;
    private DataInputStream in;
    //El puerto debe ser el mismo en el que escucha el servidor
    private int puerto = 54543;
    //Si estamos en nuestra misma maquina usamos localhost si no la ip de la maquina servidor
    private String host = "localhost";
    
    public clienteMiau(){
        try{
            //Creamos el socket con el host y el puerto, declaramos los streams de comunicacion
            client = new Socket(host,puerto);
            in = new DataInputStream(client.getInputStream());
            out = new DataOutputStream(client.getOutputStream());
        }catch(Exception e){
            e.printStackTrace();
        }
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
    
    /*
    public static void main(String[] args) throws IOException{
        ventanaPadre vp = new ventanaPadre();
        vp.setVisible(true);
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */

    @Override
    public void run() {
        
    }
}
