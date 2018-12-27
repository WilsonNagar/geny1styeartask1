package winterproject;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class main1 extends next1 {
	public static void main(String args[]) {
		
		//GAME : GUESS THE DICES
		//YOU WILL ENTER THE PROBABLE OUTCOME OF THE THROW OF DICES
		//IF YOUR INPUT MATCHES WITH THE COMPUTER 
		//YOU GAIN A POINT
		
		//SAMPLE INPUT = Enter the times the dice is rolled, you have to guess for each roll : 3
		//          	 Enter your no. of chances you get to answer : 1
		//               Enter your guess for each dice roll in a line : 652
		//          	 	BETTER LUCK NEXT TIME
		//				 	THE CORRECT ANSWER WAS : 236
		//				 	YOUR ANSWER WAS : 652
		
				Scanner input = new Scanner(System.in);
				next1 ob = new next1();
				
				StringBuilder st = new StringBuilder();
							
				String fn = JOptionPane.showInputDialog("Enter the times the dice is rolled, you have to guess for each roll ");
				int roll = Integer.parseInt(fn);
				
				for(int i=0;i<roll;i++) {
					st.append(ob.ran());
				}
				
				System.out.println("");
				String sn = JOptionPane.showInputDialog("Enter your no. of chances you get to answer:");
				int chances = Integer.parseInt(sn);
								
				for (int j = chances ;j>0;j--) {
					
					String str = JOptionPane.showInputDialog("Enter your guess for each dice roll in a line");
					
					int points = 0;
					
					if(str.matches(st.toString()) == true) {
						System.out.println("");
						JOptionPane.showMessageDialog(null, "WINNER WINNER CHICKEN DINNER !", "GAME", JOptionPane.PLAIN_MESSAGE);
						points++;
						break;
					}
					else {
						JOptionPane.showMessageDialog(null,"BETTER LUCK NEXT TIME !","GAME",JOptionPane.PLAIN_MESSAGE);
						System.out.println("THE CORRECT ANSWER WAS : "+ st);
						System.out.println("YOUR ANSWER WAS : "+ str);
						
					}
					System.out.println("YOUR TOTAL POINT : "+points);
					
					
				}
						
	}
}
