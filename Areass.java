interface Figure
{
float pi=3.14;
float area();
}
class circle implements Figure
{
float r=2.5;
float area()
{
return(pi*r*r);
}
}
class rectangle implements Figure
{
int l=2;
int b=5;
float area()
{
return(l*b);
}
}
class triangle implements Figure
{
int b=5;
int h=7;
float area()
{
return(0.5*b*h);
}
}

class Areass
{
public static void main(String ar[])
{
circle c=new circle();
triangle t=new triangle();
rectangle r=new rectangle();
Figure f;  
f=c;    
System.out.println("Area of the circle is=" +c.area());
f=t;
System.out.println("Area of the triangle is=" +t.area());
f=r;
System.out.println("Area of the rectangle is=" +r.area());
}
}