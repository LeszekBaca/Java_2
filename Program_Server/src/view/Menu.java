/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * 
 * Temat: Serwer
 * @author Leszek Baca
 * @version 1.0
 * Klasa odpowiedzialna za utworzenie Menu w GUI 
 * Klasa Menu dziedziczy po klasie JMenuBar
 */
public class Menu extends JMenuBar {
/**
 * Konstruktor klasy Menu
 * @param it typu ActionListener
 */
public Menu(ActionListener it) {


        //menu Autor
        JMenuItem author = new JMenuItem("Autor");
        author.addActionListener(it);
        author.setActionCommand("Autor");


        //menu Informacje
        JMenu information = new JMenu("Informacje");
        information.add(author);
        add(information);

    }
}
