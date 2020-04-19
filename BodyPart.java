package game;
import java.awt.Color;
import java.awt.Graphics;

public class BodyPart {
	private int xCoor, yCoor, width, height;
	   
    public BodyPart(int xCoor, int yCoor, int var) {
        this.xCoor = xCoor;
        this.yCoor = yCoor;
        width = var;
        height = var;
    }
    public void tick() {
       
    }
    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(xCoor * width, yCoor * height, width, height);
 
    }
    public int getxCoor() {
        return xCoor;
    }
    public void setxCoor(int xCoor) {
        this.xCoor = xCoor;
    }
    public int getyCoor() {
        return yCoor;
    }
    public void setyCoor(int yCoor) {
        this.yCoor = yCoor;
    }
   
}


