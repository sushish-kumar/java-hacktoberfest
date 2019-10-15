import java.util.*;
class solution{
  public static void main(String args[]){
  
    Scanner sn = new Scanner(System.in);
    int first_number,second_number,difference;
    
    first_number = sn.nextInt();
    second_number = sn.nextInt();
    
    //difference logic
    difference = first_number-second_number;
    
    System.out.println(difference);
  }
}
