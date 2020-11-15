/**
 * 
 */
package com.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author sunil
 * 
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String name;
		String team;
		String matches;
		try {
			FileWriter fileWriter = new FileWriter("player.csv");
			fileWriter.append("Player Name");
			fileWriter.append(",");//since csv is comma separated values we need to append "," after each value
			fileWriter.append("Player Team");
			fileWriter.append(",");
			fileWriter.append("Matches Played");
			fileWriter.append("\n");
			System.out.println("Entet name of the player :");
			name = bufferedReader.readLine();
			System.out.println("Enter the team name :");
			team = bufferedReader.readLine();
			System.out.println("Enter numbre of matches played :");
			matches = bufferedReader.readLine();
			fileWriter.append(name);
			fileWriter.append(",");
			fileWriter.append(team);
			fileWriter.append(",");
			fileWriter.append(matches);
			fileWriter.append("\n");
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			BufferedReader bufferedReader2 = new BufferedReader(new FileReader("player.csv"));
			String line = null;
			while ((line = bufferedReader2.readLine()) != null) {
				String[] details = line.split(",");
				System.out.println(details[0] + "   " + details[1] + "   " + details[2]);
			}
			bufferedReader2.close();
		} catch (FileNotFoundException e) {
			System.err.println(e);
		} catch (IOException e) {
			System.err.println(e);
		}
	}

}
