package t5_protected.kbs;

public class Aa {
	// 필드
	public int a = 10;
	protected int b = 20;
//	int b = 20;
	int c = 30; // default
	private int d = 40;

	// 메소드
	public void modA() {
		System.out.println("이 곳은 Aa 클래스의 modA 메소드입니다.");
	}

	protected void modB() {
		System.out.println("이 곳은 Aa 클래스의 modB 메소드입니다.");
	}

	void modC() { // default
		System.out.println("이 곳은 Aa 클래스의 modC 메소드입니다.");
	}

	private void modD() {
		System.out.println("이 곳은 Aa 클래스의 modD 메소드입니다.");
	}

	// 메소드 만들기
	public void test() {
		modD();
	}

	// d필드에 대한 getter 와 setter
	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

}
