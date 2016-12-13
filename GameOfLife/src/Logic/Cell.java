/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.*;

enum state
{
  dead, alive
}
/**
 *
 * @author npanpali
 *         
 */
public class Cell {
    
    // Holds the next state of a cell. 
    private state nextState;
    
    // Holds the current state of a cell. 
    private state state;
    
    // Holds the x-coordinate of a cell
    private int xCoordinate;
    
    // Holds the y-coordinate of a cell
    private int yCoordinate;
    
    // Array to hold the Alive Neighbours
    Cell[] neighbourCells;
    
    // Constructor for a cell
    public Cell()
    {
        nextState = state.dead;
        state = state.dead;
        xCoordinate = 0;
        xCoordinate = 0;   
        neighbourCells = new Cell[8];
    }  


/*    public void setNextState(state state) {
        nextState = state;
    } */

    public void updateState() {
        state = nextState;
    }

    public state getState() {
        return state;
    }
    
    public void setCoordinates(int x, int y){
        xCoordinate = x;
        yCoordinate = y;
    }
    
    public void goAlive()
    {
        
    }
    
    public void goDead()
    {
    
    }
    
    public void decideNextState()
    {
        
    }
}
