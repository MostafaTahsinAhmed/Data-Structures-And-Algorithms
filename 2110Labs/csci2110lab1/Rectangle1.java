import com.sun.source.tree.DirectiveTree;
import org.w3c.dom.css.Rect;

public class Rectangle1 {

    private int xpos;
    private int ypos;
    private int height;
    private int width;


    public Rectangle1(){}

    public Rectangle1(int xpos,int ypos,int width,int height){
        this.xpos = xpos;
        this.ypos = ypos;
        this.height = height;
        this.width = width;
    }


    public void setXpos(int xpos){
        this.xpos = xpos;
    }

    public void setYpos(int ypos){
        this.ypos = ypos;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public void setWidth(int width){
        this.width = width;
    }


    public int getX(){
        return xpos;
    }

    public int getY(){
        return ypos;
    }


    public int getHeight(){
        return height;
    }


    public int getWidth(){
        return width;
    }


    public void moveto(int xpos,int ypos){
        this.xpos = xpos;
        this.ypos = ypos;
    }

    public void resize(int height,int weight){
        this.height = height;
        this.width = width;
    }

    public String toString(){ return "[xpos= " +xpos+","+"ypos= " + ypos+"] width: " +
            width+",height: "+height; }


    public boolean contains(int px,int py){
        return (px>=xpos && px<=xpos+width && py>=ypos && py<=ypos + height);
    }

    public boolean contains(Rectangle1 r) {
        return(this.contains(r.getX(),r.getY())&&
                this.contains(r.getX() + r.getWidth(), r.getY()+r.getHeight())); }
}


