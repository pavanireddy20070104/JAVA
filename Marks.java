//Pass or fail based on marks
import java.util.Scanner;
public class Marks{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the marks:");
    int marks = sc.nextInt();
    if (marks >= 50){
      System.out.println("you have passed the examination");
    } else {
      System.out.println("you have failed the examination");
    }
    sc.close();
  }
}
