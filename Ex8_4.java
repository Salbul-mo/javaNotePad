package jeong_seok.exception;

public class Ex8_4 {

	static void method(boolean b) {
		try {
			System.out.println(1);
			if(b) throw new ArithmeticException();
			System.out.println(2);
		} catch (RuntimeException r) {
			System.out.print(3);
			return;
		} catch (Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println(5);
		}
		
		System.out.println(6);
	}
	
	public static void main(String[] args) {
		method(true);
		method(false);
	}
	
}
/*
 * 결과 
 * 1
 * 35
 * 1
 * 2
 * 5
 * 6
 * 
 * ArithmeticException 은 RuntimeException 의 자식이다.
 * 그리고 try catch 블럭 실행 후 끝의 return 을 만나 메서드 종료.
 * finally 를 실행하고 메서드는 종료된다.
 * 
 * 오류가 없을 때에는 2까지 실행되고 
 * finally 역시 실행되고나서 메서드의 마지막 블럭까지 실행된다.
 * 
 */
