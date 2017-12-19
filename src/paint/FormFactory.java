/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

/**
 *
 * @author licence
 */
public abstract class FormFactory {
    public static Forme createCarre(int width, int x, int y){
        Carre carre = new Carre(width, x, y);
        return carre;
    }
    public static Forme createCercle(int width, int x, int y){
        Cercle cercle = new Cercle(width, x, y);
        return cercle;
    }
    public static Dessin createDessin(){

        Dessin dessin= new Dessin();
        return dessin;
    }

    public static createCarre(int i, int i1, int i2) {
        Carre carre = new Carre(width, x, y);
    }
    
}
