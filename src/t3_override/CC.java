package t3_override;

public class CC extends AA {
	// 부모메소드 가져와서 재정의해서 쓰는 것 : 오버라이딩
	
//	public void areaCircle(int r) {
//		double area = r * r * Math.PI;
//		System.out.println("반지름 " + r + "인 원 넓이 : " + area);
//	}
	
	// 부모메소드 가져온 후 아무것도 고치지 않더라도 이것 또한 오버라이딩임
	// 오버라이딩 리턴 타입 관계 있음. 리턴 타입 틀리게 하면 오버라이딩 안됨
//	public double areaCircle(int r) {
//		double area = r * r * 3.14;
//		System.out.println("반지름 " + r + "인 원 넓이 : " + area);
//	}
	
	public void areaCircle2(int r) { // 선언부가 완전히 같아야 오버라이딩 됨. 그 안에 내용을 재정의하든 안하든은 상관 X
		double area = r * r * 3.14;
		System.out.println("반지름 " + r + "인 원 넓이 : " + area);
	}
}
