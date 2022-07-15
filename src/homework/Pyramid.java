package homework;

public class Pyramid  {
	public static void main(String[] args) {
		makePyramid(3);
    }
	
	public static void makePyramid(int num) {
		// your code goes here
     if (!(num >= 1 && num <=8)){
		System.out.println("INVALID INPUT");
       return;
     }
      String row = "";
      
      for (int i = 0; i<num; i++){
        for(int j = 1;j<num-i;j++ ){
          row+=" ";
        }
        
        for(int k = 0; k<= i; k++){
          row+="#";
        }
        row+="  ";
        for(int j = 0;j<=i;j++){
          row +="#";
        }
        
        if(i!= (num-1)){
          row += "\n";
        }
      }
      System.out.println(row);
        
   	}
}
