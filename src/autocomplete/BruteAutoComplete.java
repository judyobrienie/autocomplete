package autocomplete;


import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BruteAutoComplete implements AutoComplete {
	
	List<Integer> listOfWeights = new ArrayList<>();
	List<String> listOfTerms = new ArrayList<>();

	
	
	public  BruteAutoComplete(File usersFile) throws Exception {
		
		
		  Scanner inUsers = new Scanner(usersFile);
		  String delims = "[ ]";//each field in the file is separated(delimited) by a space.
		  while (inUsers.hasNextLine()) {
		    // get user and rating from data source
		    String userDetails = inUsers.nextLine();
		    
		    // parse user details string
		    String[] userTokens = userDetails.split(delims);
		    //create Term
		    Term list = new Term(Integer.parseInt(userTokens[0]), userTokens[1]);
		    //create an array of type Term
		    
		    // output user data to console.
		    if (userTokens.length == 2) {
		    	
		    	listOfWeights.add(list.getWeight());
		    	listOfTerms.add(list.getTerm());
		      
		      
		    }else
		    {
		      inUsers.close();
		      throw new Exception("Invalid member length: "+userTokens.length);
		    }
		  }
		  inUsers.close();
		
		  System.out.println(listOfWeights);
	      System.out.println(listOfTerms);
	    
	      
	}
	

    public List<String> getListOfTerms()
    {
    	return listOfTerms;
    }
    
    public List<Integer> getListOfWeights()
    {
    	return listOfWeights;
    }
    
    
	
		@Override
	public double weightOf(String term) {
			int index = -1;
			double weight =0;
			
			if (term != null) {
				for (String s : listOfTerms) {
					index++;
					if (s.toLowerCase().equals(term.toLowerCase())){
					
					
					 weight = listOfWeights.get(index);}
					
					}
				
			}
				return weight;
		
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
