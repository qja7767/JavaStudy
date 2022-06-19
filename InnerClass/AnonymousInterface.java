package Practice7;

public class AnonymousInterface {
	public static void main(String[] args) {
		// Inter it1=new Inter(); 인터페이스는 객체를 생성할수 없음
		// 하지만 일회성 익명으로 유사 구현가능
		Inter1 it= new Inter1() {
			@Override
			public void f1() {				
				System.out.println("inter1 imple f1()");
			}			
		};
		it.f1();
	}
}

interface Inter1 {
	void f1();
}

//일반 클래스
class Inter1Impl implements Inter1 {
	@Override
	public void f1() {
		
	}
	
}