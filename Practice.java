
public class Practice {.                                 //Base64 인코딩 원리에 따라 단계적으로 코딩해보기
	
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
        //System.out.println("Hello World! ") ;
	 String inputString = "Hello" ; // 문자열 지정
	   
	 int i = 0 ; 
	 
	 for ( i=0 ; i<inputString.length(); i++) { 
	 
	 char a = inputString.charAt(i); //문자열 속 문자 하나씩 호출
	  
	 int asciinum = (byte)a  ; //호출하여 아스키 10진수로 변환
	 
	 String binaryString = Integer.toBinaryString(asciinum) ;// 10진수를 2진수화. integer?? -> int를 객체화? 
			 
	 String eightBit = (String.format("%08d", Integer.parseInt(binaryString))); //8비트 자릿수 맞추기 위해. parseint??
	 
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
	 


