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
    
}
