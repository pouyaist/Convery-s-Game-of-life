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
public class Life {
    final private int size;
    private int timer;
    private boolean running;
    private Grid grid;
    
    public Life() {
        size = 100;
        initGame();
        running = false;
    }
    
    public Life(int size) {
        this.size = size;
        initGame();
    }
    private void initGame() {
        grid = new Grid(size);
        this.timer = 0;
    }
    public void runGame() {
        running = true;
        grid.checkRenderingStatus();
        grid.updateGrid();
        timer++;
    }
    public void stopGame() {
        running = false;
    }
    
    public boolean getRunning() {
        return running;
    }
    
    public void setRunning(boolean running) {
        this.running = running;
    }
    
}