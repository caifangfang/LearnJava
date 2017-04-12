package BasicThree;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readNum();
 
	}
	
	public static void readNum(){
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String readstr = "";
		if(num<0){
			readstr = "fu ";
			num *= -1;
		}
		int mode = 1;
		int t = num;
		while(t>9){
			mode *= 10;
			t /= 10;
		}
		
		do{
			switch(num/mode){
			case 0:
				readstr += "ling";
				break;
			case 1:
				readstr += "yi";
				break;
			case 2:
				readstr += "er";
				break;
			case 3:
				readstr += "san";
				break;
			case 4:
				readstr += "si";
				break;
			case 5:
				readstr += "wu";
				break;
			case 6:
				readstr += "liu";
				break;
			case 7:
				readstr += "qi";
				break;
			case 8:
				readstr += "ba";
				break;
			case 9:
				readstr += "jiu";
				break;
			
			}
			num %= mode;
			mode /= 10;
			if(mode>0)
				readstr += " ";
		}while(mode>0);
		
		System.out.println(readstr);
	}
	
	public static void primeSum(){
		Scanner in = new Scanner(System.in);
		int start = in.nextInt();
		int end = in.nextInt();
		int count = 1;
		int sum =0;
		int value = 2;
		while(count<=end){
			int isPrime = 0;
			for(int i=2;i<value;i++){
				if(value%i==0){
					isPrime = 1;
					break;
				}
			}
			if(isPrime==0 ){
				if(count>=start){
					sum+=value;
				}
				count++;
			}

			value++;
		}
		System.out.println(sum);
	}
	
	public static void specialSum(){
		Scanner in = new Scanner(System.in);
		int inNum = in.nextInt();
		if(inNum>=0 && inNum<=1000000){
			int sum = 0;
			int index = 0;
			int left = inNum;
			int right = 0;
			do{
				right = left%10;
				left = left/10;
				index++;
				if((right%2==0 && index%2==0)||(right%2!=0 && index%2!=0)){
					sum += Math.pow(2.0, index-1);
				}
			}while(left>0);
			
			System.out.println(sum);
		}
	}
	
	public static void countNum(){
		Scanner in = new Scanner(System.in);
		int oddcnt = 0;
		int evencnt = 0;
		int input = in.nextInt();
		while(input!=-1){
			if(input%2==0){
				evencnt++;
			}else{
				oddcnt++;
			}
			input = in.nextInt();
		}
			
		System.out.println(oddcnt+" "+evencnt);
	}

}
