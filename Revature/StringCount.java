public class StringCount {
  public static void main(String[] args){
    String str="chennai institute of technology";
    int vowels=0;
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
        vowels++;
      }
      System.out.println(vowels);
    }
  }
}
