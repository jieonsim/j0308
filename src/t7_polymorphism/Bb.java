package t7_polymorphism;

public class Bb extends Aa {
	public int su = 20;

	public Bb() {
		System.out.println("이 곳은 Bb 기본 생성자입니다.");
	}

	public void modBb() {
		System.out.println("이 곳은 Bb 클래스의 modBb 메소드입니다.");
	}
}
