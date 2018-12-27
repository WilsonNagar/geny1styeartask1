package winterproject;

import java.util.Random;

public class next1 {
	public int ran() {
		Random card = new Random();
		int num;
		num = card.nextInt(6);
		return (1+num);
		
	}
}