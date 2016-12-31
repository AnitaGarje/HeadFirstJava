/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OverloaddigOverriding;

/**
 *
 * @author Annu
 */
class WideningAndBoxing
{
  public static void main (String[] args)
  {
    byte b = 5;
    aMethod(b);
  }
 
  static void aMethod (Object b)
  {
    System.out.println("byte b:"+b);
  }
   
  
}
 
