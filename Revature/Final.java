final class A{
  final void meth(){
    System.out.println("This is a final method");
  }
}

class B extends A{ //Error because final class cannot be inherited
  void meth(){ // Error because final method cannot be overriden
    System.out.println("Illegal");
  }
  }


  //Returns error