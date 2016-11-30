/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HowObjectBehave;

/**
 *
 * @author Annu
 */
public class GoodDogTest {
    public static void main(String[] args)
    {
        GoodDog one=new GoodDog();
        GoodDog two=new GoodDog();
        one.setSize(70);
        two.setSize(25);
        one.bark();
        two.bark();
        
    }
    
}
