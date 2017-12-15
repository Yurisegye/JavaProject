package Zarathustra.lab;

import java.util.Scanner;

public class Lab05 {
	public static void main(String[] args) {

		// 예제 4-6
		System.out.print("현재 달을 입력하세요.>");

		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 month에 저장

		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("현재 철은 봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("현재 철은 여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("현재 철은 가을입니다.");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("현재 철은 겨울입니다.");
			break;
		}

	} // 메인의 끝
}
