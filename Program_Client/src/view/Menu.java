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
 * Temat: Klient
 * @author Leszek Baca
 * @version 1.0
 * Klasa Menu odpowiedzialna za utworzeniu Menu w GUI
 * Klasa Menu dziedziczy po JMenuBar
 */
public class Menu extends JMenuBar {

   /**
    * Konstruktor klasy Menu 
    * @param it typu ActionListener
    */
    public Menu(ActionListener it) {
        
        //menu Wyjście
        JMenuItem exit = new JMenuItem("Wyjście");
        exit.addActionListener(it);
        exit.setActionCommand("Wyjście");

        //menu Autor
        JMenuItem author = new JMenuItem("Autor");
        author.addActionListener(it);
        author.setActionCommand("Autor");

        //menu Menu
        JMenu menu = new JMenu("Menu");
        //menu.add(connect);
        menu.add(exit);
        add(menu);

        //menu Informacje
        JMenu information = new JMenu("Informacje");
        information.add(author);
        add(information);

    }
}
