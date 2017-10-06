package ie.cit.saqone.domain;

public class Song {
	private String name;
	private String lyrics;
	
	public Song(String name, String lyrics){
		this.name=name;
		this.lyrics=lyrics;
		//System.out.println("Song() " + name + " : " + lyrics);
	}
	
	public Song(){
		//System.out.println("Song() We are in blank constructor");
	}
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getLyrics() {
		return lyrics;
	}
	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}
}
