package jeong_seok.object;

public class Card {
	String kind;
	int number;
	
	Card() {
		this("SPADE", 1);
	}
	
	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}

}

class Ex9_4 {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
//Card@19e0bfd
//Card@139a55
//같은 클래스의 이름이지만 해시코드값이 다르다
}
/*
 * Object 클래스에 정의된 toString()은 아래와 같다.
 * public String toString() {
 * return getClass().getName()+"@"+Integer.toHexString(hashCode());
 *  }
 */
