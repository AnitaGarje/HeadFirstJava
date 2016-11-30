/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package headinterface;

/**
 *
 * @author Annu
 */
public class ComboDrive extends DVDRecoder ,CDRecoder {
    
    public void test()
    {
        super.burn();
    }
    public static void main(String[] args) {
        ComboDrive c= new ComboDrive();
        c.test();
    }
}
