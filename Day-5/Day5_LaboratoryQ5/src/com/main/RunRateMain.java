package com.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RunRateMain {

	public static void main(String[] args) throws Exception {
		
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		try {
			System.out.println("Enter total runs scored :");
			int runs = Integer.parseInt(bufferedReader.readLine());
			System.out.println("Enter total overs faced :");
			int overs = Integer.parseInt(bufferedReader.readLine());
			if(overs == 0)
				throw new Exception();
			
			double runrate = (double)runs/overs;
			System.out.print("Current Run Rate :");
			System.out.printf("%.2f",runrate);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
