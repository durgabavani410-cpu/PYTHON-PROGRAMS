import java.util.*;

public class Program6
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the length of the rectangle:");
            int length = sc.nextInt();
            System.out.println("Enter the breadth of the rectangle:");
            int breadth = sc.nextInt();

            int area = length * breadth;

            System.out.println("Area = " + area);
        }
    }
}