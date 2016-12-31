/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chap08InterfacesAndAbstractCls;

import java.io.Serializable;

/**
 *
How can we call Object methods on interface if it didn't override or inherit then from Object
 */
public class Test {
    public static void main(String[] args) {
        Employee e = new EmployeeImpl();
        Employee e2;
        e2=e;
        e.equals(e2);
        e.toString();
        e.getsalary();
        System.out.println(e.equals(e2));
        System.out.println(e.toString());
        
        
         Employee e1 = new Employee() {

            @Override
            public void getsalary() {
                throw new UnsupportedOperationException("Not supported yet."); 
                   //To change body of generated methods, choose Tools | Templates.
            }
        };
        Employee e3;
        e3=e1;
        e1.equals(e3);
        System.out.println(e1.equals(e3));
        
        System.out.println("********");
        Serializable s="";
        s.toString();
        s.hashCode();
        System.out.println(s.toString());
        System.out.println(s.hashCode());
   
    }
}

interface Employee {
    public abstract void getsalary();
}
class EmployeeImpl implements Employee
{
    public void show()
    {
        System.out.println("I'm in Interface Imple");
    }

    @Override
    public void getsalary() {
       // throw new UnsupportedOperationException("Not supported yet."); 
//To change body of generated methods, choose Tools | Templates.
        System.out.println("My saalary is 100");
    }
}