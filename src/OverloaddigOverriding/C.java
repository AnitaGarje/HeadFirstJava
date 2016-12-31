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
public class C {
    int ht,wt;
    public void show(int height,int width)
    {
        this.ht=height;
        this.wt=width;
    }
     public int show(int width,int height) //error meths already defined in Class C
    {
        this.ht=width;
        this.wt=height;
        return 0;
    }
      public void show(byte width,int height)
    {
        this.ht=width;
        this.wt=height;
    }
        public void show(int height,byte width)
    {
        this.ht=width;
        this.wt=height;
    }
}
