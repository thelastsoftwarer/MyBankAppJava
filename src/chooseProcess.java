
public class chooseProcess {
	  public static AbstractFactory getFactory(String choice){  
	      if(choice.equalsIgnoreCase("Bank")){  
	         return new choseBank();  
	      } else if(choice.equalsIgnoreCase("Loan")){  
	         return new chooseLoan();  
	      }  
	      return null; 

}
}
