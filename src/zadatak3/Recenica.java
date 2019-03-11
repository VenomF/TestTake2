package zadatak3;

import java.util.Scanner;

public class Recenica {

	public static void main(String[] args) {
		System.out.println("Unesite neku recenicu");
		Scanner input=new Scanner(System.in);
		String statement=input.nextLine();
		input.close();
		String lastWord = statement.substring(statement.lastIndexOf(" "));
		statement=statement.replaceFirst(lastWord, "");
		lastWord = statement.substring(statement.lastIndexOf(" ")+1);
		System.out.println(lastWord);

	}

}
