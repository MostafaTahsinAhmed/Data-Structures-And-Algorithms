public class Player {

    //instance variables
    private String name;

    //constructor
    public Player(String name){
        this.name = name;
    }


    //kick method
    public void Kick(Field f,Ball b,double d,double r){

        double r_radians = Math.toRadians(r);

        double newbx = (b.getBx()+ (d * Math.cos(r_radians)));
        double newBy = (b.getBy()+ (d * Math.sin(r_radians)));


            //checking if the new x coordinate is inside the field    and   checking if the new y coordinate is inside the field
        if((newbx > f.getXpos() && newbx < f.getLength()+f.getXpos()) && (newBy >f.getYpos() && newBy < f.getYpos()+f.getWidth())){
            b.setBx(newbx);
            b.setBy(newBy);
            System.out.println(this.name + " kicks the ball for a dis-tance of " + d + "pixels at " + r + "degrees");
        }

           //checking if the new x coordinate is not inside the field  and    checking if the new y coordinate is inside the field
        if((newbx < f.getXpos() || newbx > f.getXpos()+f.getLength())  && (newBy > f.getYpos() && newBy < f.getYpos()+f.getWidth())){
            b.setBx(b.getBx());
            b.setBy(newBy);
            System.out.println(this.name + " kicks the ball for a dis-tance of " + d + "pixels at " + r + "degrees");
            System.out.println("The ball reflected");
        }


           //checking if the new x coordinate is inside the field     and   checking if the new y coordinate is not inside the field
        if((newbx > f.getXpos() && newbx < f.getXpos()+f.getLength()) && (newBy < f.getYpos() || newBy > f.getYpos() + f.getWidth())){
            b.setBx(newbx);
            b.setBy(b.getBy());
            System.out.println(this.name + " kicks the ball for a dis-tance of " + d + "pixels at " + r + "degrees");
            System.out.println("The ball reflected");
        }

           //checking if the new x coordinate is not inside the field and checking if the new y coordinate is not inside the field
        if((newbx <f.getXpos() || newbx > f.getXpos()+f.getLength()) && (newBy < f.getYpos() || newBy > f.getYpos()+f.getWidth())){
            b.setBx(b.getBx());
            b.setBy(b.getBy());
            System.out.println(this.name + " kicks the ball for a dis-tance of " + d + "pixels at " + r + "degrees");
            System.out.println("The ball reflected back to same postion");
        }
    }

    //toString method for player class
    public String toString() {
        return "Player " + name;
    }

}
