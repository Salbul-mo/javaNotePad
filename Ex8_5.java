package jeong_seok.exception;

public class Ex8_5 {

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.print(5);
		}
	}

	static void method1() {
		try {
			method2();
			System.out.println(1);
		} catch (ArithmeticException e) {
			System.out.println(2);
		} finally {
			System.out.println(3);
		}

		System.out.println(4);
	} // method1()

	static void method2() {
		throw new NullPointerException();
	}
}
/* 출력결과
 * 메서드1 실행 - try 메서드2 실행- NullpointerException 던짐
 * NullpointerException 은 ArithmeticException과 상속관계가
 * 없으므로 다시 메서드1로 던지고 finally 가 실행된 후 메서드1 실행단으로 
 * 넘어간다. 그 후 메서드1에서도 NullPointerException을 처리해줄 cath 블러이 없어서 
 * main메서드로 다시 던져진다. 이때 finally 블럭이 수행된다.
 * 처리해줄 모든 오류를 상속하는 Exception 이 catch 하여
 * 5가 출력된다. 
 *3
 *5 
 */
