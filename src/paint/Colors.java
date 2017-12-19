/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Graphics;
import java.awt.Color;

/**
 *
 * @author licence
 */
public class Colors implements Forme{
    Forme forme;
    Color color;
    int x=0;
    int y=0;
   
    public void setColor(Color color, Forme forme){
        this.color=color;
        this.forme=forme;
    }
    @Override
    public void deplace(int x, int y) {
        this.x=x;
        this.y=y;
    }

    @Override
    public void dessine(Graphics g) {
        g.setColor(color);
        forme.dessine(g);
    }
    
}
