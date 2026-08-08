import java.util.*;

public class Program4
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter first numbers:");
            int p1 = sc.nextInt();
            System.out.println("Enter second numbers:");
            int p2 = sc.nextInt();

            int sum = p1 + p2;
            int diff = p1 - p2;
            int product = p1 * p2;
            int quotient = p1 / p2;
            int remainder = p1 % p2;

            System.out.println("Total = " + sum);
            System.out.println("Difference = " + diff);
            System.out.println("Product = " + product);
            System.out.println("Quotient = " + quotient);
            System.out.println("Remainder = " + remainder);
        }
    }
}