/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chapt12GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Annu
 */
public class SimpleGUI implements ActionListener {//step 1
   JButton clickme;
   JFrame frame;
    public  SimpleGUI() {
        this.frame=new JFrame();
        this.clickme=new JButton("Click Me!!!");
        this.clickme.addActionListener(this);    //register
        frame.getContentPane().add(clickme);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);   
    }
    
    @Override        
    public void actionPerformed(ActionEvent ae)// decide next action n note that we are not calling
    {// this method directly anywhere still after clicking it gets invoked due t regiterig your object to Actionlistener
        clickme.setText("I have been clicked");//Actionlistner does that for u
    }

  
}
