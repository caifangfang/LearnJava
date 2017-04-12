package BasicFour;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiStruct();
	}
	
	public static void multiStruct(){
		Scanner in = new Scanner(System.in);
		final int SIZE = 101;
		//read struct one
		int[] structOne = new int[SIZE];
		int input = in.nextInt();
		while(input>=0){
			structOne[input] = in.nextInt();
			if(input==0){
				break;
			}
			else{
				input = in.nextInt();
			}
			
		}
		
		//read struct two
		int[] structTwo = new int[SIZE];
		input = in.nextInt();
		while(input>=0){
			structTwo[input] = in.nextInt();
			if(input==0){
				break;
			}
			else{
				input = in.nextInt();
			}
		}
		
		//plus struct
		for(int i=0;i<SIZE;i++){
			structOne[i] += structTwo[i];
		}
		
		//print result
		String result = "";
		for(int i=SIZE-1;i>=0;i--){
			if(structOne[i]!=0){
				if(result!="" && structOne[i]>0){
					result += "+";
				}
				if(i==0){
					result += structOne[0];
				}
				else if(i==1){
					if(structOne[1]==1)
						result += "x";
					else if(structOne[1]==-1)
						result += "-x";
					else
						result += structOne[1]+"x";
				}
				else{
					if(structOne[i]==1)
						result += "x" + i;
					else if(structOne[i]==-1)
						result += "-x" + i;
					else
						result += structOne[i]+"x"+i;
				}
			}
		}
		if(result=="")
			result = "0";
		System.out.println(result);
	}
	
	public static void tictoc(){
		Scanner in = new Scanner(System.in);
		final int SIZE = in.nextInt();
		int[][] board = new int[SIZE][SIZE];
		boolean gotResult = false;
		int numOfX = 0;
		int numOfO = 0;
		
		//read array
		for(int i=0;i<SIZE;i++){
			for(int j=0;j<SIZE;j++){
				board[i][j] = in.nextInt();
			}
		}
		
		//check row
		for(int i=0;i<SIZE;i++){
			numOfX = 0;
			numOfO = 0;
			for(int j=0;j<SIZE;j++){
				if(board[i][j]==1){
					numOfX++;
				}
				else{
					numOfO++;
				}
			}
			if(numOfX==SIZE||numOfO==SIZE){
				gotResult = true;
				break;
			}
		}
		
		//check column
		if(!gotResult){
			for(int i=0;i<SIZE;i++){
				numOfX = 0;
				numOfO = 0;
				for(int j=0;j<SIZE;j++){
					if(board[j][i]==1){
						numOfX++;
					}
					else{
						numOfO++;
					}
				}
				if(numOfX==SIZE||numOfO==SIZE){
					gotResult = true;
					break;
				}
			}
		}
		
		//check 对角线
		if(!gotResult){

			numOfX = 0;
			numOfO = 0;
			for(int i=0;i<SIZE;i++){
				
				if(board[i][i]==1){
					numOfX++;
				}
				else{
					numOfO++;
				}
			}
				
			if(numOfX==SIZE||numOfO==SIZE){
				gotResult = true;
			}
		}
		
		//check 反对角线
		if(!gotResult){
			numOfX = 0;
			numOfO = 0;
			for(int i=0;i<SIZE;i++){
				
				if(board[i][SIZE-i-1]==1){
					numOfX++;
				}
				else{
					numOfO++;
				}
			}
				
			if(numOfX==SIZE||numOfO==SIZE){
				gotResult = true;
			}
		}
		
		if(gotResult){
			if(numOfX==SIZE){
				System.out.println("X");
			}else{
				System.out.println("O");
			}
		}else{
			System.out.println("NIL");
		}
	}

}
