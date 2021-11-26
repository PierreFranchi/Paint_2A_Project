public class Point {

    //variables//
    private int xPoint;
    private int yPoint;

    //guetteurs// (getters)
    public int getXPoint() {
        return xPoint;
    }
    public int getYPoint() {
        return yPoint;
    }

    //septheures// (setters)
    public void setXPoint(int newXPoint){this.xPoint = newXPoint;}
    public void setYPoint(int newYPoint){this.yPoint = newYPoint;}

    //constructeur//
    public Point (){
        this.xPoint=0;
        this.yPoint=0;
    }

    public Point (int a, int b) {
        this.xPoint = a;
        this.yPoint = b;
    }

    //méthodes//
    @Override
    public String toString() {
        return "Point {"+this.xPoint+";"+this.yPoint+"}";
    }
}