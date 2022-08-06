public class StringExample {
  public static void main(String[] args){
    String s1="Welcome";
    String s2="Welcome";
    String s3=new String("Welcome");
    if(s1.equals(s2)){
      System.out.println("Yes");
    }
    if(s2.equals(s3)){
      System.out.println("Yes1");
    }
    if(s1.equals(s3)){
      System.out.println("Yes2");
    }
    System.out.println(s1==s2);
    System.out.println(s2==s3);
    System.out.println(s1==s3);

    //Inserting a string inside a string
    StringBuffer sb=new StringBuffer("Chennai  Technology");
		sb.insert(8,"Institute of");
		System.out.println(sb);

    //pgm to find no of words in a string
    //pgm to create an array of with 5 elements and rotate their position towards the left 3 times.
    }
}
