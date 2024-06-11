
public class Practice {

	 public static void main(String[] args) {
		// TODO Auto-generated method stub
        //System.out.println("Hello World! ") ;
	 String inputString = "Hello" ;
	   
	 int i = 0 ; 
	 
	 for ( i=0 ; i<inputString.length(); i++) { 
	 
	 char a = inputString.charAt(i); 
	  
	 int asciinum = (byte)a  ;
	 
	 String binaryString = Integer.toBinaryString(asciinum) ;// integer?? -> int를 객체화?
			 
	 String eightBit = (String.format("%08d", Integer.parseInt(binaryString))); 
	 
	  System.out.print(eightBit);
	 
	 
	 //  8비트 문자열 
	 /* {int j = binaryString.length(); 
	  
	 boolean jp = (j<8) ; 
	   
	 if (jp) { System.out.print("00000");}
	   else {
	         System.out.print(binaryString);}  8비트로 자릿수를 맞춰야하나? */ 
	 
	  
   /*  StringBuffer sb = new StringBuffer() ;
     sb.append(outPutOne);
     System.out.print(sb.substring(0,5)); */
	 
	
	 }}}
	 


