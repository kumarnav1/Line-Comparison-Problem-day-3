package linecomparisonproblem;
import java.util.Scanner;
public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Problem Project");

        int x1Point, x2Point, y1Point, y2Point;
        double totalLength;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1Point point : ");
        x1Point = sc.nextInt();
        System.out.println("Enter x2Point point : ");
        x2Point = sc.nextInt();
        System.out.println("Enter y1Point point : ");
        y1Point = sc.nextInt();
        System.out.println("Enter y2Point point : ");
        y2Point = sc.nextInt();

        double diffForX = x2Point - x1Point;
        double diffForY = y2Point - y1Point;
        double powForX = Math.pow(diffForX, 2);
        double powForY = Math.pow(diffForY, 2);
        double bothAddition = powForX + powForY;
        totalLength = Math.sqrt(bothAddition);

        System.out.println("The Length of the Line : " + totalLength);
    }
}