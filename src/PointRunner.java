import java.util.Scanner;

public class PointRunner {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a x value: ");
    int x = scan.nextInt();
    System.out.print("Enter a y value: ");
    int y = scan.nextInt();
    Point cord = new Point(x,y);
    System.out.println(cord.Quadrant());
    }
}
