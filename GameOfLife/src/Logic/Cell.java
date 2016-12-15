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
public class Cell
{

    private final static byte NUMBER_OF_NEIGHBOURS = 8;    
    
    // Holds the next currentState of a cell. 
    private cellState nextState;
    
    // Holds the current currentState of a cell. 
    private cellState currentState;
    
    // Holds the x-coordinate of a cell
    private int xCoordinate;
    
    // Holds the y-coordinate of a cell
    private int yCoordinate;
    
    // Array to hold the Alive Neighbours
    private Cell[] neighbourCells;
    
    // Holds a count of the number of alive neighbours
    private int aliveNeighbours;    
    
    // Constructor for a cell
    public Cell()
    {
        nextState = cellState.dead;
        currentState = cellState.dead;
        xCoordinate = 0;
        xCoordinate = 0;   
        neighbourCells = new Cell[NUMBER_OF_NEIGHBOURS];
        aliveNeighbours = 0;
    }  

    // Property to get a particular neighbour cell
    public Cell getNeighbourCellElement(int index)
    {
        return neighbourCells[index];
    }
    
    // Property to set a particular neighbour cell
    public void setNeighbourCellElement(int index, Cell value)
    {
        this.neighbourCells[index] = value;
    }

/*    public void setNextState(currentState currentState)
    {
        nextState = currentState;
    } */
    
    // Update the current currentState to the next currentState 
    public void updateState()
    {
        this.currentState = this.nextState;
    }

    // Get the current currentState of the cell
    public cellState getCurrentState()
    {
        return this.currentState;
    }
    
    // Set the cell position on the grid.
    public void setCoordinates(int x, int y)
    {
        this.xCoordinate = x;
        this.yCoordinate = y;
    }
    
/*    public void goAlive()
    {
        this.currentState = currentState.alive;
    }
    
    public void goDead()
    {
        this.currentState = currentState.dead;
    }  */
    
    // Holds the logic to decide the next currentState of a cell based on its neighbours. 
    // 
    public void decideNextState()
    {
        countAliveNeighbours();
        if(this.currentState == cellState.dead && aliveNeighbours == 3)
        {
            this.nextState = cellState.alive;
        }
        else if(this.currentState == cellState.alive && (aliveNeighbours < 2 || aliveNeighbours > 3))
        {
            this.nextState = cellState.dead;
        }
    }
    
    // Holds logic to count the number of alive neighbours
    private void countAliveNeighbours()
    {
        for(Cell neighbour: neighbourCells)
        {
            if(neighbour.currentState == cellState.alive)
            {
                this.aliveNeighbours++;
            }            
        }        
    }
}
