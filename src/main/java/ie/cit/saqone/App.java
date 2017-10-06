package ie.cit.saqone;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ie.cit.saqone.domain.Song;
import ie.cit.saqone.domain.SongwriterImpl;
import ie.cit.saqone.domain.Venue;
import ie.cit.saqone.interfaces.*;

public class App {

	private static ApplicationContext context;

	public static void main (String args[]){
		
		context=new ClassPathXmlApplicationContext("configuration.xml");
		
		SongwriterImpl songwriter=(SongwriterImpl)context.getBean("marywriter");
		System.out.println("The songwriters name is: "+ songwriter.getFirstname() + " Song name is: " + songwriter.getSong().getName()+" The lyrics are: " + songwriter.getSong().getLyrics());
				
		SongwriterImpl setterDISongwriter =(SongwriterImpl)context.getBean("marywriter");
		System.out.println("Songwriter name is: "+ setterDISongwriter.getFirstname());
		System.out.println("Songwriter song details are: Song name: "+setterDISongwriter.getSong().getName()+
		        		" Song lyrics are: "+setterDISongwriter.getSong().getLyrics());
		
		Venue v = (Venue)context.getBean("O2");
		System.out.println("Venue is: " + v.toString()); 
		
    }
}