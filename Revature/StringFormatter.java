public class StringFormatter {
  public static void main(String args[]){
    String msg="chennai institute of technology";
    char[] charArray =msg.toCharArray();
    boolean foundSpace=true;
    for(int i=0;i<charArray.length;i++){
      if(Character.isLetter(charArray[i])){
        if(foundSpace){
          charArray[i]=Character.toUpperCase(charArray[i]);
          foundSpace=false;
        }
      }
    }  }
}
