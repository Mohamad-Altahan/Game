package hungMan;

public class Colors implements Word {

	int count;
	String word2;
	String stars2;
	int a;
	int z;

	public Colors() {

		count = 0;
		a = excel.lengthCellInRow(0, 1);

		z = (int) (Math.random() * a);

		word2 = excel.getDataString(0, 1, z);

		stars2 = new String(new char[word2.length()]).replace("\0", "*");

	}

	@Override
	public void hang(String inputU) {
		String newstars2 = "";
		for (int i = 0; i < word2.length(); i++) {
			if (word2.charAt(i) == inputU.charAt(0)) {
				newstars2 += inputU.charAt(0);
			} else if (stars2.charAt(i) != '*') {
				newstars2 += word2.charAt(i);
			} else {
				newstars2 += "*";
			}
		}

		if (stars2.equals(newstars2)) {
			count++;
			hangmanImage();
		} else {
			stars2 = newstars2;
		}
		if (stars2.equals(word2)) {
			System.out.println("Correct! You win! The word2 was ==>>  " + word2);
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
			System.out.println("GAME OVER! The word2 true was ==>> " + word2);
		}
	}

	public void config() {

		while (count < 7 && stars2.contains("*")) {
			System.out.println("Guess any letter in the word : ");
			System.out.println(stars2);
			String inputU = sc.next();
			hang(inputU);
		}
		
	}

}
