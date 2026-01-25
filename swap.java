//Swap two numbers (with third variable)
import java.util.Scanner;
public class Hello{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER THE VALUE OF NUM1:");
    int num1=sc.nextInt();
    System.out.println("ENTER THE VALUE OF NUM2:");
    int num2=sc.nextInt();
    System.out.println("NUMBERS BEFORE SWAPPING ARE "+ num1 + "and" + num2);
    int temp =num1;
    num1=num2;
    num2=temp;
    System.out.println("NUMBERS AFTER SWAPPING ARE "+ num1 + "and" + num2);
  }
}
