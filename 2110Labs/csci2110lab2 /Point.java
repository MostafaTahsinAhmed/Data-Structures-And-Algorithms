public class Point<T> {

    private T xpos;
    private T ypos;

    public Point(T entry1,T entry2){
        this.xpos = entry1;
        this.ypos= entry2;
    }

    public T getXpos(){
        return xpos;
    }

    public T getYpos(){
        return this.ypos;
    }

    public void setXpos(T xpos){
       this.xpos = xpos;
    }

    public void setYpos(T ypos){
        this.ypos = ypos;
    }

    public String toString(){
        return "XPOS: " + xpos + "  YPOS: " + ypos;
    }

}
