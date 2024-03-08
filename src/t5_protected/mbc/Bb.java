package t5_protected.mbc;

import t5_protected.kbs.*;

public class Bb extends Aa {
	// 필드
	public int a2 = 10;
	protected int b2 = 20;
	int c2 = 30; // default
	private int d2 = 40;

	// 메소드
	public void modA2() {
		System.out.println("이 곳은 Bb 클래스의 modA 메소드입니다.");
	}

	protected void modB2() {
		System.out.println("이 곳은 Bb 클래스의 modB 메소드입니다.");
	}

	void modC2() {
		System.out.println("이 곳은 Bb 클래스의 modC 메소드입니다.");
	}

	private void modD2() {
		System.out.println("이 곳은 Bb 클래스의 modD 메소드입니다.");
	}
	
	@Override
	public void test() {
		modC2();
		
		a = 100;
		b = 200; // protected field 는 상속되면 이용 가능
		// c = 300; default field 라 불가
		// d = 400; private field 여서 field에 직접 접근 불가
		
		int d = getD(); // 여기서 선언한 변수 d는 Aa클래스 field의 d랑 관련 없음
		System.out.println("d : " + d);
	}
	

}
