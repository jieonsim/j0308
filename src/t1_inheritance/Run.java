package t1_inheritance;

public class Run {
	public static void main(String[] args) {
		A a = new A();
		System.out.print("1. ");
		a.areaRec(10, 20);
		
		B b = new B();
		System.out.print("2. ");
		b.areaRec(20, 30);
		
		C c = new C();
		System.out.print("3. ");
		b.areaRec(30, 40);
		
		D d = new D();
		System.out.print("4. ");
		b.areaRec(40, 50);
		
		E e = new E();
		System.out.print("5. ");
		b.areaRec(50, 60);
		System.out.println();
		
		b.areaPloly(10, 20, 5);
		d.areaPloly(10, 20, 5);
		
		
	}
}
