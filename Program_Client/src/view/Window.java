
package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import model.Connect;

/**
 * Temat: Klient
 * @author Leszek Baca
 * @version 1.0
 * Klasa Window odpowiedzialna za utworzenie GUI
 * Klasa Window dziedziczy po JFrame; Interfesy: ActionListener, ChangeListener
 */
public class Window extends JFrame implements ActionListener, ChangeListener {
    /**
     * Inicjalizacja obiektu connect typu Connect
     */
    Connect connect;
    /**
     * Inicjalizacja obiektu button typu Button
     */
    Button button;
    /**
     * inicjalizajca obiektu komunikat typu JTextArea
     */
    public JTextArea statement;
    /**
     * Inicjalizacja obiektu list typu JList
     */
    JList<String> list;
    /**
     * Konstruktor klasy Window
     */
    public Window() {
        //okno
        setTitle("Klient");
        this.setMinimumSize(new Dimension(600, 400));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //obiekt Menu
        Menu mainMenu = new Menu(this);
        this.setJMenuBar(mainMenu);

        //obiekt Button
        button = new Button(this);
        add(button, BorderLayout.PAGE_END);
        try {

            connect = new Connect();
        } catch (IOException ex) {
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
        }

        //obiekt JList
        list = new JList(new DefaultListModel());
        JScrollPane scrollableList = new JScrollPane(list);
        this.add(scrollableList, BorderLayout.CENTER);


    }
    /**
     * Metoda wykorzystywana do dodawania tekstu do listy
     * @param text  typu String
     */
    public void dodaj(String text) {
        statement.append(text);

    }
    /**
     * Metoda odpowiedzialna za wyswietlenie GUI
     */
    public static void showGui() {
        Window window = new Window();
        window.pack();
        window.setVisible(true);
    }
    /**
     * Metoda odpowiedzialna za obsluge zdarzen
     * @param e typu ActionEvent
     * 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Wyjście":
                this.dispose();
                connect.close();
                break;
                
            case "Autor":
                JOptionPane.showMessageDialog(this, "Leszek Baca", "Autor", JOptionPane.PLAIN_MESSAGE);
                break;
                
            case "Wyślij":
               
                connect.send(button.text.getText().toUpperCase());

                ((DefaultListModel) list.getModel()).addElement(button.text.getText());

                for (int i = 0; i < 2; i++) {

                    try {
                 
                        ((DefaultListModel) list.getModel()).addElement(connect.answer());
                    } catch (IOException ex) {
                        Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                button.text.setText("");
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
