package autocomplete;


import java.io.File;
import java.util.Collection;







public class Main {

	public static final File usersFile = new File("../autocomplete/lib/test.txt");
		
		

	
	
	public static void main(String[] args) throws Exception {
		
		 new QuickAutoComplete(usersFile);
		

		 new BruteAutoComplete(usersFile);
		  
		
		
		
		
		    Collection<Term> terms = QuickAutoComplete.getTerms();
		    System.out.println(terms);
	    
	   
	    
	  
	}

	
	   
	  }