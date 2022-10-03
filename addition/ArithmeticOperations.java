import java.util.*;

public class ArithmeticOperations{
  pubic static void main (String args[]){
    
    Scanners sc  = new Scanner (System.in);
    int a ;
    System.out .println("Enter the value of a ");
    a = sc.nextInt();
    int b ;
    System.out .println("Enter the value of b ");
    b = sc.nextInt();
    
    int c =  a +b;
    
    System.out.println("The sum of a and b is " + c );
    
    sc.close();
  }
}
    
