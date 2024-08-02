public class Ball {

    //instance variables for Ball class
    private double bx;
    private double by;

    //constructor
    public Ball(double bx, double by) {
        this.bx = bx;
        this.by = by;
    }

    //getters and setters methods
    public double getBx() {
        return bx;
    }

    public double getBy() {
        return by;
    }

    public void setBx(double bx) {
        this.bx = bx;
    }

    public void setBy(double by) {
        this.by = by;
    }

    //toString method for Ball class
    public String toString() {
        return "Ball is at (" + bx + "," + by + ")";

    }
}