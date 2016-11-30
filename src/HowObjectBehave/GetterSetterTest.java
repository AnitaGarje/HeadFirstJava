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
public class GetterSetterTest {
    public static void main(String[] args)
    {
        GetterSetter gs=new GetterSetter();
       // gs.size=10;//error size has a private access in GetterSetter
        gs.setSize(10);
        System.out.println(gs.getSize());
        gs.publicsize=12;
        
    }
    
}
