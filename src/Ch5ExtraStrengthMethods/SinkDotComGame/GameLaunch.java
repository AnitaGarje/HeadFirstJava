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
public class GameLaunch {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        VirtualGrid vg=new VirtualGrid(sc);
        vg.setDotComsInCells();
        UserGuess ug=new UserGuess(sc,vg);
        ug.checkGuess();
    }
    
}
