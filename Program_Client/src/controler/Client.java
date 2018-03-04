package controler;

/**
 *
 Temat: Klient
 * @author Leszek Baca
 * @version 1.0
 * Klasa Client jest klasą główną odpowiedzialna za uruchomienie aplikacji
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            /**
             * Metoda odpowiedzialna za wyświetlenie GUI
             */
            public void run() {
                view.Window.showGui();
            }
        });

    }
}
