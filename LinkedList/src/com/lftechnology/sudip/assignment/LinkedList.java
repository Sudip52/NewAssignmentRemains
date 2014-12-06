package com.lftechnology.sudip.assignment;

import java.util.*;
//import java.util.LinkedList; 
import java.util.Collections;
//import java.util.LinkedList;

/**
 * @author sudipshrestha
 * This class takes input in two linkedlist "one" and "two" and merges the elements of the two in one
 * and deletes the contents of the linkedlist two
 *
 */
public class LinkedList {

	/**
	 * @param args
	 * the main method
	 * the main method does all the manipulation needed to be done in the linked list 
	 */
	public static void main(String[] args) {
		int i= 0;
		List<String> one = new java.util.LinkedList<String>();
		List<String> two = new java.util.LinkedList<String>();
		String elements = new String();
		one.add("one");
		one.add("two");
		one.add("three");
		one.add("four");
		one.add("five");
		two.add("six");
		two.add("seven");
		two.add("eight");
		two.add("nine");
		two.add("ten");
		System.out.println("Elements of LinkedList one:" + one);
		System.out.println("Elements of LinkedList two:" + two);
		System.out.println("****Merging Elements of two to one****");
		while(two.size() != 0)
		{
			elements = two.get(i);
			//one.get(i);
			System.out.println("\n ******Merging And Deleting***** \n");
			one.add(elements);
			
			two.remove(i);
			//i ++;
			//System.out.println("");
			System.out.println("Elements in one after merging: " + one);
			System.out.println("Elements left in two: " + two);
			
		}
//		while(two.size() != 0)
//		{
//			one.addAll(two);
//			
//		}
		
		
	
	}

}
