/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ch5ExtraStrengthMethods.SinkDotComGame;

/**
 *
 * @author Annu
 */
public class Cell {
    private int col;
    private char row;

    public Cell(char row,int col) {
        this.col = col;
        this.row = row;
    }

    public char getRow() {
        return row;
    }

    public void setRow(char row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
    
    
}
