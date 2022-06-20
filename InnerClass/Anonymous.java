package Practice7;

public class Anonymous {
	public static void main(String[] args) {
		OuterClass1 o = new OuterClass1() {
			void a() {
				System.out.println("새롭게 정의된 익명 클래스 메서드");
			}
		};
		o.a();
		OuterClass1 ok = new OuterClass1();
		ok.a(); // 익명 클래스는 1회성임을 알 수 있다.				
	}
}

class OuterClass1 {
	void a() {
		System.out.println("method a");
	}
	void b() {
		
	}	
}