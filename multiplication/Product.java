import java.util.*;  //to access the scanner from util to take input from the user
class Product //Starting of class
{
    public static void main(String arg[]) //starting of main method
    {
        int a,b;
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the values of a and b");
        a=sn.nextInt();
        b=sn.nextInt();
        System.out.println("The product of "+a+" and " +b+" is "+a*b); //a*b will give the product value so no need to take any variable to store the product
    } //end of main
} //end of class
