package Zarathustra.lab;

import java.util.Scanner;

public class Lab08 {
	public static void main(String[] args) {

		// // 예제 4 - 15
		// System.out.println("i \t 2*i \t 2*i-1 \t i*i \t 11-i \t i%3 \t i/3");
		// System.out.println("----------------------------------------------");
		//
		// for (int i = 1; 1 <= 10; i++)
		// System.out.printf("%d \t %d \t %d \t %d \t %d \t %d \t %d%n", i, 2 * i, 2 * i
		// - 1, i * i, 11 - i, i % 3,
		// i / 3);

		// 예제 4-26

		int sum = 0;
		int i = 0;
		// i를 1씩 증가시켜 sum에 계속 더해 나간다.
		while ((sum += ++i) <= 100) {
			System.out.printf("%d - %d%n", i, sum);
			// System.out.println("\n");
		}

		// 예제 4-27
		int num;
		sum = 0;
		boolean flag = true; // while문의 조건식으로 사용될 변수.

		System.out.println("합계를 구할 숫자를 입력하세요. (끝내려면 0을 입력)");

		while (flag) { // flag의 값이 true이므로 조건식은 참이 된다.
			System.out.print(">>");

			Scanner sc = new Scanner(System.in);
			String tmp = sc.nextLine();
			num = Integer.parseInt(tmp);

			if (num != 0) {
				sum += num; // num이 아니면, sum에 더한다.
			} else {
				flag = false; // num이 아니면, flag의 값을 false로 변경.
			}

		} // while문의 끝

		System.out.println("합계:" + sum);

		// 연습문제 4-4

	} // main의 끝

}