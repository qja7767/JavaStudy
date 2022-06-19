package Practice8;

public class ExceptionPrac {
	public static void main(String[] args) {
		try {
			int [] a= {2,1,2};
			int b= 4;
			int c= b/a[2]; // 배열의 index [0], [1]
			System.out.println(c);
						
		}
		catch(ArithmeticException e) {
			System.out.println("산술 오류 발생");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 길이 오류 발생");
		}
		System.out.println("에외 처리 TEST");
	}
	
}
