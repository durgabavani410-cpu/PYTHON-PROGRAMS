import java.util.*;

public class Program2
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the radius of the circle:");

            double radius = sc.nextDouble();

            double area = 3.14 * radius * radius;

            System.out.println("Area = " + area);
        }
    }
}