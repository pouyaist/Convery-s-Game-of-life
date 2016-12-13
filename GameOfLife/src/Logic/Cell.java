/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

enum cellState
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
    private cellState nextState;
    
    // Holds the current state of a cell. 
    private cellState state;
    
    // Holds the x-coordinate of a cell
    private int xCoordinate;
    
    // Holds the y-coordinate of a cell
    private int yCoordinate;
    
    // Array to hold the Alive Neighbours
    private Cell[] neighbourCells;
    
    private int aliveNeighbours;
    // Constructor for a cell
    public Cell()
    {
        nextState = cellState.dead;
        state = cellState.dead;
        xCoordinate = 0;
        xCoordinate = 0;   
        neighbourCells = new Cell[8];
        aliveNeighbours = 0;
    }  

    public Cell getNeighbourCellElement(int index) {
        return neighbourCells[index];
    }
    
    public void setNeighbourCellElement(int index, Cell value) {
        this.neighbourCells[index] = value;
    }

/*    public void setNextState(state state) {
        nextState = state;
    } */

    public void updateState() {
        this.state = this.nextState;
    }

    public cellState getState() {
        return this.state;
    }
    
    public void setCoordinates(int x, int y){
        this.xCoordinate = x;
        this.yCoordinate = y;
    }
    
/*    public void goAlive()
    {
        this.state = state.alive;
    }
    
    public void goDead()
    {
        this.state = state.dead;
    }  */
    
    public void decideNextState()
    {
        countAliveNeighbours();
        if(this.state == cellState.dead && aliveNeighbours == 3)
        {
            this.nextState = cellState.alive;
        }
        else if(this.state == cellState.alive && (aliveNeighbours < 2 || aliveNeighbours > 3))
        {
            this.nextState = cellState.dead;
        }
    }
    
    private void countAliveNeighbours()
    {
        for(Cell neighbour: neighbourCells)
        {
            if(neighbour.state == cellState.alive)
            {
                this.aliveNeighbours++;
            }            
        }        
    }
}
