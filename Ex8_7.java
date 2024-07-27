// 입력 받을 때 예외처리하는 예시

package jeong_seok.exception;

import java.util.Scanner;

public class Ex8_7 {

	public static void main(String[] args) {
		//1~100가지 임의 값을 얻어서 answer에 저장한다.
		int answer = (int) (Math.random() *100) + 1;
		int input = 0; // 사용자입력을 저장할 공간
		int count = 0; // 시도횟수를 세기 위한 변수
		
		do {
			count++;
			try {
			System.out.print("1과 100 사이의 값을 입력하세요 :");
		
			input = new Scanner(System.in).nextInt();
			} catch (Exception e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요");
				continue;
			}
			if (answer > input) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if (answer < input) {
				System.out.println("더 작은 수를 입력하세요.");
			} else {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는 " + count + "번입니다.");
				break; // do - while문을 벗어난다.
			}
		} while(true); //무한반복문
		
	}//end of main
}// end of class
