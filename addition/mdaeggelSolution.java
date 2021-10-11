package addition;

import java.util.Scanner;

public class mdaeggelSolution {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number");
        int n1 = scanner.nextInt();
        System.out.println("Please enter the second number");
        int n2 = scanner.nextInt();

        System.out.println(String.format("The result of your calculation is: %s + %s = %s", n1, n2, n1+n2));
    }


}
