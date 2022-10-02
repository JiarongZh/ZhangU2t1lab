public class Point {
    // instance variables
    private int x;
    private int y;
    // creates point with x and y
    public Point(int xCord, int yCord){
        this.x=xCord;
        this.y=yCord;
    }
    // creates point with just x
    public Point(int point){
        x = point;
        y = point;
    }
    // sets point to origin
    public Point(){
        x = 0;
        y = 0;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public String coordinate(){
        return "(" + x + ", " + y + ")";
    }
    public String Quadrant() {
        String Quadrant = null;
        if(x>0 && y >0 ){
            Quadrant = "I";
        }
        if (x<0 && y>0){
            Quadrant = "II";
        }
        if (x<0 && y<0){
            Quadrant = "III";
        }
        if (x>0 && y<0){
            Quadrant = "IV";
        }
        if (x == 0 & y == 0){
            Quadrant = "origin";
        } else {
            Quadrant = "axis";
        }

        return Quadrant;
    }
}
