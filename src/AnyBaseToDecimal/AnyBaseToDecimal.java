package AnyBaseToDecimal;
import java.util.*;

public class AnyBaseToDecimal {
	
	public static int decimal(int number,int index)
	{
		int start =0;
		int result =0;
		while(number > 0)
		{
			result += (number%10)*Math.pow(index,start);
			start++;
			number = number/10;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int index = scan.nextInt();
		int result = decimal(number,index);
		System.out.println(result);
		

	}

}
