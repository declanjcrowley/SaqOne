package ie.cit.saqone.domain;

import ie.cit.saqone.domain.Person;
import ie.cit.saqone.domain.Song;
import ie.cit.saqone.interfaces.Singer;

public class SingerImpl extends Person implements Singer {

	public SingerImpl(String firstname, String lastname, int age) {
		super(firstname, lastname, age);
	}

	@Override
	public void perform(Song song) {
		// TODO Auto-generated method stub

	}
	
}
