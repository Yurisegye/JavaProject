package Zarathustra.lab;

import java.util.Scanner;

public class Lab04 {
	public static void main(String[] args) {

		// 예제
		int score = 50;
		if (score > 60) {
			System.out.println("합격입니다");
		}

		// 16
		int n = 1;
		int k = 2;
		int r = n;
		if (k < n)
			r = k;
		System.out.printf("%d %d %d", n, k, r);

		int q;
		if (n < k) // 1<2
			q = k; // q=2
		else
			q = k + n;
		System.out.printf("%d %d %d", n, k, q);

		r = k;
		if (r < k)
			n = r;
		else
			k = n; // k=1
		System.out.printf("%d %d %d\n", n, k, r);

		r = 3;
		k = 2;
		if (r < n + k)
			r = 2 * n;
		else
			k = 2 * r;
		System.out.printf("%d %d %d\n", n, k, r);

		// 17
		int x = 1, y = 2;
		// if (x && y == 0) { // x && y == true
		// x = 1;
		// y = 1;
		// }

		// if (x >= 1 && x <= 10)
		// System.out.println("");

		// 18
		int number = 30;
		if (number % 2 == 0)
			System.out.println(number + "는 짝수");
		System.out.println(number + "는 홀수");

		number = 35;
		if (number % 2 == 0)
			System.out.println(number + "는 짝수 ");
		System.out.println(number + "는 홀수 ");

		number = 30;
		if (number % 2 == 0)
			System.out.println(number + "는 짝수");
		else
			System.out.println(number + "는 홀수");

		// 19.
		x = 3;
		y = 4;

		if (x > 2) {
			int z = x + y;
			{
				System.out.println("z is" + z);
			}
		} else
			System.out.println("x is" + x);

		// 20.
		int a = 3;
		if (a++ == 3)
			System.out.println("3");
		else
			System.out.println("4");

		a = 4;
		if (a++ == 3)
			System.out.println("3");
		else
			System.out.println("4");

		a = 3;
		a = a++; // 수식이어서 ++가 의미가 없다. ++의 속성이 사라짐. b=a++이면 괜찮다.
		if (a++ == 3)
			System.out.println("3");
		else
			System.out.println("4");

		a = 3;
		++a; // a++;
		if (a++ == 3)
			System.out.println("3");
		else
			System.out.println("4");

		a = 3;
		a = ++a;
		if (a == 3)
			System.out.println("3");
		else
			System.out.println("4");
		System.out.println(a);

		// 21
		// 결혼여부 isMarried = "Y", "N"
		// 결혼여부 isMarried = true, false
		// 결혼여부 isMarried = 0, 1

		Scanner sc = new Scanner(System.in);
		System.out.println("결혼 여부를 입력하세요(미혼:0, 기혼:1).");
		int isMarried = Integer.parseInt(sc.nextLine());
		System.out.println("연봉을 입력하세요.");
		int salary = Integer.parseInt(sc.nextLine());
		int tax = 0;

		if (isMarried == 0) {
			if (salary < 3000)
				tax = (int) (salary * 0.1);
			else
				tax = (int) (salary * 0.25);
		} else if (isMarried == 1) {
		}
		System.out.println(isMarried);
		System.out.println(salary);
		System.out.println(tax);

	}
}
