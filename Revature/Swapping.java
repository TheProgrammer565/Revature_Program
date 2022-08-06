import java.util.*;

public class Swapping {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of a:");
    int a=sc.nextInt();
    System.out.println("Enter the value of b:");
    int b=sc.nextInt();
    System.out.println("Values before swapping:"+a+" and "+b);
    int temp=a;
    a=b;
    b=temp;
    System.out.println("Values after swapping:"+a+" and "+b);   
    sc.close();
  }
  
}
