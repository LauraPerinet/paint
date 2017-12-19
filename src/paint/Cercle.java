/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author licence
 */
public class Cercle implements Forme{
    private int rayon;
    private int x=0;
    private int y=0;
    
    
    public Cercle(){
        this.rayon=100;
    }
    public Cercle(int cote, int x, int y){
        this.rayon=cote;
        this.x=x;
        this.y=y;
    }
   

    @Override
    public void deplace(int x, int y) {
        this.x+=x;
        this.y+=y;
    }

    @Override
    public void dessine(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(x, y, rayon, rayon);
    }
    
}
