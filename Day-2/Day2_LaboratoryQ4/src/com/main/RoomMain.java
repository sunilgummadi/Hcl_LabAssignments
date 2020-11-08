package com.main;

import java.util.Scanner;
import com.pojo.Room;

public class RoomMain {

	public static void main(String[] args) {
		System.out.println("Enter the room details in the oder roomNumber,roomTyype,roomArea ans if AC available :");
		Scanner scanner = new Scanner(System.in);
		int roomNo = scanner.nextInt();
		scanner.nextLine();
		String roomType = scanner.nextLine();
		float roomArea = scanner.nextFloat();
		boolean acMachine = scanner.nextBoolean();
		Room room = new Room(roomNo, roomType, roomArea, acMachine);
		System.out.println(room);
		scanner.close();
		room = null;
	}

}
