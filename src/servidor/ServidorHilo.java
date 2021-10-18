/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import gatoofmiaus.ventanaUno;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.LinkedList;

/**
 *
 * @author leone
 */

//implementamos la clase Runnable para el uso de hilos mediante interfaz
public class ServidorHilo implements Runnable{
    
    //Declaramos las variables que utiliza el hilo para estar recibiendo y mandando mensajes
    private Socket socket;
    private DataOutputStream out;
    private DataInputStream in;
    //Lista de los usuarios conectados al servidor
    private LinkedList<Socket> jugadores = new LinkedList<Socket>();
    
    //Constructor que recibe el socket que atendera el hilo y la lista de los jugadores el turno y la matriz del juego
    public ServidorHilo(Socket soc, LinkedList players){
        socket = soc;
        jugadores = players;
    }
    

    @Override
    public void run() {
        try{
            //Inicializamos los canales de comunicacion y mandamos el turno a cada jugador
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            //Ciclo infinito que estara escuchando por los movimientos de cada jugador
            while(true){
                String recibidos = in.readUTF();
            }
        }catch(Exception e){
            //Si ocurre un excepcion lo mas seguro es que sea por que algun jugador se desconecto asi que lo quitamos de la lista de conectados
            for (int i = 0; i < jugadores.size(); i++) {
                if(jugadores.get(i) == socket){
                    jugadores.remove(i);
                    break;
        }
    }
    //vaciarMatriz() 
   }
  }
}    

