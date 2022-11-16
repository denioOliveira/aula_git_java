package desafio_Bar;

import java.util.Locale;
import java.util.Scanner;

import util.Bill;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Bill bill = new Bill();
		
		System.out.print("Sexo: ");
		bill.gender = sc.next().toUpperCase().charAt(0);
		System.out.print("Quantidades de cervejas: ");
		bill.beer = sc.nextInt();
		System.out.print("Quantidades de refrigerantes: ");
		bill.softDrink = sc.nextInt();
		System.out.print("Quantidades de espetinhos: ");
		bill.barbecue = sc.nextInt();
		
		System.out.println();
		System.out.println("RELATORIO:");
		System.out.printf("Consumo = R$ %.2f%n", bill.feeding());
		if (bill.cover() == 0.0) {
			System.out.println("Insento de couvert");
		}
		else {
			System.out.printf("Couvert = R$ %.2f%n", bill.cover());
		}
		System.out.printf("Ingresso = R$ %.2f%n", bill.ticket());
		System.out.println();
		System.out.printf("Ingresso = R$ %.2f%n", bill.total());
		
		
		sc.close();

	}

}
