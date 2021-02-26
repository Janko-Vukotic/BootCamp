package adrese;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Kredencijali {
	
	public static final String IME = "Janko Vukotic";
	public static final String EMAIL = "JankoVukotic@gmail.com";
	public static final String PASSWORD = "123";
	
//	public String ime = randomString() + randomString();
//	public String email = randomString() + "@" + randomString() + "." + randomString();
	

	public String randomString() {
		{

			// create a string of all characters
			String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

			// create random string builder
			StringBuilder sb = new StringBuilder();

			// create an object of Random class
			Random random = new Random();

			// specify length of random string
			int length = 7;

			for (int i = 0; i < length; i++) {

				// generate random index number
				int index = random.nextInt(alphabet.length());

				// get character specified by index
				// from the string
				char randomChar = alphabet.charAt(index);

				// append the character to string builder
				sb.append(randomChar);
			}

			String randomString = sb.toString();
			return randomString;
		}
	}
}
