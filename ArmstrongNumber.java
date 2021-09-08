package week1.day1;

public class ArmstrongNumber 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Change the input value accordingly i.e,153,145
int input=111;
int temp;
temp=input;
int result=0;

while(temp!=0)
{
	int rem=temp%10;
	result=result+(rem*rem*rem);
	temp=temp/10;
}
if (result==input)
{
	System.out.println("The given number "+input+ " is Amstrong number");
}
else {
	System.out.println("The given number "+input+ " is not Amstrong number");
}

}
}