package Practice;

import java.util.Scanner;

public class Cafe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int count = 0;
		//메뉴는 4가지
		//10까지 주문가능, 10개 이상시 예외처리 필요		
		String orderList[]=new String[10];
		int total = 0;
		while(true) {
			System.out.println("SYSTEM");
			System.out.println("1. 주문");
			System.out.println("2. 취소");
			System.out.println("3. 결제");
			System.out.println("4. 종료");
			System.out.println("입력:");
			int num=sc.nextInt();
			if(num==1) {
				String menuName="";
				int menuPrice=0;
				System.out.println("1. ITEM1\t3800원");
				System.out.println("2. ITEM2\t2400원");
				System.out.println("3. ITEM3\t5300원");
				System.out.println("4. ITEM4\t6700원");
				System.out.println("주문할 메뉴번호:");
				int menuNum=sc.nextInt();
				if(menuNum==1) {
					menuName="ITEM1";
					menuPrice=3800;
				}
				else if(menuNum==2) {
					menuName="ITEM2";
					menuPrice=2400;
				}
				else if(menuNum==3) {
					menuName="ITEM3";
					menuPrice=5300;
				}
				else if(menuNum==4) {
					menuName="ITEM4";
					menuPrice=6700;
				}
				else {
					System.out.println("잘못 입력하셨습니다.");
					continue;
				}
				total+=menuPrice;
				orderList[count]=menuName;
				count++;
				System.out.println("주문한 메뉴는" + menuName + "입니다.");
				System.out.println("가격은 " + menuPrice + "입니다.");
				System.out.println("총금액은 " + total + "입니다");
			}
			else if(num==2) {
				System.out.println("==주문한 메뉴리스트==");
				for(int i=0; i<count; i++) {
					System.out.println(i+1+"."+orderList[i]);
				}
				System.out.println("취소할 메뉴번호:");
				int cancelNum=sc.nextInt();
				if(1<=cancelNum && cancelNum<=count) {
					String delMenu= orderList[cancelNum-1];
					System.out.println(delMenu+"메뉴 삭제!");
					for(int i=cancelNum-1; i<count; i++) {
						orderList[i]=orderList[i+1];						
					}
					if(delMenu.equals("ITEM1")) {
						total-=3800;
					}
					else if(delMenu.equals("ITEM2")) {
						total-=2400;
					}
					else if(delMenu.equals("ITEM3")) {
						total-=5300;
					}
					else if(delMenu.equals("ITEM4")) {
						total-=6700;
					}
					count--;
				}
			}
			else if(num==3) {
				System.out.println("결제해야할 금액:" + total + "원");
				System.out.println("지불할 금액:");
				int money=sc.nextInt();
				if ( money < total ) {
					System.out.println("잔돈이 부족합니다.");
					continue;
				}
				else {
					System.out.println("남은금액" + (money-total) +"원 ");
					total = 0;
					for (int i =0; i<10; i++) {
						orderList[i]="";
					}
					count = 0;
				}
			}
			else if(num==4) {
				System.out.println("SYSTEM 종료(WHILE 탈출)");
				break;
			}
			else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
	}
}
