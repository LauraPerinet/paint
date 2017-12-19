/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author licence
 */
public class Dessin implements Forme{
    private ArrayList<Forme> formes=new ArrayList();
    private int x;
    private int y;
    
    public void add(Forme forme){
        this.formes.add(forme);
        System.out.println(formes.size());
    }
    public void deplace(int x, int y){
        this.x+=x;
        this.y+=y;
    }

    @Override
    public void dessine(Graphics g) {
        for(Forme f : formes){
            System.out.println(g.getColor());
            f.dessine(g);
        }
    }
    
}
