package AdvancedOne;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countWordLen();
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

}
