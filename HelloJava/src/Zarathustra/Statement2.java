package Zarathustra;

public class Statement2 {
	public static void main(String[] args) {

		System.out.println("오늘 너무 추워요!");
		System.out.println("오늘 너무 추워요!");
		System.out.println("오늘 너무 추워요!");
		System.out.println("오늘 너무 추워요!");
		System.out.println("오늘 너무 추워요!");
		System.out.println("오늘 너무 추워요!");

		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");

		// 단조롭고 무식하게 복붙 코드로 반복작업을
		// 수행하는 것은 유비보수 측면으로 볼 때
		// 좋은 방법은 아니다.

		// 반복문
		// for 지정한 횟수만큼 어떤 작업을 반복

		// 증감식 1만 증가
		// 무한루프(; ;)
		// 숫자 변수는 ijklm가 관례

		for (int i = 1; i <= 5; i = i + 1) {
			System.out.println("오늘 너무 추워요!");
		}

		for (int i = 1; i <= 5; i += 1) {
			System.out.println("오늘 너무 추워요!");
		}

		for (int i = 1; i <= 5; ++i) {
			System.out.println("오늘 너무 추워요!"); // 고정값 반복
		}

		for (int i = 1; i <= 5; ++i)
			System.out.println(i); // if처럼 하나짜리는 중괄호 생략 가능

		for (int i = 1; i <= 100; ++i)
			System.out.println(i); // 1 - 100까지

		for (int i = 1; i <= 100; ++i) // 조건이 참이냐 거짓이냐에 따라 작업이 중단될 수 있음. 즉 상한선만을 제시한다.
			if (i % 2 != 0) // 다른 부가 조건은 밑에 if 이용.
				System.out.println(i); // 1 - 100까지 홀수만

		// 효율 있게 짜는 법
		for (int i = 1; i <= 100; i += 2)
			System.out.println(i); // 1 - 100까지 홀수만

		for (int i = 1; i <= 100; ++i)
			if (i % 2 == 0)
				System.out.println(i); // 1 - 100까지 짝수만

		// 효율 있게
		for (int i = 2; i <= 100; i += 2)
			System.out.println(i); // 1 - 100까지 짝수만

		// 구구단

		String fmt = "%d x %d = %d \n";
		for (int i = 1, j = 5; i <= 9; ++i)
			System.out.printf(fmt, j, i, j * i);

		// 중첩 for 문

		for (int i = 1; i <= 5; ++i) {
			for (int j = 1; j <= 10; ++j) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

		// 직각삼각형 그리기
		// *
		// **
		// ***
		// ****
		// *****
		for (int i = 1; i <= 5; ++i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

		// *****
		// ****
		// ***
		// **
		// *

		for (int i = 1; i <= 5; ++i) {
			for (int j = 5; j >= i; j -= 1) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

		for (int i = 1; i <= 5; ++i) {
			for (int j = 1; j <= (6 - i); ++j) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}
}
