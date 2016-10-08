package autocomplete;


import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;






public class Main {

	public static final File usersFile = new File("../autocomplete/lib/test.txt");
		
		

	
	
	public static void main(String[] args) throws Exception {
		
		QuickAutoComplete AutoComplete = new QuickAutoComplete(usersFile);
		

		 AutoComplete BruteAutoComplete = new BruteAutoComplete(usersFile);
		  
		
		
		
		
		    Collection<Term> terms = QuickAutoComplete.getTerms();
		    System.out.println(terms);
	    
	   
	    
	  
	}

	
	   
	  }