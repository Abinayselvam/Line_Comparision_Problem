public class Comparision {
public static void main(String[] args)
{
    System.out.println("Welcome to the Line Comparision Project");
    //UC2 Calculate length of line

    Line line=new Line(0,0,3,4);
    Line line1=new Line(1,1,4,5);

    if(line.equals(line1))
    {
        System.out.println("Lines are equal");
    }
    else{
        System.out.println("Lines are not equal");
    }
}
}
