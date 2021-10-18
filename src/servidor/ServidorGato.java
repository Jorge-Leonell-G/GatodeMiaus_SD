/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author leone
 */

public class ServidorGato implements Runnable{
    
    private LinkedList<Socket> jugadores = new LinkedList<Socket>();
    private Socket sc;
    private ServerSocket server;
    //inicializacion del puerto a manera de una constante
    private final int puerto = 54543;
    //conexiones maximas en el server
    private int connectMax = 2;
    private DataInputStream in;
    private DataOutputStream out;
    //turnos
    private boolean turno = true;
    
    //metodo constructor
    public ServidorGato(){
        try{
            server = new ServerSocket(puerto, connectMax);
        }catch(IOException ex){
            Logger.getLogger(ServidorGato.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    
    public void recibir(){
        try{
            server = new ServerSocket(puerto, connectMax);
            System.out.println("Esperando jugadores...");
            //bucle infinito
            while(true){
                sc = server.accept();
                //agregamos al objeto del socket cliente
                jugadores.add(sc);
                //canales de comunicacion
                in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    public void EsperarConexion(){
        try {
            sc = server.accept();
            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());
        } catch (IOException ex) {
            Logger.getLogger(ServidorGato.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public String IPConectado(){
        return sc.getInetAddress().toString();
    }

    public String PuertoConectado(){
        return String.valueOf(sc.getPort());
    }

    public String EsperarDato(){
        try {
            return in.readUTF();
        } catch (IOException ex) {
            return "@CerrarConexion@";
        }
    }

    public void EnviarDato(String data){
        try{
            out.writeUTF(data);
        }catch(IOException ex) {
            Logger.getLogger(ServidorGato.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void CerrarConexion(){
        try {
            sc.close();
        } catch (IOException ex) {
            Logger.getLogger(ServidorGato.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*
    creacion de hilo 
    private Thread conClient = new Thread(){
        
    @Override
    public void run(){
        while(true){
            EsperarConexion();
            while(true){
                //recibir datos
            }
        }
     }
  };
    */
    
    @Override
    public void run() {
        //bucle infinito para la apertura del hilo del server
        while(true){
            recibir();
            while(true){
                //recibimos los datos de los jugadores
                IPConectado();
                PuertoConectado();
                EsperarDato();
                //EnviarDato(data);
            }
        }
    }
    
    public static void main(String[] args){
        System.out.println("Conexión establecida con el servidor");
        //sg.run();
        
               
    }
}

