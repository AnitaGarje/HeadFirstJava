/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ch5ExtraStrengthMethods.SinkDotComGame;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Annu
 */
public class VirtualGrid {
    
    ArrayList<Cell> cell=new ArrayList<Cell>(9);
    int n;
    ArrayList<String> dotcom=new ArrayList<String>(3);
    Scanner sc;        

    public VirtualGrid(Scanner sc) {
        this.sc=sc;
    }
 
   public void setDotComsInCells()
   {
      //System.out.println("Enter the number of dotcoms u wish to set"); 
      n=sc.nextInt();
      for(int i=0;i<n;i++)
      {
          //System.out.println("Enter the dotcoms u wish to set"); 
           dotcom.add(sc.next());
           //System.out.println("Enter 3 cells in A 0 format where u want to set given dot com");
           for(int j=0;j<3;j++)
           {
                cell.add(new Cell((sc.next()).charAt(0),sc.nextInt()));
           }
      }
   }
}
