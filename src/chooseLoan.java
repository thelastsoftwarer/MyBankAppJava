	
	public class chooseLoan extends AbstractFactory{
	    public Bank getBank(String bank){  
	        return null;  
	  }  
	
	    public Loan getLoan(String loan){  
	    	if(loan == null){  
	    		return null;  
	    	}  
	    	if(loan.equalsIgnoreCase("Home")){  
	    		return new HomeLoan();  
	    	} else if(loan.equalsIgnoreCase("Business")){  
	    		return new BusinessLoan();  
	    	} else if(loan.equalsIgnoreCase("Car")){  
	    		return new CarLoan();  
	    	}  
	    	return null;  
	    }  
		}
