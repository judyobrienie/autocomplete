package autocomplete;

import static com.google.common.base.MoreObjects.toStringHelper;



public class Term {
	
	  public int weight;
	  public String term;
	  static int   counter = 0;
	  public int   id;

	

	public Term()
	  {
	  }

	  public Term(int weight, String term)
	  {
	    setWeight(weight);
	    this.term = term;
	    this.id  = counter++;
	  }

	  
	  
	  @Override
	  public String toString()
	  {
	    return toStringHelper(this).addValue(id)
	    						   .addValue(weight) 
	    						   .addValue(term)
	                               .toString();
	  }
	  
	  public int getWeight() {
			return weight;
		}

		public void setWeight(int weight) {
			if( weight >= 0){
				this.weight = weight;
				}
				else weight = 0;
		}

		public String getTerm() {
			return term;
		}

		public void setTerm(String term) {
			this.term = term;
		} 
	  
	  

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((term == null) ? 0 : term.hashCode());
		result = prime * result + weight;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Term other = (Term) obj;
		if (term == null) {
			if (other.term != null)
				return false;
		} else if (!term.equals(other.term))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}

}
