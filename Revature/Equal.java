import java.util.*;
class Equal{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of a:");
    int a=sc.nextInt();
    System.out.println("Enter the value of b:");
    int b=sc.nextInt();
    if(a==b){
      System.out.println("a and b are equal");
    }
    else{
      System.out.println("a and b are not equal");
    }
    sc.close();
  }
}