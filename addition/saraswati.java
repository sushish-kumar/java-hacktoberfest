import java.util.*;
class solution{
  public static void main(String args[]){
  
    Scanner sn = new Scanner(System.in);
    String first_string,second_string,summation;
    
    first_string = sn.nextLine();
    second_string = sn.nextLine();
    
    //summation logic
    summation = first_string+second_string;
    
    System.out.println(summation);
  }
}