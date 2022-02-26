import java.util.Scanner;

public class Diamond {
    public static void main(String[] args){
        System.out.print("Enter the value of rows (odd) : ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int mid = (row+1)/2;

        for(int i = 1; i <= mid; i++){
            for(int j = 1; j <= (mid - i); j++){
                System.out.print(" ");
            }
            for(int k = 1; k <=(2*i - 1); k++){
                System.out.print("*");
            }
            System.out.println();           
        }

        for(int i = 1; i <= (mid - 1); i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*(mid - i) - 1; k++){
                System.out.print("*");
            }
            System.out.println();           
        }
    }
    
}
