package t7_polymorphism;

// Down Casting

public class Run {
	public static void main(String[] args) {
		Aa aa = new Aa();

		// Bb ab = (Bb) aa; => 부모 객체를 자식 객체로 바로 down casting 할 수는 없다.

		// Down Casting은 자식 객체가 부모 객체로 Up Casting 하였을 경우에만 다시 Down Casting 할 수 있다
		Aa ba = new Bb(); // Up Casting
		Bb bb = (Bb) ba;
		System.out.println();

		Bb db = new Dd();
		Dd dd = (Dd) db;
		System.out.println();

//		Cc ec = new Ee();
//		Ee ee = (Ee) ec;
//		System.out.println();
//
//		Aa eca = ec;
//		Cc ecac = (Cc) eca;

		Aa ea = new Ee();
		Ee eae = (Ee) ea;

		Cc eac = (Cc) ea;
	}
}
