import java.awt.*;
import java.util.Scanner;

public class Comparision {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Line Comparison Computation Program");

        System.out.print("Enter Line 1 (x1 y1 x2 y2): ");
        Line line1 = new Line(
                new Point(sc.nextInt(), sc.nextInt()),
                new Point(sc.nextInt(), sc.nextInt())
        );

        System.out.print("Enter Line 2 (x1 y1 x2 y2): ");
        Line line2 = new Line(
                new Point(sc.nextInt(), sc.nextInt()),
                new Point(sc.nextInt(), sc.nextInt())
        );

        double len1 = line1.length();
        double len2 = line2.length();

        System.out.println("Length1 = " + len1);
        System.out.println("Length2 = " + len2);

        // UC2
        System.out.println(line1.equals(line2)
                ? "Lines are equal"
                : "Lines are not equal");

        // UC3
        int result = line1.compareTo(line2);

        if (result > 0) {
            System.out.println("Line1 is longer");
        } else if (result < 0) {
            System.out.println("Line2 is longer");
        } else {
            System.out.println("Both lines are equal");
        }

        sc.close();
    }
}
