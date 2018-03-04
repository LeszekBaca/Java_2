package model;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Temat: Serwer
 * @author Leszek Baca
 * @version 1.0
 * Klasa odpowiedzialna za uruchmienie serwera. Klasa ServerRunner dziedziczy 
 * po klasie Thread
 */
public class ServerRunner extends Thread {
    /**
     * Utworzenie zmiennej PORT typu calkowitego i przypisanie jej wartosci 1234
     */
    static final int PORT = 1234;
    /**
     * Inicjalizacja obiektu serwer typu ServerSocket
     */
    static ServerSocket serwer;
    /**
     * Konstruktor bezparametrowy klasy ServerRunner
     */
    public ServerRunner() {
    }

/**
 * Metoda odpowiedzialna za nawiązanie polaczenia
 */   
 public void run() {
        try {

            serwer = new ServerSocket(PORT);
            try {
                while (true) {
                    Socket socket = serwer.accept();

                    try {

                        new Connect(socket);
                    } catch (IOException e) {
                        socket.close();

                    }
                }
            } finally {

                serwer.close();

            }

        } catch (IOException ex) {
            Logger.getLogger(ServerRunner.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
