import java.util.Scanner;

public class IntegerReversed {
  public static void reverse (int number){
    int reversed = 0;
    
    do{
      int d = number % 10;
      reversed = reversed * 10 + d;
    } while ((number = number / 10) != 0);
    
    System.out.println(reversed);
  }  // reverse
  
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int number = input.nextInt();
    
    System.out.print("The reversal is ");
    reverse(number);
  } // main
} // IntegerReversed
