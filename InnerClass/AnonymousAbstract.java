package Practice7;

public class AnonymousAbstract {
	public static void main(String[] args) {
//		Abstract ab = new Abstract();
		// 추상클래스 역시 객체 생성이 불가능하나, 익명 클래스로 일회성 유사구현
		Abstract ab = new Abstract() {
			@Override
			void f2() {
				System.out.println("Abstract extends f2()");				
			}			
		};
		ab.f2();
	}
}

abstract class Abstract {
	abstract void f2();
}