package jeong_seok.object;

public class Ex9_10 {

	public static void main(String[] args) {
		int iVal = 100;
		String strVal = String.valueOf(iVal); // int 를 String으로 변환

		double dVal = 200.0;
		String strVal2 = dVal + ""; // int 를 String 으로 변환하는 또다른 방법

		double sum = Integer.parseInt("+" + strVal) + Double.parseDouble(strVal2);
		//String을 int와 double로 변환하여 합1
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		//String을 int와 double로 변환하여 합2

		System.out.println(String.join("", strVal, "+", strVal2, "=") + sum);
		//String.join 으로 합치기
		System.out.println(strVal + "+" + strVal2 + "=" + sum2);
		//그냥 println() 에 출력하기
	}
}
/* 출력 결과
100+200.0=300.0
100+200.0=300.0
*/