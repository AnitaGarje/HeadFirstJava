/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BreakTheSurface;

import java.util.Arrays;

/**
 *
 * @author Annu
 */

public class Book {
    int x=1;
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
   
        Book a=new Book();
        Book b=new Book();
        Book c=b;
        c.x=4;
        b.x=6;
        System.out.println("Value in c is:"+c.x);
        System.out.println("Value in b is:"+b.x);
        int[] nums=new int[10];
        nums[0]=1;
        nums[1]=4;
        //nums={1,4,5,6,7,8};
        System.out.println(nums.length);
        
        int[] num2={1,4,5,6,67,7,45,8,0,12};
        System.out.println(num2.length);
        Object obj = new int[10];
        //System.out.println(obj.length);//error can't find symbol length
        System.out.println(num2.getClass());
        Arrays.sort(num2);
        for(int i=0;i<num2.length;i++)
        {
            System.out.println(num2[i]);
        }
        
    }
    
}
