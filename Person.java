package jeong_seok.object;

public class Person {

	long id;
	
	public boolean equals(Object obj) {
		if(obj instanceof Person)
			return id ==((Person)obj).id;
		// obj 가 Object 타입이므로 id값을 참조하기 위해서는 Person타입
		//으로 형변환이 필요하다.
		else 
			return false; 
		// 타입이 Person이 아니면 값을 비교할 필요도 없다.
	}
	
	Person(long id) {
		this.id = id;
	}
}

class Ex9_2 {
	public static void main(String[] args) {
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
		
		if(p1.equals(p2))
			System.out.println("p1 과 p2 는 같은 사람입니다");
		else
			System.out.println("p1 과 p2 는 다른 사람입니다.");
	}
}