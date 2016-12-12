/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ch5ExtraStrengthMethods.SinkDotComGame;

import java.util.Scanner;

/**
 *
 * @author Annu
 */
public class UserGuess {
    Scanner sc;
    VirtualGrid vg;
    public UserGuess(Scanner sc,VirtualGrid vg) {
        this.sc=sc;
        this.vg=vg;
    }
   public void checkGuess()
    {
        char row;
        int col;
        int numoftry=0;
        while(!vg.cell.isEmpty())
        {
         System.out.println("Enter the row in char(A-G):");
         row=sc.next().charAt(0);
         System.out.println("Enter the col in int(0-7):");
         col=sc.nextInt();
         numoftry++;
         for(Cell c:vg.cell)
         {
             if(c.getRow()==row & c.getCol()==col)
             {
                 System.out.println("hit");
                 vg.cell.remove(c);
                 break;
             }
             else{
                System.out.println("miss"); 
                break;
             }
         }
        }
         if(vg.cell.isEmpty())
         {
             System.out.println("Killed all"); 
             System.out.println("You took "+numoftry+ " guesses to hit all dotcoms"); 
         }
    }
  
}
