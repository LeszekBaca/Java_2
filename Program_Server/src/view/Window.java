package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import model.ServerRunner;

/**
 * Temat: Serwer
 * @author Leszek Baca
 * @version 1.0
 * Klasa Window odpowiedzialna za GUI.
 * Klasa dziedziczy po JFrame. Interfejs po: ActionListener, ChangeListener
 */
public class Window extends JFrame implements ActionListener, ChangeListener {

        /**
         * Inicjalizacja obiektu button typu Button
         */
        Button button;
        /**
         * Inicjalizacja obiektu statement typu JTextArea
         */
        public JTextArea statement;
        /**
         * Konstruktor bezparametrowy klasy Window
         */
    public Window() {

        //okno glowne
        setTitle("Serwer");
        this.setMinimumSize(new Dimension(600, 400));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //obiekt Menu
        Menu mainMenu = new Menu(this);
        this.setJMenuBar(mainMenu);

        //obiekt Button
        button = new Button(this);
        add(button, BorderLayout.PAGE_END);
        statement = new JTextArea();

        //lista - obiekt klasy JScrollPane
        JScrollPane panel = new JScrollPane(statement);
        this.add(panel, BorderLayout.CENTER);
    }
    /**
     * Metoda odpowiedzialna za dodanie wpisu do listy
     * @param text typu String
     */
    public void add(String text) {
        statement.append(text);

    }
    /**
    * Metoda odpowiedzialna obsługe zdarzen
    * @param e typu ActionEvent
    */
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {

            case "Autor":
                JOptionPane.showMessageDialog(this, "Leszek Baca", "Autor", JOptionPane.PLAIN_MESSAGE);
                break;
            case "Połącz":
                ((JButton) e.getSource()).setEnabled(false);
                new ServerRunner().start();
                break;
            default:
                throw new UnsupportedOperationException("Not supported yet.");

        }

    }
    /**
    * 
    * @param ce typu ChangeEvent
    */
    @Override
    public void stateChanged(ChangeEvent ce) {
    }
}
