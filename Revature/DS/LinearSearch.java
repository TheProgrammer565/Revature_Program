import java.util.*;
public class LinearSearch {
 public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the size of Array:");
   int n=sc.nextInt();
   int arr[]=new int[n];
   System.out.println("Enter the Array Elements:");
   for(int i=0;i<n;i++){
     arr[i]=sc.nextInt();
   }
   System.out.println("Enter the Element to Search:");
   int search=sc.nextInt();

   for(int i=0;i<n;i++){
     if(arr[i]==search){
       System.out.println("Element found");
     }
   }
   System.out.println("Element not found");
   sc.close();
 }
}
