package Hello;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		signal();
 
	}
	
	public static void signal(){
		int input = 0;
		Scanner in = new Scanner(System.in);
		input = in.nextInt();
		if(input>=11 && input<=59 && input%10!=0){
			String readstr = "";
			String signalstr = "";
			switch(input/10){
			case 1:
				readstr = "Unreadable";
				break;
			case 2:
				readstr = "Barely readable, occasional words distinguishable";
				break;
			case 3:
				readstr = "Readable with considerable difficulty";
				break;
			case 4:
				readstr = "Readable with practically no difficulty";
				break;
			case 5:
				readstr = "Perfectly readable";
				break;				
			}
			switch(input%10){
			case 1:
				signalstr = "Faint signals, barely perceptible";
				break;
			case 2:
				signalstr = "Very weak signals";
				break;
			case 3:
				signalstr = "Weak signals";
				break;
			case 4:
				signalstr = "Fair signals";
				break;
			case 5:
				signalstr = "Fairly good signals";
				break;
			case 6:
				signalstr = "Good signals";
				break;
			case 7:
				signalstr = "Moderately strong signals";
				break;
			case 8:
				signalstr = "Strong signals";
				break;
			case 9:
				signalstr = "Extremely strong signals";
				break;				
			}
			
			System.out.println(signalstr + ", " + readstr.toLowerCase() + ".");
		}
	}
	
	public static void time(){
		int bjttime = 0;
		int utchour = 0;
		Scanner in = new Scanner(System.in);
		bjttime = in.nextInt();
		if(bjttime>=0 && bjttime<=2359 && bjttime/100<24 && bjttime%100<60){
			int bjhour = bjttime/100;
			int bjmin = bjttime%100;
			if(bjhour<8){
				utchour = bjhour-8+24;
			}else{
				utchour = bjhour-8;
			}
			if(utchour==0){
				System.out.println(bjmin);	
			}else{
				System.out.println(Integer.toString(utchour)+String.format("%02d", bjmin));
			}
			
		}
	}
	
	public static void temp(){
		int ftemp = 0;
		double ctemp = 0;
		Scanner in  = new Scanner(System.in);
		ftemp = in.nextInt();
		ctemp = (ftemp-32)*5/9.0;
		System.out.println((int)ctemp);
	}

}
