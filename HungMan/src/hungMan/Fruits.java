package hungMan;

public class Fruits implements Word {

	int count ;
	String word3;
	String stars3;
	int a;
	int z;

	public Fruits() {
		count = 0;

		a = excel.lengthCellInRow(0, 2);

		z = (int) (Math.random() * a);

		word3 = excel.getDataString(0, 2, z);

		stars3 = new String(new char[word3.length()]).replace("\0", "*");

	}

	@Override
	public void hang(String inputU) {
		String newstars3 = "";
		for (int i = 0; i < word3.length(); i++) {
			if (word3.charAt(i) == inputU.charAt(0)) {
				newstars3 += inputU.charAt(0);
			} else if (stars3.charAt(i) != '*') {
				newstars3 += word3.charAt(i);
			} else {
				newstars3 += "*";
			}
		}

		if (stars3.equals(newstars3)) {
			count++;
			hangmanImage();
		} else {
			stars3 = newstars3;
		}
		if (stars3.equals(word3)) {
			System.out.println("Correct! You win! The word3 was ==>>  " + word3);
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
			System.out.println("GAME OVER! The word3 true was ==>> " + word3);
		}
	}

	public void config() {
		while (count < 7 && stars3.contains("*")) {
			System.out.println("Guess any letter in the word : ");
			System.out.println(stars3);
			String inputU = sc.next();
			hang(inputU);
		}
		

	}

}
