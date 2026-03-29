import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner z = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num1 = z.nextInt();
        System.out.print("Enter another number : ");
        int num2 = z.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is : "+sum);
        z.close();
    }
    }
