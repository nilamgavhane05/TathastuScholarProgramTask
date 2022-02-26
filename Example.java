import java.util.Scanner;

public class Example {
    static long factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
        fact = fact * i;
        }
        return fact;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of n :");
        int n = sc.nextInt();

        System.out.println("Enter value of r :");
        int r = sc.nextInt();
  
        int p = (int)(factorial(n) / factorial(n - r));
        int c = (int)(factorial(n) / (factorial(n - r) * factorial(r)));

        System.out.println("Permutation : " + p);
        System.out.println("Combination : " + c);       
    }
}
