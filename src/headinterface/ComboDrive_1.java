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
public class ComboDrive_1  implements IntDVDRecoder,IntCDRecoder{
    
    @Override
    public void burn()
    {
        System.out.println("Hello I got body here in ComboDrive");
    }
    public static void main(String[] args) {
        ComboDrive_1 c= new ComboDrive_1();
        c.burn();
        IntCDRecoder cd=new ComboDrive_1();
          //IntCDRecoder cd1=new IntCDRecoder();
        cd.burn();
        IntDVDRecoder dvd=new ComboDrive_1();
        dvd.burn();
        IntDigitalRecoder dr=new ComboDrive_1();
        dr.burn();
        
    }
}
