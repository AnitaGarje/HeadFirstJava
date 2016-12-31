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
public class PetPower {
    public static void main(String args[])
    {
        Vet v=new Vet();
        Dog d=new Dog();
        Hippo h=new Hippo();
        Animal a=new Dog();
       // Dog d1=new Animal();//error incompatible types,Animal can't be coverted to Dog
        v.giveShot(d);
        v.giveShot(h);
        System.out.println("Proof that Instance variables are not overriden:"+a.size);
         System.out.println("Size variable from Dog object:"+d.size);
        //a.dogSpecific(); //thi doesn't work
    }
}
