import java.awt.Color;
import java.awt.Graphics;

public class Square extends Rectangle{

    //variables//
    protected int side=0;

    //getter//
    public int getRectHeight() {return this.rectHeight;}
    public int getRectWidth() {return this.rectWidth;}

    //setter//
    public void setRectHeight (int h) {this.rectHeight=h;}
    public void setRectWidth (int w) {this.rectWidth=w;}

    //constructeurs//
    public Square(int length)
    {
        super (length, length);
    }
    public Square(int px, int py, Color c) {
        super (px,py,c);
        setBoundingBox(0, 0);
    }

    //méthodes//
    public void setSide(int side)
    {
        super.setRectHeight(side);
        super.setRectWidth(side);
    }
    public void setBoundingBox (int heightBB, int widthBB) {
        super.setBoundingBox(heightBB,widthBB);
        if (heightBB < widthBB) {
            rectHeight = heightBB;
            rectWidth = heightBB;
        }
        else {
            rectHeight = widthBB;
            rectWidth = widthBB;

        }
    }

}
