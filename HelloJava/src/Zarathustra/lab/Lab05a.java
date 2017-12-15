package Zarathustra.lab;

import java.util.Scanner;

public class Lab05a {
	public static void main(String[] args) {
		// 예제 4-7
		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.>");

		Scanner scanner = new Scanner(System.in);

		int user = scanner.nextInt();// 화면을 통해 입력받은 숫자를 user에 저장
		int com = (int) (Math.random() * 3) + 1; // 1,2,3 중 하나가 com에 저장

		switch (user - com) {
		case 2:
		case -1:
			System.out.println("당신이 졌습니다.");
			break;
		case 1:
		case -2:
			System.out.println("당신이 이겼습니다.");
			break;
		case 0:
			System.out.println("비겼습니다.");
			// break; //마지막 문장이므로 break를 사용할 필요가 없다.
		}
	}
}
