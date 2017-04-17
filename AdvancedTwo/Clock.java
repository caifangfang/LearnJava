package AdvancedTwo;

public class Clock {
	private Display hour;
	private Display minute;
	private Display second;
	
	public Clock(int hour,int minute, int second){
		this.hour = new Display(24,hour);
		this.minute = new Display(60,minute);
		this.second = new Display(60,second);
	}
	
	public void tick(){
		second.increase();
		if(second.getValue()==0){
			minute.increase();
			if(minute.getValue()==0){
				hour.increase();
			}
		}
	}
	
	public String toString(){
		return String.format("%02d:%02d:%02d", hour.getValue(),minute.getValue(),second.getValue());
	}
	
	public void start(){
		while(true){
			minute.increase();
			if(minute.getValue()==0){
				hour.increase();
			}
			System.out.printf("%02d:%02d\n",hour.getValue(),minute.getValue());
		}
	}

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		Clock clock = new Clock(in.nextInt(),in.nextInt(),in.nextInt());
		clock.tick();
		System.out.println(clock);
		in.close();
	}

}
