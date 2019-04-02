package hungMan;

import java.util.Scanner;

import lib.ExcelDataConfig;

public interface Word {

	ExcelDataConfig excel = new ExcelDataConfig("excel1.xls");
	Scanner sc = new Scanner(System.in);

	public void hang(String inputU);

	public void hangmanImage();

	public void config();

}
