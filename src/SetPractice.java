/*
 * David Casarrubias-Mena
 * Joshua Cheeseman
 * COSC 201
 * Lab 6
 * October 30 , 2015
 * In this program create a Hashset and Tree set and add the same elements into both lists. 
 * Then we print out all the elements 
 * 
 */

import java.util.HashSet;
import java.util.TreeSet;


public class SetPractice {
	public static void main(String [] args){
		HashSet<Integer> myHash = new HashSet<Integer>(); // create a HashSet 
		TreeSet<Integer> myTree = new TreeSet<Integer>(); // create a TreeSet
		
		myHash.add(1);  // adds 1 to HashSet myHash
		myHash.add(10); // adds 10 to HashSet myHash
		myHash.add(32); // adds 32 to HashSet myHash
		myHash.add(12); // adds 12 to HashSet myHash
		myHash.add(5);  // adds 5 to HashSet myHash
		myHash.add(4);  // adds 4 to HashSet myHash
		myHash.add(12); // adds 12 to HashSet myHash
		myHash.add(33); // adds 33 to HashSet myHash
		myHash.add(19);// adds 19 to HashSet myHash
		myHash.add(10); // adds 10 to HashSet myHash
		myHash.add(22); // adds 22 to HashSet myHash
		myHash.add(4); // adds 4 to HashSet myHash
		myHash.add(60); // adds 60 to HashSet myHash
		myHash.add(89); // adds 89 to HashSet myHash
		
		myTree.add(1);  // adds 1 to treeSet myTree
		myTree.add(10); // adds 10 to treeSet myTree
		myTree.add(32); // adds 32 to treeSet myTree
		myTree.add(12); // adds 12 to treeSet myTree
		myTree.add(5); // adds 5 to treeSet myTree
		myTree.add(4); // adds 4 to treeSet myTree
		myTree.add(12); // adds 12 to treeSet myTree
		myTree.add(33); // adds 33 to treeSet myTree
		myTree.add(19); // adds 19 to treeSet myTree
		myTree.add(10); // adds 10 to treeSet myTree
		myTree.add(22); // adds 22 to treeSet myTree
		myTree.add(4); // adds 4 to treeSet myTree
		myTree.add(60);// adds 60 to treeSet myTree
		myTree.add(89); // adds 89 to treeSet myTree 
		
		
		System.out.println(myHash); // prints out all elements in myHash HashSet
		System.out.println(myTree.descendingSet()); // prints out all elements in myTree TreeSet in reverse order using method descendingSet
		

	}
}
