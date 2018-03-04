package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Temat: Klient
 * @author Leszek Baca
 * @version 1.0
 * Klasa Connect odpowiedzialna jest za dokonanie polaczenia klient - serwer
 * Klasa Connect dziedziczy po Thread
 */
public class Connect extends Thread {
    /**
     * Inicjalizacja obiektu in typu BufferedReader 
     */
    public BufferedReader in;
    /**
     * Inicjalizacja obiektu out typu PrintWriter
     */
    public PrintWriter out;
    /**
     * Inicjalizacja obiektu socket typu Socket
     */
    private Socket socket;
    /**
     * Zmienna text typu String
     */
    String text;
    /**
     * Klasa Connect odpowiada za nawiazanie polaczenia
     * @throws IOException przy braku polaczenia
     */
    public Connect() throws IOException {
        socket = new Socket(InetAddress.getByName("localhost"), 1234);
        out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }
    /**
     * Metoda answer odpowiedzialna jest za odbieranie wiadomosci z serwera
     * @return zmienna text typu String
     * @throws IOException przy braku mozliwosci odebrania danych
     */
    public String answer() throws IOException {

        return text = (String) in.readLine();

    }
    /**
     * Metoda odpowiedzialna za wyslanie tekstu do serwera
     * @param text typu String
     */
    public void send(String text) {

        this.text = text;

        out.println(text);

    }
    /**
     * Metoda odpowiedzialna za zamkniecie polaczenia klient - serwer
     */
    public void close() {
        try {
            in.close();
            out.close();
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
