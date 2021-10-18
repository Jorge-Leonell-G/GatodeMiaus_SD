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
    
    private static ServerSocket server;
    private static Socket jugador;
    public static int puerto;
            
    private static int connectMax = 2;
    
    //Creamos una lista de sockets para guardar el socket de cada jugador
    private LinkedList<Socket> jugadores = new LinkedList<Socket>();
    
    public ServidorGato(){
        
    }
    
     public ServidorGato(Socket player) {
        this.jugador = player;
    }
    
    public static void main(String[] args) throws IOException{
        
        server = new ServerSocket(puerto, connectMax);
        System.out.println("Conexión establecida con el servidor\n");
        System.out.println("Esperando jugadores\n");
        System.out.println("----- DATOS DEL SERVIDOR -----\n");
        System.out.println("Puerto: " + server.getLocalPort());
        System.out.println("Host: " + server.getInetAddress());
        System.out.println("No. máximo de conexiones: " + connectMax);
        
        //bucle infinito para la apertura del servidor
         while(true) {
            jugador = server.accept();
            ServidorGato partida = new ServidorGato(jugador);
            Thread hilo = new Thread(partida);
            hilo.start();
        }
        
    }
       
   //Funcion para que el servidor empieze a recibir conexiones de clientes
    /*
    public void recibir(){
        try {
            //Creamos el socket servidor
            ServerSocket servidor = new ServerSocket(puerto, connectMax);
            //Ciclo infinito para estar escuchando por nuevos jugadores
            System.out.println("Esperando jugadores....");
            while(true){
                    //Cuando un jugador se conecte guardamos el socket en nuestra lista
                    Socket cliente = servidor.accept();
                    //Se agrega el socket a la lista
                    jugadores.add(cliente);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    */
    
    @Override
    public void run() {
        System.out.println("Jugador conectado: " + jugador.getInetAddress());
        System.out.println("Movimiento realizado por el jugador: " + jugador.getInetAddress());
    }
}

