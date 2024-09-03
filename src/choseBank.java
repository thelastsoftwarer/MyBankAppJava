
public class choseBank extends AbstractFactory {

	public Bank getBank(String bank){  
	      if(bank == null){  
	         return null;  
	      }  
	      if(bank.equalsIgnoreCase("A")){  
	         return (Bank) new A();  
	      } else if(bank.equalsIgnoreCase("B")){  
	         return (Bank) new B();  
	      } else if(bank.equalsIgnoreCase("C")){  
	         return (Bank) new C();  
	      }  else {
	      return null;
	      }
	   }  
	  public Loan getLoan(String loan) {  
	      return null;  
	   }  

}
