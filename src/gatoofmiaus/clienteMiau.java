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
    private int puerto = 53639;
    //Si estamos en nuestra misma maquina usamos localhost si no la ip de la maquina servidor
    private String host = "localhost";
    //acceso a los labels del tablero
    private JLabel[] casillas;
    //variable de movimiento (cadena debido a que se puede escribir 'x' o 'o')
    private String move;
    private boolean turno;
    
    private ventanaPadre frameP;
    private ventanaUno frameU;
    
    private int casilla;
    
    public clienteMiau(){
        
    }
    
    
    public clienteMiau(ventanaPadre frameP){
        try{
            this.frameP = frameP;
            //Creamos el socket con el host y el puerto, declaramos los streams de comunicacion
            client = new Socket(host, puerto);
            in = new DataInputStream(client.getInputStream());
            out = new DataOutputStream(client.getOutputStream());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public clienteMiau(ventanaUno frameU) throws IOException{
            this.frameU = frameU;
            //Creamos el socket con el host y el puerto, declaramos los streams de comunicacion
            client = new Socket(host, puerto);
            in = new DataInputStream(client.getInputStream());
            out = new DataOutputStream(client.getOutputStream());
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
        try{
            move = in.readUTF();
            String split[] = move.split(";");
            //frame.cambioTexto(split[0]);
            String XO = split[0].split(" ")[1];
            turno = Boolean.valueOf(split[1]);
            
            while(true){
                move = in.readUTF();
                ventanaPadre vp = new ventanaPadre();
                ventanaUno vu = new ventanaUno();
                //EnviarDato();
                //vu.presionar(casilla);
                vu.mostrarAnteriores();
                vu.changeTurno();
                vu.ganador();
                vu.reiniciarJuego();
            }
        }catch(Exception e){
            
        }
           
    }
}
