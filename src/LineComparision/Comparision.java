public class Comparision {
public static void main(String[] args)
{
    System.out.println("Welcome to the Line Comparision Project");
    //UC3 Compare the lines

    Line line=new Line(0,0,3,4);
    Line line1=new Line(0,0,6,8);
    System.out.println("Length of the Line: "+line.length());
    int result =line.compareTo(line1);

    if (result == 0)
        System.out.println("Lines are equal");
    else if (result > 0)
        System.out.println("Line1 is longer");
    else
        System.out.println("Line2 is longer");
}
}
