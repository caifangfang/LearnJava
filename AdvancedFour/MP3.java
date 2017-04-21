package AdvancedFour;

public class MP3 extends Item {
	private String artist;
	
	public MP3(String title, String artist,int playingTime, String comment) {
		super(title,playingTime,false,comment);
		this.artist = artist;
	}

	public static void main(String[] args) {
		MP3 mp3 = new MP3("I'm Yours","JasonMraz",4,"...");
		mp3.print();
	}

	@Override
	public void print() {
		System.out.print("MP3:");
		super.print();
		System.out.print("-"+artist);
	}

}
