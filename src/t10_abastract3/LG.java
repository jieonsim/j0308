package t10_abastract3;

public class LG extends Phone {

	public LG(String name) {
		super(name + " (LG)");
	}

	@Override
	public void function() {
		System.out.println(getName() + "폰은 카메라 화질이 우수합니다.");
	}

	@Override
	public void sound() {
		System.out.println(getName() + "폰의 벨소리는 띠리리입니다.");
	}
	
	public void functionLG() {
		System.out.println("이번에 새로 추가된 기능은 '만보기'가 있습니다.");
	}

}
