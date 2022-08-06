import java.util.*;

public class LeapYear {
  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int n=sc.nextInt();
      if(n%100==0){
          if(n%400==0){
              System.out.println("Yes");
          }
          else{
              System.out.println("No");
          }
      }
      else{
          if(n%4==0){
              System.out.println("Yes");
          }
          else{
              System.out.println("No");
          }
      }
      sc.close();
  }
}