package Practice6;

public class Interface3 {

	public static void main(String[] args) {
		MyCellPhone phone1 = new MyCellPhone();
		Camera phone2 = new MyCellPhone();
		Call phone3 = new MyCellPhone();
		Memo phone4 = new MyCellPhone();
		Clock phone5 = new MyCellPhone();
		PhoneUser user1 = new PhoneUser();
		user1.call(phone1);
//		user1.call(phone2);
		user1.call(phone3);
//		user1.call(phone4);
//		user1.call(phone5);
	}

}

interface Camera {
	void photo();
}
interface Call{
	void calling();
}
interface Memo{
	void write();
}
interface Clock{
	void clock();
}
class MyCellPhone implements Camera, Call, Memo, Clock{

	@Override
	public void clock() {
		System.out.println("clock()");
	}
	@Override
	public void write() {
		System.out.println("write()");
	}
	@Override
	public void calling() {
		System.out.println("calling()");
	}
	@Override
	public void photo() {
		System.out.println("photo()");
	}	
}

class PhoneUser {
	void call(Call c) {
		System.out.println("전화를 걸었습니다.");
	}
}