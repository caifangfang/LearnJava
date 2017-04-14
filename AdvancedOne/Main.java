package AdvancedOne;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		analyzeGPS();
	}
	
	public static void countWordLen(){
		Scanner in = new Scanner(System.in);
		String sentence = in.nextLine();
		sentence = sentence.substring(0, sentence.length()-1).trim();
		String[] words = sentence.split("\\s+");
		String result = "";
		for(int i=0;i<words.length;i++){
			result += words[i].length() + " ";
		}
		
		System.out.println(result.trim());
	}
	
	public static void analyzeGPS(){
		Scanner in = new Scanner(System.in);
		final int SIZE = 100;
		String[] gprmcList = new String[SIZE];
		
		String sentence = in.nextLine();
		int count = 0;
		do{
			if(sentence.startsWith("$GPRMC"))
			{
				gprmcList[count] = sentence;
				count++;
			}
			sentence = in.nextLine();
		}while(!sentence.equals("END"));
		
		String outputTime="";
		for(int i=0;i<gprmcList.length;i++){
			if(gprmcList[i]==null)
			{
				break;
			}
			String tempStr = gprmcList[i];
			boolean isLocated = false;
			int startIndex = tempStr.indexOf("$");
			int endIndex = tempStr.indexOf("*");
			String tempMainStr = tempStr.substring(startIndex+1, endIndex);
			
			int actualFSC = Integer.parseInt(tempStr.substring(endIndex+1), 16);
			int expectFSC = tempMainStr.charAt(0)^tempMainStr.charAt(1);
			for(int j=2;j<tempMainStr.length();j++){
				expectFSC = expectFSC^tempMainStr.charAt(j);
			}
			
			String[] tempMainList = tempMainStr.split(",");
			if(tempMainList[2].equals("A"))
			{
				isLocated = true;
			}
			
			if(isLocated && (actualFSC==expectFSC))
			{
				outputTime =formatTime(tempMainList[1]);
			}
		}
		
		System.out.println(outputTime);
		
	}
	
	public static String formatTime(String time){
		
		int hour = Integer.parseInt(time.substring(0,2));
		hour += 8;
		if(hour>=24)
		{
			hour -= 24;
		}
		String min = time.substring(2,4);
		String sec = time.substring(4,6);
		String resultTime = String.format("%02d", hour) + ":" + min + ":" + sec;
		return resultTime;
	}

}
