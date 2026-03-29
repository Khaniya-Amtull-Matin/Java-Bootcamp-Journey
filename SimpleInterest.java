import java.util.Scanner;
public class SimpleInterest {
    public static void main(String args[]) {
        Scanner z = new Scanner(System.in);
        System.out.print("Enter a principal amount : ");
        double p = z.nextDouble();
        System.out.print("Enter rate of interest : ");
        double r = z.nextDouble();
        System.out.print("Enter time : ");
        double t = z.nextDouble();
        double si = (p*r*t)/100;
        System.out.println("The simple interest is: "+si);
        z.close();
    }
}