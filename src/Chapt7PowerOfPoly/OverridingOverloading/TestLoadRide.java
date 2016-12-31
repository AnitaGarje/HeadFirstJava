/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chapt7PowerOfPoly.OverridingOverloading;

/**
 *
 * @author Annu
 */
public class TestLoadRide {
    /*
    2 cases either arguments are compatible or return type.
    argument-higher is called
    return type-considered as duplicate method.(if same argument exist)
    becoz only changing reurn type is not enough for overloading
    */
    
    public int returnInt(int a)
    {
        System.out.println("This is int argument");
        return a+1;
    }
     public int returnInt(byte a)
    {
        System.out.println("This is byte argument");
        return a+1;
    }
     /* public byte returnInt(long a)//error method is already defied as only byte return type
    {
            System.out.println("This is long argument");
       
        return (byte) (a+1);
    }*/
          public long returnInt(long a)//error method is already defied as only byte return type
    {
            System.out.println("This is long returning long argument");
       
        return (a+1);
    }
    
}
