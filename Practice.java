
public class Practice {                //base64 인코딩 원리를 단계적으로 실행해보자

	 public static void main(String[] args) {
		// TODO Auto-generated method stub
        //System.out.println("Hello World! ") ;
	 String inputString = "Hello" ; //문자열 지정
	   
	 int i = 0 ; 
	 
	 for ( i=0 ; i<inputString.length(); i++) { 
	 
	 char a = inputString.charAt(i);  //문자열 차례대로 호출하기 
	  
	 int asciinum = (byte)a  ; // 호풀한 문자 아스키 10진수로 바꾸기
	 
	 String binaryString = Integer.toBinaryString(asciinum) ;// 변경한 10진수 2진수화 integer?? -> int를 객체화???
			 
	 String eightBit = (String.format("%08d", Integer.parseInt(binaryString))); //8비트 자릿수 맞추기 위해 parseint...???
	 
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
	 
	// 클래스에서 리턴값을 받아야할 것 같은데....
	 }}}
	 




