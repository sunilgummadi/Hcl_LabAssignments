package com.main;

import java.util.Scanner;

import com.pojo.MembershipCard;
import com.pojo.PaybackCard;

public class Main {

	public static void main(String[] args) {
		System.out.println("1.Payback Card\n2.Membership Card\nEnter your choice:");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		scanner.nextLine();
		switch (choice) {
		case 1:
			System.out.println("Enter Card Details:");
			String data = scanner.nextLine();
			String[] arrayOfString = data.split("\\|");
			System.out.println("Enter points in card :");
			int pointsEarned = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter Amount :");
			double totalAmount = scanner.nextDouble();
			scanner.nextLine();
			PaybackCard card = new PaybackCard(arrayOfString[0], arrayOfString[1], arrayOfString[2], pointsEarned,
					totalAmount);
			System.out.println(card.getHolderName() + "'s Payback Card Details:");

			System.out.println("Card Number :" + card.getCardNumber());
			System.out.println("Points Earned :" + card.getPointsEarned());
			System.out.println("Total Amount :" + card.getTotalAmount());
			break;
		case 2:
			System.out.println("Enter Card Details:");
			String cardDetails = scanner.nextLine();
			String[] details = cardDetails.split("\\|");
			System.out.println("Enter rating :");
			int rating = scanner.nextInt();
			scanner.nextLine();
			MembershipCard card2 = new MembershipCard(details[0], details[1], details[2], rating);
			System.out.println(card2.getHolderName() + "'s Membership Card Details :");
			System.out.println("Card Number :" + card2.getCardNumber());
			System.out.println("Rating :" + card2.getRating());
			break;
		default:
			System.out.println("Please enter valid input");
		}
		scanner.close();
		System.gc();
	}

}
