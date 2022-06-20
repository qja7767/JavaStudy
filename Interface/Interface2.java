package Practice6;

public class Interface2 {
	public static void main(String[] args) {
		TourGuide guide = new TourGuide();
		guide.leisureSports();
		guide.sightseeing();
		guide.food();
	}
}

interface Providable{
	void leisureSports();
	void sightseeing();
	void food();	
}

class koreaTour implements Providable {
	@Override
	public void leisureSports() {
		System.out.println("서울 수상스키");
	}
	@Override
	public void sightseeing() { 
		System.out.println("서울 박물관 관람");
	}
	@Override
	public void food() {
		System.out.println("서울 맛집 탐방");
	}
	
}
class JapanTour implements Providable {

	@Override
	public void leisureSports() {
		System.out.println("도쿄 타워 번지점프");
	}

	@Override
	public void sightseeing() {
		System.out.println("오사카 관람");
	}

	@Override
	public void food() {
		System.out.println("초밥 투어");
	}
	
}


class TourGuide {
//	private Providable tour= new koreaTour();
	private Providable tour= new JapanTour();
	public void leisureSports() {
		tour.leisureSports();		
	}
	public void sightseeing() {
		tour.sightseeing();		
	}
	public void food() {
		tour.food();		
	}
}