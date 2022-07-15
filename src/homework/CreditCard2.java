package homework;

public class CreditCard2  {
    public static void main(String[] args) {
		// Note, these examples don't cover full test cases. 
    	creditCardCheck("378282246310005"); // AMEX
      	creditCardCheck("4012888888881881"); // VISA
 		creditCardCheck("5105105105105100"); // MASTERCARD
        creditCardCheck("123"); // INVALID
        
        System.out.println("------");
        System.out.println(luhnsAlgoCheck("378282246310005"));
        System.out.println(luhnsAlgoCheck("4012888888881881"));
        System.out.println(luhnsAlgoCheck("5105105105105100"));
        System.out.println(luhnsAlgoCheck("6176292929"));
        // 371111111111110
        System.out.println(luhnsAlgoCheck("378282246310005"));
    }
	
    public static void creditCardCheck(String creditCard) {
    	// 1. VALID NUMBERS	
        // 2. LUHN'S ALGO
        // 3. Determine the type of the card
    	
    	if (!isNumerics(creditCard)) {
    		System.out.println("INVALID");
    		return; // exits from the method
    	}
    	
    	if (!luhnsAlgoCheck(creditCard)) {
    		System.out.println("INVALID");
    		return; // exits from the method
    	}
    	
    	// TODO Determine card type
    	
    }
    
    public static boolean isNumerics(String card) {
    	// TODO code to check if card consist of all numerics
    	return true;
    }
  
    public static boolean luhnsAlgoCheck(String card) {
    	char[] arrCard = card.toCharArray();
        String multipliedByTwoStr = "";
      
        for (int i = arrCard.length - 2; i >= 0; i -= 2) {
        	int digit = Integer.parseInt(String.valueOf(arrCard[i]));
        	multipliedByTwoStr += (digit * 2);
        }
        
        int mByTwoSum = 0;
        for (int i = 0; i < multipliedByTwoStr.length(); i++) {
        	mByTwoSum += Integer.parseInt("" + multipliedByTwoStr.charAt(i));
        }
      	
        int finalSum = mByTwoSum;
        for (int i = arrCard.length - 1; i >= 0; i -= 2) {
        	finalSum += Integer.parseInt("" + arrCard[i]);
        }
        
        return finalSum % 10 == 0;
    }
}

