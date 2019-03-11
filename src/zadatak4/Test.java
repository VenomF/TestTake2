package zadatak4;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("Da li zelite:\n1) racunar ili\n2) laptop");
		Scanner input=new Scanner(System.in);
		byte choice=input.nextByte();
		Racunar racunar=null;
		
		if(choice==1) {
			System.out.println("Unesite RAM, HD kapacitet, brzinnu procesora, dijagonalu monitora, nabavnu cijenu.");
			racunar=new Racunar(input.nextInt(), input.nextInt(), input.nextInt(), input.nextDouble(), input.nextDouble());
		}else if(choice==2) {
			System.out.println("Unesite RAM, HD kapacitet, brzinnu procesora, dijagonalu monitora, trajanje baterije, nabavnu cijenu.");
			racunar=new Laptop(input.nextInt(), input.nextInt(), input.nextInt(), input.nextDouble(), input.nextDouble(), input.nextDouble());
		}else {
			System.out.println("GRESKA...");
		}
		input.close();
		
		System.out.println(racunar.toString());

	}

}
