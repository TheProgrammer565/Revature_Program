import java.util.*;

public class Reverse {
  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int n=sc.nextInt();
      int dig=0,sum=0;
      while(n>0){
          dig=n%10;
          sum=sum*10+dig;
          n=n/10;
      }
      System.out.println("The reverse of a number is:"+sum);
      
      if(n==sum){
          System.out.println("The given number is a Palindrome");
      }
      else{
          System.out.println("The given number is not a Palindrome");
      }
      sc.close();
  }
}
