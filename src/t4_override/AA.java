package t4_override;

// public final class AA { final 붙이면 객체 생성은 되는데 상속이 안됨
public class AA {
	private int item1 = 500;
	int item2 = 600;

	// 사각형의 면적 구하는 메소드, 값 리턴하지 않고 그냥 출력만
	public void areaRec(int x, int y) {
		int area = x * y;
		System.out.println("사각형의 면적(가로 : " + x + ", 세로 : " + y + ") : " + area);
	}

	// 원넓이 구하기
	// public final void areaCircle(int r) { -> final을 사용하면 메소드를 오버라이드(재정의)해서 사용할 수 없다
	public void areaCircle(int r) {
		double area = r * r * 3.14;
		System.out.println("반지름 " + r + "인 원 넓이 : " + area);
	}
}
