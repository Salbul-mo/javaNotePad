package jeong_seok.object;

public class Ex9_3 {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		//String 클래스는 문자열의 내용이 같으면 동일한 해시코드를 반화하도록
		//오버라이딩 되어있기 때문에 같은 내용의 문자열로 호출하면 항상 동일한
		//해시코드값을 얻는다.
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		//반면 System.identityHashCode(Object x)는
		//Object 클래스의 hashCode() 메서드처럼 객체의 주소값으로 해시코드를
		//생성하기 때문에 모든 객체에 대해 항상 다른 해시코드값을 반환할 것을
		//보장한다. 그래서 str1과 str2 가 해시코드는 같지만
		//서로 다른 객체라는 것을 알 수 있다.
	}

}
/*
 * 해싱(hashing) 기법에 사용되는 해시함수를 구현
 * 해싱은 데이터 관리 기법 중의 하나
 * 해시함수는 찾고자하는 값을 입력하면, 
 * 저장된 위치를 알려주는 해시코드(hash code)를 반환한다.
 * 해시코드가 같은 두 객체가 존재하는 것이 가능하지만, Object클래스에 정의된
 * hashCode 메서드는 객체의 주소값을 이용해서 해시코드를 만들어 반환하기 때문에
 * 서로 다른 두 객체는 결코 같은 해시코드를 가질 수 없다.
 * 단 64 bit JVM에서는 주소가 64 bit 이므로 
 * 주소를 해시코드(32 bit)로 변환하면 중복된 값이 나올 수도 있다.
 * equals()메서드 처럼 hashCode() 메서드도 적절히 오버라이딩해야 한다.
 * 같은 객체라면 hashCode()메서드를 호출했을 때의 결과값인 해시코드도 같아야 하기 때문
 * 만일 hashCode() 메서드를 오버라이딩하지 않는다면
 * Object클래스에 정의된 대로 모든 객체가 서로 다른 해시코드값을 가질 것이다.
 */
