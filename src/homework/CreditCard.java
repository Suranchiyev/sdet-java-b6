package homework;

public class CreditCard  {
    public static void main(String[] args) {
		// Note, these examples don't cover full test cases. 
    	creditCardCheck("378282246310005"); // AMEX
      	creditCardCheck("4012888888881881"); // VISA
 		creditCardCheck("5105105105105100"); // MASTERCARD
        creditCardCheck("-123"); // INVALID
    }
	
    public static void creditCardCheck(String creditCard) {
    	// your code goes here
      	int[] ccNumArr = new int[creditCard.length()];
      
      	for (int i = 0; i < creditCard.length(); i++) {
        	ccNumArr[i] = Integer.parseInt(creditCard.substring(i, i + 1));
        }
      	
      	int sumOfNum = 0;
      	
      	for (int i = ccNumArr.length - 2; i >= 0; i -= 2) {
          	sumOfNum += (ccNumArr[i] * 2) > 9 ? (ccNumArr[i] * 2) % 10 + 1 : ccNumArr[i] * 2;
        }
      	
      	for (int i = ccNumArr.length - 1; i >= 0; i -= 2) {
          	sumOfNum += ccNumArr[i];
        }
      	
      	long firstTwoNum = Long.valueOf(creditCard.substring(0, 2));
                                        
      	if (sumOfNum % 10 == 0) {
        	if (creditCard.length() == 15 && (firstTwoNum == 34 || firstTwoNum == 37)) {
              	System.out.println("AMEX");
            } else if (creditCard.length() >= 13 && creditCard.length() <= 16 && creditCard.charAt(0) == '4') {
              	System.out.println("VISA");
            } else if (creditCard.length() == 16 && (firstTwoNum >= 51 && firstTwoNum <= 55)) {
              	System.out.println("MASTERCARD");
            }
        } else {
          	System.out.println("INVALID");
        }
    }
}
