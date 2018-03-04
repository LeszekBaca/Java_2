package view;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JToolBar;

/**
 * Temat: Serwer
 * @author Leszek Baca
 * @version 1.0
 * Klasa odpowiedzialna pyrzcisk Connect w GUI
 * Klasa Button dziedziczy po JToolBar
 */
public class Button extends JToolBar {
/**
 * Konstruktor klasy Button
 * @param it typu ActionListener
 */
    Button(ActionListener it) {
        super(JToolBar.CENTER);
        this.setFloatable(false);

        //button dodajacy wpis
        JButton button = new JButton("Połącz");
        button.addActionListener(it);
        button.setActionCommand("Połącz");
        this.add(button);


    }
}