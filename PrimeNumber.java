package week1.day1;

public class PrimeNumber 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
int input=7;
boolean flag=false;
if (input==0 ||input==1)
{
	System.out.println("Not a Prime Number");
}
else 
{
for (int i = 2; i <=input/2; i++)
{
	int result=input%i;
	if(result==0)
	{
	//System.out.println(result);
	//Why the above result value is not getting printed uncomment the above and run
	flag=true;
	}
}
if(flag==false)
{
	System.out.println("Prime Number");
}
else
{
	System.out.println("Not a Prime Number");
}
}
	}
}