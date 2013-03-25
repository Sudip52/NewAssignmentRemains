package com.lftechnology.assignment.questionno4;

import java.io.BufferedInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;



/**
 * @author sudipshrestha
 * The Shuffle Class is responsible for generating a randomly inputed value as output as it 
 * uses list(Arrays.asList) and collections for it
 * In this class there is also another method that uses Arrays.asList which is not actually a List Implementation but using the suffle method
 *  of collections class we can generate random numbers
 */
public class Shuffle {
	public static void main(String[] args) {
	List<String> wordsArray = Arrays.asList(args);
	Collections.shuffle(wordsArray);
	System.out.println("Randomly Generated words Are: " + wordsArray);

	System.out.println("******Next Method*********");
	
	//Another Method for generating random no not as efficient as above is 
	//shown below
	
	System.out.println("Do you want to proceed for the next question: (Y/N)");
	Scanner sc = new Scanner(System.in);
	if(sc.next().charAt(0) == 'y') 
			{
		List<String > words = new ArrayList<String>();
		for (String input : args)
		{
			words.add(input);
			
		}
		Collections.shuffle(wordsArray, new Random());
		System.out.println("New Randomly Generated Words Are: " + words);
		
	}
	
	}
}
