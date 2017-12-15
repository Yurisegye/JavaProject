package Zarathustra.lab;

import java.util.Scanner;

public class Lab05b {
	public static void main(String[] args) {

		System.out.print("당신의 주민등록번호를 입력하세요. (0112311111222)>");

		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine();

		char gender = regNo.charAt(6); // 입력받은 번호의 7번째 문자를 gender에 저장

		switch (gender) {
		case '1':
		case '3':
			System.out.println("당신은 남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("당신은 여자입니다.");
			break;
		default:
			System.out.println("유효하지 않은 주민등록번호입니다.");

		}

	} // mein의 끝

}
