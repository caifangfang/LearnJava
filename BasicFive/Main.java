package BasicFive;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countPerfectNum();
	}
	
	public static void countPerfectNum(){
		Scanner in = new Scanner(System.in);
		int start = in.nextInt();
		int end = in.nextInt();
		String result = "";
//		if(start>=1 && end<1000 && end>start)
		if(start>=1 && end<10000)
		{
			for(int i=start;i<=end;i++){
				if(isPerfect(i))
				{
					if(result=="")
						result += i;
					else
						result += " " + i;
				}
			}
			
			
		}
		if(result=="")
		{
			result = "NIL";
		}
		
		System.out.println(result);
		
	}
	
	public static boolean isPerfect(int number){
		int sum = 0;
		boolean isPerfect = false;
		for(int i=1;i<number;i++){
			if(number%i==0)
			{
				sum += i;
			}
		}
		if(sum==number)
		{
			isPerfect = true;
		}
		return isPerfect;
	}
	
	public static void splitPrime(){
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		
		if(input>=2 && input<=100000){
			if(isPrime(input))
			{
				System.out.println(input+"="+input);
			}
			else
			{
				int result = input;
				String retstr = "";
				do{
					for(int i=2;i<=Math.sqrt(result);i++)
					{
						if(!isPrime(i))
						{
							continue;
						}
						
						if(result%i==0)
						{
							if(retstr=="")
							{
								retstr += i;
							}
							else
							{
								retstr += "x" + i;
							}
							result /=i;
							break;
						}else
						{
							continue;
						}
					}
				}while(!isPrime(result));
				
				retstr += "x" + result;
				System.out.println(input+"="+retstr);
			}
		}
	}
	
	public static boolean isPrime(int number){
		boolean isPrime = true;
		for(int i=2;i<=Math.sqrt(number);i++){
			if(number%i==0){
				isPrime = false;
				break;
			}
		}
		
		return isPrime;
	}

}
