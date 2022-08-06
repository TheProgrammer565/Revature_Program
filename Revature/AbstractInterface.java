interface IntTest
{
void callBack();
int ivar=10;
}

abstract class InterfaceTest implements IntTest
{

}

class InterfaceTest1 extends InterfaceTest
{
public void callBack()
{
System.out.print("In callBack method");
}

public static void main(String args[])
{
InterfaceTest1 i1=new InterfaceTest1();
i1.callBack();
}
}
