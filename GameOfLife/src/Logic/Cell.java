/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

enum state
{
  white, black
}
/**
 *
 * @author npanpali
 */
public class Cell {
    
    // Holds the next state of a cell. 
    private state nextState;
    
    // Holds the current state of a cell. 
    private state state;
    
    // Holds the x-coordinate of a cell
    private int x_coordinate;
    
    // Holds the y-coordinate of a cell
    private int y_coordinate;
    
    // Constructor for a cell
    Cell()
    {
        nextState = state.black;
        state = state.white;
        x_coordinate = 0;
        y_coordinate = 0;
    }
}
