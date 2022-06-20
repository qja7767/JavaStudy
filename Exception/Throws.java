package Practice9;

public class Throws {
	public static void main(String[] args) {
		try {
			methodA();
		}
		catch(Exception e) {
			System.out.println("메인에서 처리");
		}
	}
	public static void methodA() throws Exception{
		methodB();
	}
	public static void methodB() throws Exception{
		methodC();
	}
	public static void methodC() throws Exception{
		Exception e= new Exception();
		throw e; // 고의 예외 발생
	}
	/**
	 * 메서드 A가 B를 호출, B가 C를 호출, C가 에러 발생하여 에러를 자신을 호출한 B에게 
	 * 에러를 던짐, B가 에러를 A에게 던짐, A도 에러를 자신을 호출한 메인에 던짐
	 */
}

