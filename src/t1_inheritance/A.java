package t1_inheritance;

public class A {
	private int item1 = 500;
	int item2 = 600;

	// 사각형의 면적 구하는 메소드, 값 리턴하지 않고 그냥 출력만
	public void areaRec(int x, int y) {
		int area = x * y;
		System.out.println("사각형의 면적(가로 : " + x + ", 세로 : " + y + ") : " + area);
	}
}