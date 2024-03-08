package t2_inheritance;

public class Run {
	public static void main(String[] args) {
		System.out.println("1.이곳은 Run클래스 입니다.");
		
		BB bb1 = new BB();
		bb1.areaRec(10, 20);
		bb1.areaPoly(1, 2, 3);
		System.out.println();
		
		BB bb2 = new BB(10);
		bb2.areaPoly(2, 3, 4);
		System.out.println();
		
		BB bb3 = new BB(10, 20, 30);
		System.out.println();
		
		System.out.println("2.이곳은 Run클래스 입니다.");
	}
}
