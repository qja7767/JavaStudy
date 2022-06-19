package Practice5;

public class AbstractClass {
	public static void main(String[] args) {		
		PokeMon pokemon = new Pikachu(); //자식 값이 부모 값으로 가는 업캐스팅
		System.out.println("이 포켓몬은:"+pokemon.getName());
		pokemon.attack();
		pokemon.sound();
		
		pokemon = new Squirtle();
		System.out.println("이 포켓몬은:"+pokemon.getName());
		pokemon.attack();
		pokemon.sound();
	}
}

abstract class PokeMon{
	String name;
	abstract void attack();
	abstract void sound();
	public String getName() {
		return this.name;
	}
}

class Pikachu extends PokeMon {
	Pikachu(){
		this.name="피카츄";
	}
	@Override
	void attack() { 
		System.out.println("전기 공격");
	}

	@Override
	void sound() { 
		System.out.println("피카피카");
	}
	
}

class Squirtle extends PokeMon {
	Squirtle(){
		this.name="꼬부기";
	}
	
	
	@Override
	void attack() {
		System.out.println("물뿜기");
		
	}

	@Override
	void sound() {
		System.out.println("꼬북");
		
	}
	
}