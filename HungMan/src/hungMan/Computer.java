package hungMan;

public class Computer implements Word {

	int count;
	String word4;
	String stars4;
	int a;
	int z;

	public Computer() {

		count = 0;
		a = excel.lengthCellInRow(0, 3);

		z = (int) (Math.random() * a);

		word4 = excel.getDataString(0, 3, z);

		stars4 = new String(new char[word4.length()]).replace("\0", "*");

	}

	@Override
	public void hang(String inputU) {
		String newstars4 = "";
		for (int i = 0; i < word4.length(); i++) {
			if (word4.charAt(i) == inputU.charAt(0)) {
				newstars4 += inputU.charAt(0);
			} else if (stars4.charAt(i) != '*') {
				newstars4 += word4.charAt(i);
			} else {
				newstars4 += "*";
			}
		}

		if (stars4.equals(newstars4)) {
			count++;
			hangmanImage();
		} else {
			stars4 = newstars4;
		}
		if (stars4.equals(word4)) {
			System.out.println("Correct! You win! The word4 was ==>>  " + word4);
		}
	}

	@Override
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
			System.out.println("GAME OVER! The word4 true was ==>> " + word4);
		}
	}

	public void config() {

		while (count < 7 && stars4.contains("*")) {
			System.out.println("Guess any letter in the word : ");
			System.out.println(stars4);
			String inputU = sc.next();
			hang(inputU);
		}
		
	}

}
