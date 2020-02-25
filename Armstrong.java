class Armstrong
{
public static void main(String ar[])
{
int num=153, orinum, rem;
int result=0;
orinum=num;
while(orinum!=0)
{
rem= orinum%10;
result+= (rem*rem*rem);
orinum/=10;
}
if(result == num)

System.out.println(num+" is an armstrong number");
else

System.out.println(num+" is not an armstrong number");
}
}