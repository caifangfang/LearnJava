package AdvancedThree;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		HashMap<String, Integer> cities = new HashMap<String, Integer>();
		HashMap<Integer, HashMap> distance = new HashMap<Integer, HashMap>();
//		HashMap<Integer, Integer> distancerow = new HashMap<Integer, Integer>();
		
		int count = 0;
		String city = in.next();
		while(!city.equals("###")){
			cities.put(city, count);
			count++;
			city = in.next();
		}
		
		for(int i=0;i<cities.size();i++){
			HashMap<Integer, Integer> distancerow = new HashMap<Integer, Integer>();
			for(int j=0;j<cities.size();j++){
				distancerow.put(j, in.nextInt());
			}
			distance.put(i, distancerow);
		}
		
		String start = in.next();
		String end = in.next();
		int startIndex = cities.get(start);
		int endIndex = cities.get(end);
		System.out.println(distance.get(startIndex).get(endIndex));
	}

}
