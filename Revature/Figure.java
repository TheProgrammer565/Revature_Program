abstract class Figure{
  double dim1,dim2;
  Figure(double a,double b){
    dim1=a;
    dim2=b;
  }
  abstract double area();
}

class Rectangle extends Figure {
  Rectangle(double a,double b){
    super(a, b);
  }
  double area(){
    System.out.println("Inside area of Rectangle");
    return dim1*dim2;
  } 
}

class Triangle extends Figure{
  Triangle(double a,double b){
    super(a,b);
  }
  double area(){
    System.out.println("Inside area of Triangle");
    return 0.5*dim1*dim2;
  } 
}

class AbstractExample{
  public static void main(String[] args){
    Rectangle r=new Rectangle(9,4);
    Triangle t=new Triangle(9,4);
    System.out.println("Area of Rectangle is "+r.area());
    System.out.println("Area of Triangle is "+t.area());
  }
}