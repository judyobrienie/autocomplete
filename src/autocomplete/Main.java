package autocomplete;


import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;







public class Main {
	

	public static final File usersFile = new File("../autocomplete/lib/test.txt");
	private static Scanner input = new Scanner(System.in);
	
	
	public static void main(String[] args) throws Exception {
		
		

		 new QuickAutoComplete(usersFile);
		

	 BruteAutoComplete bruteAutoComplete = new BruteAutoComplete(usersFile);
		  List<String> listOfTerms = bruteAutoComplete.getListOfTerms();
		  List<Integer> listOfWeights = bruteAutoComplete.getListOfWeights();
		  
		  System.out.println(listOfWeights);
	      System.out.println(listOfTerms);
		  
		    Collection<Term> terms = QuickAutoComplete.getTerms();
		    System.out.println(terms);
	    
	   
		    System.out.println("type word");
		    String s = input.nextLine();
		
		System.out.println(bruteAutoComplete.weightOf(s));
		
	  
	}





	
	   
	  }