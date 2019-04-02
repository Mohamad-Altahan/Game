package hungMan;

import java.util.Scanner;

public class HungMan {

	static Scanner sc;

	public static void main(String arg[]) {

		try {
			//while loop for return the game before end game or not return
			while (true) {
			
				Transport t = new Transport();
				Colors c = new Colors();
				Fruits f = new Fruits();
				Computer co = new Computer();

				
				sc = new Scanner(System.in);
				
				
				System.out.println("Select one of the following options : ");
				System.out.println("1-transport.\n2-Colors.\n3-Fruits.\n4-Computers");

				//take integer from user
				int num = sc.nextInt();
			
				switch (num) {
				case 1:
                      
					t.config();
					break;

				case 2:
					c.config();
					break;

				case 3:
					f.config();
					break;

				case 4:
					co.config();
					break;
				default:
					System.out.println("hello");
					break;

				}
				
				//for know if user need follow or no
				System.out.println("\nAre You Complete ? \n" + "1-yes\n2-no \n" );
				int n = sc.nextInt();
				if(n==1)
				{
					continue;
				}
				else {
					break;
				}
				
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} finally {
			sc.close();

		}

	}

}
