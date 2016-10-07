package autocomplete;

import java.io.File;

import java.util.Collection;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) throws Exception {
		
		AutoCompleteAPI AutoCompleteAPI = new AutoCompleteAPI();
		
		
		 File usersFile = new File("../autocomplete/lib/test.txt");
		  Scanner inUsers = new Scanner(usersFile);
		  String delims = "[ ]";//each field in the file is separated(delimited) by a space.
		  while (inUsers.hasNextLine()) {
		    
			  // get user and rating from data source
		    String data = inUsers.nextLine();
		    // parse user details string
		      String[] arrayTerms = data.split(delims);
		    
		    // output user data to console.
		    if (arrayTerms.length == 2) {
		     
		      System.out.println("Weight: " + arrayTerms[0] + "    Name:  " + arrayTerms[1]);
		      AutoCompleteAPI.createTerm(Integer.parseInt(arrayTerms[0]), arrayTerms[1]);
		    }else
		    {
		      inUsers.close();
		      throw new Exception("Invalid member length: "+ arrayTerms.length);
		    }
		  }
		  inUsers.close();
		
		
		
		
		
		
		

	    Collection<Term> terms = AutoCompleteAPI.getTerms();
	    System.out.println(terms);
	    
	 
	  
	    
	   
	  }
	}
