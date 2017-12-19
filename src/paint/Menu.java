/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JToolBar;

/**
 *
 * @author licence
 */
class Menu extends JToolBar implements ActionListener{
    
    private JButton carre=new JButton("Carré");
    private JButton apply = new JButton("apply");
    private JTextField x = new JTextField(10);
    private JTextField y = new JTextField(10);
    
    public Menu(){
        carre.setActionCommand("carre");
        carre.addActionListener(this);
        
        apply.setActionCommand("apply");
        apply.addActionListener(this);
        this.add(carre);
        this.add(createSpinner());
        this.add(apply);        
    }
    
    private JPanel createSpinner(){
        JPanel jp=new JPanel();
        jp.add(new JLabel("x"));
        jp.add(x);
        
        jp.add(new JLabel("y"));
        jp.add(y);

        return jp;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String cmd=ae.getActionCommand();
        switch(cmd){
            case "carre":
                FormFactory.createCarre(50,0,0);
                break;
        }
    }

}
