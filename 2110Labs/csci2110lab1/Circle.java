public class Circle {

    private double xpos;
    private double ypos;
    private double radius;

    public Circle(){}

    public Circle(double xpos,double ypos,double  radius) {
        this.xpos = xpos;
        this.ypos = ypos;
        this.radius = radius;
    }

    public void setXYpos(double xpos,double ypos){
        this.xpos = xpos;
        this.ypos = ypos;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getXpos() {
        return xpos;
    }

    public double getYpos() {
        return ypos;
    }

    public double getRadius() {
        return radius;
    }


    public boolean contains(double x1,double y1,double radi1,double x2,double y2,double radi2){
        double centerDistance = Math.sqrt(Math.abs(Math.pow(x1-x2,2)+Math.pow(y1-y2,2)));
        double radiusDifference =Math.abs(radi2 - radi1);
        return centerDistance<radiusDifference;
    }


    public boolean touches(double x1,double y1,double radi1,double x2,double y2,double radi2){
        double centerDistance = Math.sqrt(Math.abs(Math.pow(x1-x2,2)+Math.pow(y1-y2,2)));
        double radiusDistance =radi2 + radi1;
        double absRadiusDistance = Math.abs(radi1-radi2);
        return (centerDistance==radiusDistance || centerDistance==absRadiusDistance);
    }

    public String toString(){
        return ("The first Circle's centre is at: " + this.xpos + "," + this.ypos + "\n " +
                "The first Circle's radius is : "  + this.radius);
    }


}
