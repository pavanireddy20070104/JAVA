//Find square and cube of a number
import java.util.Scanner;
public class Square{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER THE VALUE OF NUM:");
    int num = sc.nextInt();
    int square=(num)*(num);
    int cube=(num)*(num)*(num);
    System.out.println("SQUARE OF THE NUMBER IS " + square);
    System.out.println("CUBE OF THE NUMBER IS " + cube);
    sc.close();
  }
}
