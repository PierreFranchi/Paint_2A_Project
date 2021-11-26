import java.awt.Color;
import java.awt.Graphics;

public abstract class Figure {

    //variables//
    protected Point origin;
    protected Color color;

    //getters//
    public Color getColor(){return color;}

    //setters//
    public void setColor(Color newColor){this.color=newColor;}

    //constructeurs//
    public Figure(){
        this.origin =new Point(); // Point(0;0)
        this.color = new Color(0,0,0); // 0 to 255
    }

    public Figure (Point p, Color c){
        this.origin = p;
        this.color = c;
    }

    //méthodes//
    //protected abstract int getPerimeter();
    //protected abstract int getSurface();
    protected abstract void setBoundingBox (int heightBB, int widthBB);
    //protected abstract void setBoundingBox (Point a, Point b);
    protected abstract void draw (Graphics g);

    @Override
    public String toString (){return "Figure située en : "+origin+", et de couleur"+color;}

}