import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Figure {

    //variables//
    protected int rectHeight=0;
    protected int rectWidth=0;

    //getter//
    public int getRectHeight() {return this.rectHeight;}
    public int getRectWidth() {return this.rectWidth;}

    //setter//
    public void setRectHeight (int h) {this.rectHeight=h;}
    public void setRectWidth (int w) {this.rectWidth=w;}

    //constructeurs//

    public Rectangle (int px, int py, Color c) {
        super(new Point(px,py),c);
        setBoundingBox(0, 0);
    }
    public Rectangle (int h, int w) {
        super ();
        this.rectHeight = h;
        this.rectWidth = w;
    }

    //méthodes//
    public void setBoundingBox (int heightBB, int widthBB) {
        this.rectHeight=heightBB;
        this.rectWidth=widthBB;
    }

    public void draw (Graphics g){
        {
            int realPx, realPy; // To consider negative case

            if (rectHeight<0) {realPx=origin.getXPoint()+rectHeight;}
            else {realPx=origin.getXPoint();}

            if (rectWidth<0) {realPy=origin.getYPoint()+rectWidth;}
            else {realPy=origin.getYPoint();}

            //g.setColor(c);
            g.fillRect(realPx, realPy, Math.abs(rectHeight), Math.abs(rectWidth));
        }
    }
    public int getPerimeter() {return (this.rectHeight+this.rectWidth)*2;}
    public int getSurface() {return this.rectHeight*this.rectWidth;}

    @Override
    public String toString() {

        String s = "Rectangle "+this.rectHeight+"x"+this.rectWidth+"\n+ ";
        for (int i=0;i<rectWidth;i++) s=s+"-- ";
        s += "+\n";
        for (int j=0; j <rectHeight;j++){
            s+="| ";
            for (int i=0;i<rectWidth;i++) s=s+"   ";
            s+="|\n";
        }
        s+="+ ";
        for (int i=0;i<rectWidth;i++) s=s+"-- ";
        s += "+\n";
        return s;
    }

}