abstract class A
{
abstract void callme();

void callmetoo()
{
System.out.println("B's implementation of callme");
}
}

class Abstarct
{
public static void main(String ar[])
{
B b=new B();
b.callme();
b.callmetoo();
}
}