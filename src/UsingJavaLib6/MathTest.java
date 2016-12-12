/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UsingJavaLib6;

import java.util.Scanner;

/**
 *
 * @author Annu
 */
public class MathTest {
    public static void main(String args[])
    {
        int a=(int)(Math.random()*5);
        int sum=0,d;
        System.out.println(a);
        System.out.println("Enter the number:");
        Scanner userip=new Scanner(System.in);
        int num=userip.nextInt();
        for(;num>0;)
        {
            d=num%10;
            sum+=d;
            num/=10;
        }
        System.out.println(sum);
        /*for(;;)
        {
            System.out.println("H");
        }*/
        while(true)
        {
            System.out.println("He");
        }
        /*while(input >0)
        { int d=input%10;
        Sum+=d;
        input/=10;
        }*/
    }
}
