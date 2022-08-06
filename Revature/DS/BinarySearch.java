import java.util.*;
public class BinarySearch {
    public static int binarySearch(int low,int high,int search){

    while(low<=high){
     int mid=(low+high)/2;
    if(arr[mid]==search){
      return mid;
    }
    else if(arr[mid]<search){
      low=mid+1;
    }
    else{
      high=mid-1;
    }
   }
  return -1;
 }
  public static void main(String args[]){
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

   int low=0,high=n;
    
   binarySearch(low,high,search);

   sc.close();
  }
  
}
