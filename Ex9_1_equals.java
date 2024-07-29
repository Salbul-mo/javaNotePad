package jeong_seok.object;


public class Ex9_1_equals {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if (v1.equals(v2))
			System.out.println("v1 과 v2 는 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다.");
	}// main

}

class Value {
	int value;
	
	Value(int value) {
		this.value = value;
	}
}
// v1 과 v2는 다릅니다 출력.
// equals() 는 주소값으로 비교를 하기 때문에, 두 Value인스턴스의 멤버변수 value 의 값이
// 10 으로 서로 같을지라도 equals() 로 비교한 결과는 false일 수 밖에 없다.