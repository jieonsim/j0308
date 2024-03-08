package t10_abastract3;

public class Run {
	public static void main(String[] args) {
		Phone samsungPhone = new Samsung("홍길동");
		samsungPhone.powerOn();
		samsungPhone.sound();
		samsungPhone.function();
		samsungPhone.functionSamsung();
		samsungPhone.powerOff();
		System.out.println();
		
		Phone lgPhone = new LG("김말숙");
		lgPhone.powerOn();
		lgPhone.sound();
		lgPhone.function();
		lgPhone.functionLG();
		lgPhone.powerOff();
	}
}
