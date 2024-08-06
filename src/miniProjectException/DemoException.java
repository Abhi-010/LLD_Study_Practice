package miniProjectException;

import java.util.Scanner;

public class DemoException {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of j");
        int j = sc.nextInt();
        int i = 5;
        int k = 0;
        try {
            k = i/j;
        }
        catch(ArithmeticException exception){
            System.out.println("ArithemeticException found");
            System.out.println("Try again with value of j");
            return ;
        }
        catch (Exception e){
            System.out.println("not possible" + " Try Again with j value");
            return;
        }

        System.out.println(k);

    }
}
