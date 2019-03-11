package zadatak2;

import java.util.Scanner;

public class Kraj {

	public static void main(String[] args) {
		String recenica="";
		Scanner input=new Scanner(System.in);
		String word;
		
		do {
			System.out.print("Unesite rijec:");
			word=input.next();
			recenica+=word;
			recenica+=" ";
		}while(!"kraj".equals(word));
		
		input.close();
		recenica=recenica.substring(0, recenica.lastIndexOf(' '));
		recenica=recenica.substring(0, recenica.lastIndexOf(' '));
		System.out.println(recenica);

	}

}
