/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package headfirst;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Annu
 */
public class Test {
    public static void main(String[] args) throws FileNotFoundException
    {
        PrintWriter pw=new PrintWriter("abc.txt");
        pw.print("Hello");
    }
    
}
