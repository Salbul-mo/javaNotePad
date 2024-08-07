package jeong_seok.object;

public class Object_ex {
	//오브젝트 클래스의 메서드
	protected Object clone() = 객체 자신의 복사본을 반환한다.
	public boolean equals(Object obj) = 객체 자신과 객체 obj가 같은 객체인지 알려준다
	
	protected void finalize() = 객체가 소멸될 때 가비지 컬렉터에 의해 자동으로 호출된다. 이때 수행되어야 하는 코드가 있을 때 오버라이딩 한다.
	(거의 사용 안함)
	
	public Class getClass() = 객체 자신의 클래스 정보를 담고 있는 Class 인스턴스를 반환한다.
	public int hashCode() = 객체 자신의 해시코드를 반환한다.
	public String toString() = 객체 자신의 정보를 문자열로 반환한다.
	public void notify() = 객체 자신을 사용하려고 기다리는 쓰레드를 하나만 깨운다.
	public void notifyAll() = 객체 자신을 사용하려고 기다리는 모든 쓰레드를 깨운다.
	
	public void wait() 
	public void wait(long timeout)       
	public void wait(long timeout,int nanos)
	= 다른 쓰레드가 notify() 나 notifyAll()을 호출할 때까지 현재 쓰레드를 무한히, 또는 지정된 시간(timeout, nanos) 동안 기다리게 한다. 
	  timeout은 천분의 1초 / nanos 는 10의 9승 분의 1초
}
