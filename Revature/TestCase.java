interface Callback{
  void callback(int param);
}

class AnotherClient implements Callback{
//Implementing callback interface
public void callback(int p){
  System.out.println("Another version of callback");
  System.out.println("p squared is"+(p*p));
}
}

class TestCase{
  public static void main(String args[]){
    Callback c=new AnotherClient();

    AnotherClient ob=new AnotherClient();
    c.callback(42);
    c=ob;
    c.callback(42);
  }
}