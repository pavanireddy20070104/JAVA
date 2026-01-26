import java.util.Scanner;
public class Swapping{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER THE NUM1 VALUE:");
    int num1=sc.nextInt();
    System.out.println("ENTER THE NUM2 VALUE:");
    int num2=sc.nextInt();
    System.out.println("The numbers before swapping are "+ num1 + " and "+ num2);
    num1 = num1 +num2;
    num2=num1 - num2;
    num1=num1-num2;
    System.out.println("Then numbers after swapping are "+ num1 +" and "+ num2);
  }
}
