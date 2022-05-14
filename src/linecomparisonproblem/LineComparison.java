package linecomparisonproblem;

import java.util.Objects;
import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Problem Project");

        int x1Point, x2Point, y1Point, y2Point;
        int p1Point, p2Point, q1Point, q2Point;
        double totalLength1;
        double totalLength2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1Point point : ");
        x1Point = sc.nextInt();
        System.out.println("Enter x2Point point : ");
        x2Point = sc.nextInt();
        System.out.println("Enter y1Point point : ");
        y1Point = sc.nextInt();
        System.out.println("Enter y2Point point : ");
        y2Point = sc.nextInt();

        System.out.println("Enter x1Point point : ");
        p1Point = sc.nextInt();
        System.out.println("Enter x2Point point : ");
        p2Point = sc.nextInt();
        System.out.println("Enter y1Point point : ");
        q1Point = sc.nextInt();
        System.out.println("Enter y2Point point : ");
        q2Point = sc.nextInt();

        double diffForX = x2Point - x1Point;
        double diffForY = y2Point - y1Point;
        double powForX = Math.pow(diffForX, 2);
        double powForY = Math.pow(diffForY, 2);
        double bothAddition = powForX + powForY;
        totalLength1 = Math.sqrt(bothAddition);

        double diffForP = p2Point - p1Point;
        double diffForQ = q2Point - q1Point;
        double powForP = Math.pow(diffForP, 2);
        double powForQ = Math.pow(diffForQ, 2);
        double bothsAddition = powForP + powForQ;
        totalLength2 = Math.sqrt(bothsAddition);

        System.out.println("The Length of the Line : " + totalLength1);
        System.out.println("The Length of the Line : " + totalLength2);

        String stringOfLength1Var = String.valueOf(totalLength1);
        String stringOfLength2Var = String.valueOf(totalLength2);

        int valueAfterComparison = stringOfLength1Var.compareTo(stringOfLength2Var);
        if (valueAfterComparison == 0) {
            System.out.println("The both lines are equal ");
        } else if (valueAfterComparison > 0)
            System.out.println("The lines 1 is greater than line 2");
        else
            System.out.println("The line 2 is greater than line 1");
    }
}