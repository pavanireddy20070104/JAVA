#Sum of first N natural numbers
import java.util.Scanner;
public class Natural_numbers{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER THE VALUE OF N:");
    int N = sc.nextInt();
    int sum = 0;
    for(int i = 0;i <=N;i++){
      sum = sum + i;
    }
    System.out.println("THE SUM OF NUMBERS " + N + " is "+sum);
    sc.close();
  }
}
