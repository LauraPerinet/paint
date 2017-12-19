/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JToolBar;

/**
 *
 * @author licence
 */
public class Paint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame fenetre =new JFrame();
        
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        fenetre.setVisible(true);
        
        JPanel main=new JPanel();
        main.setLayout(new BorderLayout());
        
        Menu menu = new Menu();

        JPanel dessin = new JPanel();
        dessin.setBackground(Color.yellow);

        main.add(menu, BorderLayout.NORTH);
        main.add(dessin, BorderLayout.CENTER);
        
        fenetre.setContentPane(main);
        fenetre.pack();
        fenetre.setSize(800,800);
        
       
    }

    private static JToolBar setMenu() {
        JToolBar menu = new JToolBar();
        
        JButton carre= new JButton("Bijour ! ");
        menu.add(carre);
        
        return menu;
    }
}
