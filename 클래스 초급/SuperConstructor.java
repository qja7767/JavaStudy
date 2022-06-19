package Practice3;

public class SuperConstructor {

	public static void main(String[] args) {
		SportsCar mycar = new SportsCar("red", 300);
		System.out.println(mycar.color);
		System.out.println(mycar.speedLimit);
	}

}

class Car {
	int wheel;
	int speed;
	String color;
	Car(){}
	Car(String color) {
		this.color=color;
	}
}

class SportsCar extends Car {
	int speedLimit;
	//부모의 디폴트 생성자가 자동으로 호출되기 때문에 부모의 디폴트 생성자가 존재해야함.
	SportsCar(String color, int speedLimit){
		this.color = color;
//		super(color);
		this.speedLimit = speedLimit;
	}
}