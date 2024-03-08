package t4_override;

import java.util.*;

public class Run {
	public static void main(String[] args) {
		AA aa = new AA();

		CC cc = new CC();

		Scanner scanner = new Scanner(System.in);

		System.out.print("1.신라 2. 백제 : ");
		int answer = scanner.nextInt();
		System.out.print("반지름 : ");
		int r = scanner.nextInt();

		if (answer == 1) {
			cc.areaCircle(r);
		} else if (answer == 2) {
			cc.areaCircle2(r);
		} else {
			System.out.println("코드를 확인 후 다시 처리해주세요");
		}

		scanner.close();
	}
}
