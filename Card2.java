package jeong_seok.object;

class Card2 {
	String kind;
	int number;
	
	Card2() {
		this("SPADE", 1); //Card(String kind, int number 호출)
	}
	
	Card2(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		return "kind : " + kind + ", numbe : " + number;
		//Card2 인스턴스의 kind와 number를 문자열로 반환한다.
	}

}

class Ex9_5 {
	public static void main(String[] args) {
		Card2 c1 = new Card2();
		Card2 c2 = new Card2("HEART",10);
		
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
