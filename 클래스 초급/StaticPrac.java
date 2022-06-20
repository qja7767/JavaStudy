package Practice;

public class StaticPrac {
	public static void main(String[] args) {
		System.out.println(Car2.wheel);//클래스는 접근가능
//		System.out.println(Car2.speed); 인스턴스는 접근 불가 인스턴스 생성필요(new)
		
		Car2 myCar1=new Car2();
		System.out.println(myCar1.speed);
		
		Car2 myCar2=new Car2();
		System.out.println("변경전");
		System.out.println("myCar1.speed: "+myCar1.speed);
		System.out.println("myCar2.speed: "+myCar2.speed);
		System.out.println("myCar1.wheel: "+myCar1.wheel);
		System.out.println("myCar2.wheel: "+myCar2.wheel);
		
		myCar2.speed=100;
		myCar2.wheel=5;
		
		System.out.println("변경후");
		//myCar2의 스피드는 고유한 인스턴스 변수기때문에 myCar2만 바뀌어짐.(값 비공유)
		System.out.println("myCar1.speed: "+myCar1.speed);
		System.out.println("myCar2.speed: "+myCar2.speed);
		//myCar1, myCar2는 클래스 변수기때문에 둘다 공통적으로 모두 바뀜(값 공유)
		System.out.println("myCar1.wheel: "+myCar1.wheel);
		System.out.println("myCar2.wheel: "+myCar2.wheel);
		
	}

}

class Car2{
	static int wheel=4; // 클래스 변수
	int speed; // 인스턴스 변수
	
}
