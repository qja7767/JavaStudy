package Practice;

public class Method3 {
	public static void main(String[] args) {
		int b = calculator(20, 34);
		System.out.println(b);
	}
	
	static int calculator(int a, int b) {
		System.out.println("사각형의 넓이 메서드 시작");
		int area= a*b;
		return area;
	}
}
