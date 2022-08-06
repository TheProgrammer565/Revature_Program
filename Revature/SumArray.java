import java.util.*;

public class SumArray{
  public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the size of Array");
  int n=sc.nextInt();
  int sum=0;
  int arr[]=new int[n];
  for(int i=0;i<n;i++){
     arr[i]=sc.nextInt();
  }
  for(int j=0;j<n;j++){
    sum+=arr[j];
  }
  System.out.println("Sum of Array Elements is:"+sum);
  sc.close();
}
}
