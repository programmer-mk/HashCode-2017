package com.hashcode.google;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Solution {
	public static void main(String[] args) {
		double score = 0;
		String[] files = {"me_at_the_zoo.in","trending_today.in","videos_worth_spreading.in", "kittens.in"};
		for(String file: files) {
			Interpreter interpreter = new Interpreter(file);
			interpreter.solve();
			System.out.println();
			System.out.println("File Score" + " (" + file + " ): " + String.valueOf(interpreter.score));
			
			score += interpreter.score;
			// Creating solution files
			try { 
				BufferedWriter out = new BufferedWriter(new FileWriter("Solutions/sol_"+file));
				String solution = interpreter.getSolution();
				out.write(solution);
				out.close();
			}catch(IOException e) {
				System.out.println("Exception");
			}
		}

	}

}
