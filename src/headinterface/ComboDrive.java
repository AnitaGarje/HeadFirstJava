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
public class ComboDrive extends DVDRecoder ,CDRecoder {//error becoz both are classes can't extend 2  classes
    
    public void test()
    {
        super.burn();
    }
    public static void main(String[] args) {
        ComboDrive c= new ComboDrive();
        c.test();
    }
}
