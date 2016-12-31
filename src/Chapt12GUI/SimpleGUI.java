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
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        
        SimpleGUI sg=new SimpleGUI();
        sg.clickme=new JButton("Click Me!!!");
        sg.clickme.addActionListener(sg);    //register
        
        frame.getContentPane().add(sg.clickme);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
   
        
    }
    
    @Override        
    public void actionPerformed(ActionEvent ae)
    {
        clickme.setText("I have been clicked");
    }

  
}
