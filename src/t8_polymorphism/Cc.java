package t8_polymorphism;

public class Cc extends Aa {
	public int su = 30;

	public Cc() {
		System.out.println("이 곳은 Cc 기본 생성자 입니다.");
	}

	@Override
	public void modCc() {
		System.out.println("이 곳은 Cc 클래스의 modCc 메소드 입니다.");
	}

	@Override
	public void modHH(int a, int b) {
		System.out.println("두 수의 합은 : " + (a + b));
	}

}
