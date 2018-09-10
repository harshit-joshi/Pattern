import java.util.Scanner; 
public class PatternMain 
{
	public static void main(String[] args)
	{
		System.out.println("Enter Odd no between 1-17:");
		Scanner input = new Scanner(System.in);
		int size= input.nextInt();
		if(size>17)
		{
			System.out.println("Your wish the shape will not be perfect diamond");
		}
		if(size%2 ==0)
		{
			System.out.println("Thats not  odd,No problem we have added one");
			size= size+1;
		}
		int noOfColumns=1;
		int start=0;
		int noOfSpace=size/2;
		
		for(int row=1;row<=size;row++)
		{
			for(int column=1;column<=noOfSpace;column++)
			{
				System.out.print(" ");
			}
			if(row<size/2+1)
			{
				start=row;
				noOfSpace--;
			}
			else
			{
				start=(size+1)-row;
				noOfSpace++;
			}
		for(int column=1;column<=noOfColumns;column++)
		{
			
		int middleColumn=noOfColumns/2+1;
		System.out.print(start);
		if(column<middleColumn)
		{
			start--;
		}
		else
		{
			start++;
		}
		}
		System.out.println();
		if(row<size/2+1)
		{
		noOfColumns=noOfColumns+2;
		}
		else
		{
			noOfColumns=noOfColumns-2;
	
		}
		}
		
	}
}
