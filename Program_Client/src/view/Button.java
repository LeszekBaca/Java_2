package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;

/**
 * Temat: Klient
 * @author Leszek Baca
 * @version 1.0
 * Klasa Button odpowiedzialna jest za utworzenie przycisku oraz pola
 * do wpisywania tekstu
 * Klasa Button dziedziczy po JToolBar
 */
public class Button extends JToolBar {
    /**
     * Inicjalizacja obiektu text typu JTextField
     */
    JTextField text;
    /**
     * Konstruktor klasy Button
     * @param it typu ActionListener
     */
    Button(ActionListener it) {
        super(JToolBar.CENTER);
        this.setFloatable(false);

        //button dodajacy wpis
        JButton button = new JButton("Wyślij");
        button.addActionListener(it);
        button.setActionCommand("Wyślij");
        this.add(button);

        //pole do wpisywania tekstu
        text = new JTextField();
        JScrollPane scroll = new JScrollPane(text);
        
        this.add(scroll);
        this.add(scroll, BorderLayout.PAGE_START);



    }
}