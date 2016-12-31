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
class B
{
  public void aMethod (byte x)
  {
    System.out.println("byte x: " + x);
  }
 
  public void aMethod (short x)
  {
    System.out.println("short x: " + x);
  }
 
  public void aMethod (int x)
  {
    System.out.println("int x: " + x);
  }
 
  public void aMethod (long x)
  {
    System.out.println("long x: " + x);
  }
 
  public void aMethod (float x)
  {
    System.out.println("float x: " + x);
  }
 
  public void aMethod (double x)
  {
    System.out.println("double x: " + x);
  }  
}
 
class PracticeExercise1
{
  public static void main (String[] args)
  {
    B bb = new B();
    bb.aMethod((long)(10)); //long version will be called
    bb.aMethod(10); //int version will be called, default is int
    bb.aMethod((short)(10)); //short version will be called
    bb.aMethod((byte)(10)); //byte version will be called
    bb.aMethod(10.00); //double version will be called, default is double
    bb.aMethod(10.00f); //float version will be called
    float f = 10;
    bb.aMethod(f); //float version will be called
    double d = 10;
    bb.aMethod(d); //double version will be called
  }
}
/*
OUTPUT
======
D:\JavaPrograms>java PracticeExercise1
long x: 10
int x: 10
short x: 10
byte x: 10
double x: 10.0
float x: 10.0
float x: 10.0
double x: 10.0
*/
/*
My o/p
run:
long x: 10
int x: 10
short x: 10
byte x: 10
double x: 10.0
float x: 10.0
float x: 10.0
double x: 10.0
BUILD SUCCESSFUL (total time: 1 second)
*/
