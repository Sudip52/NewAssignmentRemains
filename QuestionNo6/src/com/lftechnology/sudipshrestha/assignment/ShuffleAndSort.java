package com.lftechnology.sudipshrestha.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author sudipshrestha
 * This class hold the integer arraylist shuffle top six and prints sorted output
 *
 */
public class ShuffleAndSort {

	/**
	 * @param args
	 * The main method is responsible for inputting the top six shuffled integers using sublist method of arraylis
	 * and sort them out and prints
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> integers = new ArrayList<Integer>(49);
		for(int i = 1; i<= 49; i++)
			integers.add(i);
		//System.out.println("Arraylist: " + integers);
		Collections.shuffle(integers);
		List<Integer> topSixInteger= new ArrayList<>(integers.subList(0, 6));
		System.out.println("Shuffeled top six integers are: " + topSixInteger);
		Collections.sort(topSixInteger);
		System.out.println("Sorted top six integers are: " + topSixInteger);
	}

}
