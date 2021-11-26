import java.awt.*;

public class Circle extends Ellipse{
    //variables//
    protected int radius;

    //setters//
    public void setSemiAxisX (int x)
    {
        this.semiAxisX=x;
    }
    public void setSemiAxisY (int y)
    {
        this.semiAxisY=y;
    }


    //constructeurs//
    public Circle (int radius) {super (radius,radius);}

    public Circle (int px, int py, Color c) {
        super(px, py, c);
        setBoundingBox(0, 0);
    }

    //méthodes//
    public void setBoundingBox (int heightBB, int widthBB) {
        this.semiAxisX = heightBB/2;
        this.semiAxisY = widthBB/2;
    }

    @Override
    public void draw(Graphics g){
    }

    @Override
    public String toString(){
        return "Ellipse semi axis X : "+this.semiAxisX+" et Y "+this.semiAxisY;
    }

    public int getPerimeter(){
        return(int)(2*Math.PI*Math.sqrt(((this.semiAxisX^2)+(this.semiAxisY^2))/2));
    }
    public int getSurface(){
        return(int)(Math.PI*this.semiAxisX*this.semiAxisY);
    }

}
