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
public class Cell {
    private boolean nextState;
    private boolean state;
    private int xCoordinate;
    private int yCoordinate;
    
    
    public Cell() {

    }

    public Cell(boolean state) {
        this.state = state;
    }

    public void setNextState(boolean state) {
        nextState = state;
    }

    public void updateState() {
        state = nextState;
    }

    public boolean getState() {
        return state;
    }
    
    public void setCoordinates(int x, int y){
        xCoordinate = x;
        yCoordinate = y;
    }
    
}
