package hungMan;

public class Transport implements Word {

	// counter for the error
	
	int a;
	int z;
	int count;
	
	// word on the file
	String word1;
	//word with replacement the chars star s
	String stars1;

	public Transport() {

		count = 0;
		//the value a has a length the cell in row
		a = excel.lengthCellInRow(0, 0);

		// the value z has a random number one of cell in row
		z = (int) (Math.random() * a);
        // get the word in excel file
		word1 = excel.getDataString(0, 0, z);
        // replace the char word to stars
		stars1 = new String(new char[word1.length()]).replace("\0", "*");

	}

	@Override
	//make sure from founded the char in word and replace the star
	public void hang(String inputU) {
		String newstars1 = "";
		for (int i = 0; i < word1.length(); i++) {
			if (word1.charAt(i) == inputU.charAt(0)) {
				newstars1 += inputU.charAt(0);
			} else if (stars1.charAt(i) != '*') {
				newstars1 += word1.charAt(i);
			} else {
				newstars1 += "*";
			}
		}

		if (stars1.equals(newstars1)) {
			count++;
			hangmanImage();
		} else {
			stars1 = newstars1;
		}
		if (stars1.equals(word1)) {
			System.out.println("Correct! You win! The word1 was ==>>  " + word1);
		}
	}

	@Override
	//with each error draw part of the gallows
	public void hangmanImage() {
		if (count == 1) {
			System.out.println("Wrong guess, try again");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("___|___");
			System.out.println();
		}
		if (count == 2) {
			System.out.println("Wrong guess, try again");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (count == 3) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   | ");
			System.out.println("___|___");
		}
		if (count == 4) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (count == 5) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (count == 6) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
		}
		if (count == 7) {
			System.out.println("GAME OVER!");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |          _|_");
			System.out.println("   |         / | \\");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
			System.out.println("GAME OVER! The word1 true was ==>> " + word1);
		}
	}

	//  take char from user and make sure from founded in word throw the method hang();
	public void config() {

		while (count < 7 && stars1.contains("*")) {
			System.out.println("Guess any letter in the word : ");
			System.out.println(stars1);
			String inputU = sc.next().toLowerCase();
			hang(inputU);
		}
		

	}

}
