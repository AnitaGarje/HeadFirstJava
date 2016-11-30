/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ObjectVille;

/**
 *
 * @author Annu
 */
public class TestShape {
    public static void main(String args[])
    {
        Circle c=new Circle();
        Triangle t=new Triangle();
        Rectangle rc=new Rectangle();
        
        System.out.println("Circle methods****");
        c.rotate();
        c.playSound();
        
        System.out.println("Triangle methods****");
        t.rotate();// note we have not written any methods in Trianlge class still we are able to call them due to inheritance.
        t.playSound();
        
        System.out.println("Rectangle methods****");
        rc.rotate();
        rc.playSound();
        
    }
    
}
