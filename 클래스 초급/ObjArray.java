package Practice2;

public class ObjArray {

	public static void main(String[] args) {
		Food products[] = new Food[3];
		//products[0].name="치킨" <- 바로 넣기 불가
		
		//객체 배열에 넣을 객체 for문으로 생성
		for(int i=0; i<3; i++) {
			products[i]=new Food();
		}
		
		//배열에 넣기
		products[0].name="치킨";
		products[0].price=21000;
		
		products[1].name="피자";
		products[1].price=23000;
		
		products[2].name="햄버거";
		products[2].price=5600;
		
		for(int i=0; i<3; i++) {
			products[i].info();
		}
	}

}

class Food {
	String name;
	int price;
	
	void info() {
		System.out.println("name:"+name);
		System.out.println("price:"+price);
	}
}