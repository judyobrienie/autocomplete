package autocomplete;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BruteAutoComplete implements AutoComplete {

	List<Integer> weight = new ArrayList<>();
	List<String> term = new ArrayList<>();
	
	

	public  BruteAutoComplete(File usersFile) throws Exception {
		
		
		  Scanner inUsers = new Scanner(usersFile);
		  String delims = "[ ]";//each field in the file is separated(delimited) by a space.
		  while (inUsers.hasNextLine()) {
		    // get user and rating from data source
		    String userDetails = inUsers.nextLine();
		    // parse user details string
		    String[] userTokens = userDetails.split(delims);
		    Term list = new Term(Integer.parseInt(userTokens[0]), userTokens[1]);
		    weight = new ArrayList<Integer>();
		    term = new ArrayList<String>();
		    // output user data to console.
		    if (userTokens.length == 2) {
		    	weight.add(Integer.parseInt(userTokens[0]));
		    	term.add(userTokens[1]);
		    	
		      System.out.println("BruteForceId: " + weight + ",First Name:" + term);
		      System.out.println(list);
		      
		    }else
		    {
		      inUsers.close();
		      throw new Exception("Invalid member length: "+userTokens.length);
		    }
		  }
		  inUsers.close();
		
		
	}

	 public Term createTerm(int weight, String term) 
	  {
	    Term terms = new Term (weight, term);
	    
	    return terms;
	    
	  }
		
	
	
	
	
	
	
	
	@Override
	public double weightOf(String term) {
		

		return 0;
	}


	
		

	@Override
	public Iterable<String> matches(String prefix, int k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String bestMatch(String prefix) {
		// TODO Auto-generated method stub
		return null;
	}

}
