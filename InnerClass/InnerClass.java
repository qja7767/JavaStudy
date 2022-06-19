package Practice7;

public class InnerClass {
	public static void main(String[] args) {
		
	}
}

class A {
	static class StaticInner {
		
	}
	class InstanceInner {
		
	}
	StaticInner st1 = new StaticInner();
	InstanceInner ii1= new InstanceInner();
	
	static void StaticMethod() {//인스턴스 접근불가
		StaticInner st2 = new StaticInner();
//		InstanceInner ii2 = new InstanceInner(); 
//		스태틱메서드는 인스턴스 멤버에 접근 불가능, 스태틱 키워드는 객체생성전에 생성, 인스턴스는 후에 생성
	}
	void InstanceMethod() {//모두접근
		StaticInner st3 = new StaticInner();
		InstanceInner ii3 = new InstanceInner();
	}
}