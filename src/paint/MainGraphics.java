/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author licence
 */
class MainGraphics extends JPanel{
    Dessin dessin;
    public MainGraphics(Dessin dessin){
        this.dessin=dessin;
    }
    public void paintComponent(Graphics g){
        dessin.dessine(g);
    }
}
