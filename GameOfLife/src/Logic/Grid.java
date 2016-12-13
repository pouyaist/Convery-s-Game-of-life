/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;
/**
 *
 * @author psamadik
 */
public class Grid{
    
    private boolean doneRendering;
    private int size;
    private Cell [][] cells;
    
    public Grid(int size) {
        this.size = size;
        doneRendering = false;
        cells = new Cell[size][size];
    }
    
    public boolean checkRenderingStatus() {
        return !doneRendering;
    }
    
    public void updateGrid() {
        doneRendering = false;
        for (int i = 0; i< size; i++)
        {
            for (int j=0; j<size; j++)
            {
                cells[i][j].decideNextState();       
            }
        }
        for (int i = 0; i< size; i++)
        {
            for (int j=0; j<size; j++)
            {
                cells[i][j].updateCell();       
            }
        }
        doneRendering = true;        
    }
}