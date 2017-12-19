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
public class Carre implements Forme{
    private int cote;
    private int x=0;
    private int y=0;
    
    
    public Carre(){
        this.cote=100;
    }
    public Carre(int cote,int x, int y){
        this.cote=cote;
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
        
        System.out.println("cote ="+cote);
        System.out.println("y ="+y);
        System.out.println("x ="+x);
        g.setColor(Color.yellow);
        g.fillRect(x, y, cote, cote);
    }
    
}
