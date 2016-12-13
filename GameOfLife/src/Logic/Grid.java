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
    
    
    private Cell getNeighbor(int i, int j)
    {
        if (i == -1)
        {
            i = size -1;  
        }
        else if(i == size)
        {
            i = 0;
        }
        if (j == -1)
        {
            j = size -1;  
        }
        else if(j == size)
        {
            j = 0;
        }
        return cells[i][j];
    }
    
    public Grid(int size) {
        this.size = size;
        doneRendering = false;
        cells = new Cell[size][size];
       for (int i = 0; i< size; i++)
        {
            for (int j=0; j<size; j++)
            {
                cells[i][j].setNeighbourCellElement(0, getNeighbor(i-1, j));
                cells[i][j].setNeighbourCellElement(1, getNeighbor(i-1, j-1));
                cells[i][j].setNeighbourCellElement(2, getNeighbor(i-1, j+1));
                cells[i][j].setNeighbourCellElement(3, getNeighbor(i, j-1));
                cells[i][j].setNeighbourCellElement(4, getNeighbor(i, j+1));
                cells[i][j].setNeighbourCellElement(5, getNeighbor(i+1, j-1));
                cells[i][j].setNeighbourCellElement(6, getNeighbor(i+1, j));
                cells[i][j].setNeighbourCellElement(7, getNeighbor(i+1, j+1));                
            }
        }
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
                cells[i][j].updateState();       
            }
        }
        doneRendering = true;        
    }
}