package controler;

import java.net.ServerSocket;
import view.Window;

/**
 * Temat: Serwer
 * @author Leszek Baca
 * @version 1.0
 * Klasa Server jest klasą główną odpowiedzialna za uruchomienie aplikacji
 */
public class Server {
    /**
    * Inicjalizacja obiektu window typu Window
    */
    static Window window;
    /**
     * Utworzenie zmiennej PORT typu calkowitego i przypisanie jej wartosci 1234
     */
    static final int PORT = 1234;
    /**
     * Inicjliazacja obiektu serwer typu ServerSocket
     */
    static ServerSocket serwer;
    /**
     * Konstruktor bezparametrowy klasy Server
     */
    public Server(){}
/**
 * 
 * @param args the command line arguments
 * 
 */
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            
            /**
             * Metoda run odpowiedzialna za utworzenie obiektu window
             * typu Window i wyświetlenie okna
             */
            public void run() {
                window = new Window();
                window.pack();
                window.setVisible(true);
            }
        });
    }
/**
 * Metoda zwraca obiekt window
 * @return obiekt klasy Window
 */
    public static Window getWindow() {
        return window;
    }
}