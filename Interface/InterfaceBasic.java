package Practice6;

public class InterfaceBasic {
	public static void main(String[] args) {
		B b = new B();
		b.methodA();
		b.methodB();
//		b.x=30; 변경불가
	}
}

interface Ainter{
	final int x=10;
	int y=20; //'상수'만 들어갈수 있음 = final, final 생략가능
	abstract void methodA();
	void methodB(); // abstract 생략가능
}

class B implements Ainter {

	@Override
	public void methodA() {
		System.out.println("methodA()");		
	}

	@Override
	public void methodB() {
		System.out.println("methodB()");
	}
	
}