package ie.cit.saqone.domain;

import ie.cit.saqone.interfaces.Songwriter;

public class SongwriterImpl extends Person implements Songwriter {

	private Song song;
	
	public SongwriterImpl() {
		super();
	}
	
	public SongwriterImpl(String firstname, String lastname, int age, Song song) {
		super(firstname, lastname, age);
		this.setSong(song);
	}

	@Override
	public void compose(Song song) {
		System.out.println("Composer " + firstname + " " + lastname + " composed a song called " +song.getName() +". This song has the following lyrics "+ song.getLyrics());
	}

	public Song getSong() {
		return song;
	}

	public void setSong(Song song) {
		this.song = song;
	}

}
