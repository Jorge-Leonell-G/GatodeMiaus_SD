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

public class ServidorGato {
    
    //Inicializamos el puerto
    private final int puerto = 54543;
    //Numero maximo de conexiones (el tictactoe es un juego para 2)
    private final int noConexiones = 2;
    //Creamos una lista de sockets para guardar el socket de cada jugador
    private LinkedList<Socket> jugadores = new LinkedList<Socket>();
    //Variable para controlar el turno de cada jugador
    private Boolean turno = true;
    //Matriz donde se guardan los movimientos 
    private int G[][] = new int[3][3];
    //Numero de veces que se juega...para controlar las X y O
    private int turnos = 1;
       
   //Funcion para que el servidor empieze a recibir conexiones de clientes
    public void recibir(){
        try {
            //Creamos el socket servidor
            ServerSocket servidor = new ServerSocket(puerto,noConexiones);
            //Ciclo infinito para estar escuchando por nuevos jugadores
            System.out.println("Esperando jugadores....");
            while(true){
                    //Cuando un jugador se conecte guardamos el socket en nuestra lista
                    Socket cliente = servidor.accept();
                    //Se agrega el socket a la lista
                    jugadores.add(cliente);
                    //Se le genera un turno X o O 
                    int xo = turnos % 2 == 0 ? 1 : 0;
                    turnos++;
                    //Instanciamos un hilo que estara atendiendo al cliente y lo ponemos a escuchar
                    Runnable  run = new ServidorHilo(cliente, jugadores);
                    Thread hilo = new Thread(run);
                    hilo.start();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //Funcion main para correr el servidor
    public static void main(String[] args) {
        ServidorGato servidor= new ServidorGato();
        servidor.recibir();
    }
}

