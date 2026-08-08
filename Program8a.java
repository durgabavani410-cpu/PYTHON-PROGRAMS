import java.util.*;

public class Program8a
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in))
        {   
            System.out.println("Enter the first number:");
            int n1 = sc.nextInt();
            System.out.println("Enter the second number:");
            int n2 = sc.nextInt();

            int temp = n1;
            n1 = n2;
            n2 = temp;

            System.out.println("First Number = " + n1);
            System.out.println("Second Number = " + n2);
        }
    }
}