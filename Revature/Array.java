import java.util.*;

 class Array
 {
   public static void main(String args[])
   { 
    Scanner sc=new Scanner(System.in);
    //1.Getting the size of Array
    System.out.println("Enter the size of Array");
    int n=sc.nextInt();
    
    //2.Getting the elements of Array
    System.out.println("Enter the Array Elements");
    int arr[]=new int[100];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    
    //3.Printing the array elements
    System.out.println("The Array Elements are:");
    for(int i=0;i<n;i++){
      System.out.println(arr[i]);
    }
    
    //4.Printing the even elements in array
    System.out.println("Even elements in Array are");
    for(int i=0;i<n;i++){
      if(arr[i]%2==0){
        System.out.println(arr[i]);
      }
    }
    
    //5.Printing the elements that are greater than 50
    System.out.println("The elements that are greater than 50:");
     for(int i=0;i<n;i++){
      if(arr[i]>50){
        System.out.println(arr[i]);
      }
    }
    
    //6.Printing the elements that are between 51 and 100
    System.out.println("The elements that are between 51 and 100:");
     for(int i=0;i<n;i++){
      if(arr[i]>51 && arr[i]<100){
        System.out.println(arr[i]);
      }
    }
    
    //7.Printing the odd elements in an array
    System.out.println("Odd elements in Array are");
    for(int i=0;i<n;i++){
      if(arr[i]%2 !=0){
        System.out.println(arr[i]);
      }
    }
    
    //8.To print the sum of elements in an array
    System.out.println("Sum of elements in Array are");
    int sum=0;
    for(int i=0;i<n;i++){
      sum+=arr[i];    
    }
    System.out.println(sum);
    
    //9.To print the average of elements in an array
    int avg=sum/n;
    System.out.println("Average of elements in array is:"+avg);
    
    //10.To print the elements in the even index
    System.out.println("Elements in even index: ");
    for(int i=0;i<n;i++){
      if(i%2==0){
        System.out.println(arr[i]);
      }
    }
    

    //11.To print the elements in the odd index
    System.out.println("Elements in odd index: ");
    for(int i=0;i<n;i++){
      if(i%2!=0){
        System.out.println(arr[i]);
      }
    } 
    sc.close();
   }
 }
