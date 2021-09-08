package week1.day1;

public class FibonacciSeries 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
int firstNum=0;
int secNum=1;
int range=10;
System.out.println("The FibonacciSeries:");
System.out.println(firstNum);
//System.out.println(secNum);
for(int i=1;i<range;i++)
{
	int sum=firstNum+secNum;
	System.out.println(secNum);
	firstNum=secNum;
	secNum=sum;
	
}
	}
}
