package autocomplete;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import autocomplete.Term;

public class AutoCompleteAPI {



  public Map<Long, Term> termIndex = new HashMap<>();
  
  
  public AutoCompleteAPI()
  {
  }




public Collection<Term> getTerms ()
  {
    return termIndex.values();
  }

 
  public Term createTerm(int weight, String term) 
  {
    Term terms = new Term (weight, term);
    termIndex.put(terms.id, terms);
    return terms;
    
  }


 
}
