public class Rectangle2 {
            private int xpos;
            private int ypos;
            private int width;
            private int height;

            public Rectangle2(){};

            public Rectangle2(int xpos,int ypos,int width,int height){
                this.xpos = xpos;
                this.ypos = ypos;
                this.width = width;
                this.height = height;
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
        return (px>xpos && px<xpos+width && py>ypos && py<ypos + height);
    }

    public boolean contains(Rectangle2 r) {
        return (this.contains(r.getX(), r.getY()) &&
                this.contains(r.getX() + r.getWidth(), r.getY() + r.getHeight()));
    }

    public boolean touches(Rectangle2 r){
                return (this.tap(r.getX(), r.getY()) ||
                        this.tap(r.getX() + r.getWidth(), r.getY() + r.getHeight()));

    }

    public boolean tap(int px,int py){
                return (px==xpos || px==xpos+width || py==ypos || py==ypos + height);
    }

}









