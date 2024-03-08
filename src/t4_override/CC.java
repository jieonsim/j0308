package t4_override;

public class CC extends AA {
//	public void areaCircle(int r) {
//		double area = r * r * 3.14;
//		System.out.println("반지름 " + r + "인 원 넓이 : " + area);
//	}

	@Override
	public void areaCircle(int r) {
		double area = r * r * Math.PI;
		System.out.println("반지름 " + r + "인 원 넓이 : " + area);
	}
	
	public void areaCircle2(int r) {
//		double area = r * r * Math.PI;
//		System.out.println("반지름 " + r + "인 원 넓이 : " + area);
		super.areaCircle(r);
	}
	
	
}
