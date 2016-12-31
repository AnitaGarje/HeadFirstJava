/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chapt7PowerOfPoly;

/**
 *
 * @author Annu
 */
public class Dog extends Animal{
    int size=15;
    public void eat()
    {
        System.out.println("This is the eat of Dog");
    }
    public void makeNoise()
    {
        System.out.println("This is the makeNoise of Dog");
    }
    public void dogSpecific()
    {
       System.out.println("This is the Dog Specific method");  
    }
    
}
