package Zarathustra.lab;

public class Lab02 {
	public static void main(String[] args) {

		// 3. 다음 수학식들을 자바 표현식으로 바꿔보세요.

		int x = 10;
		int y = 20;
		int z = 30;
		int result = 0;

		result = 3 * x;
		// =System.out.printf("");
		// 예:System.out.printf("3 * x = %f \n", 3 * x);
		result = 3 * x + y;
		result = (x + y) / 7;
		result = (3 * x + y) / (z + 2);

		// 4. 다음 문장의 실행 결과는 무억인지 서술하세요.
		// 정수끼리의 연산 결과는 언제나 정수.
		System.out.printf("(1/3)*3 = %f \n", ((double) 1 / 3) * 3);
		System.out.printf("(1/3)*3 = %f \n", (1 / 3D) * 3);
		System.out.printf("(1/3)*3 = %f \n", (1 / 3.0) * 3);

		// 5. 다음 문장의 실행 결과는 무엇인지 서술하세요.
		// 몫과 나머지 구하기.
		int quotient, remainder;
		quotient = 7 / 3;
		remainder = 7 % 3;

		// 6. 다음 문장의 실행 결과는 무엇인지 서술하세요.
		int results = 11;
		results /= 2; // r= r / 2;

		// 7. 다음 변수에 정의된 값을 이용해서 자바 표현식의 실행 결과는 무엇인지 서술하시오.
		// 연산식 우선 순위
		double x2 = 2.5;
		double y2 = 1.5;
		int m = 18;
		int n = 4;
		// x + n * y - (x + n) * y;
		// m/5 +m % n
		// 5 * x - n / 5
		// 1 - ( 1 - ( 1 - ( 1 - ( 1 - n))))

		// 8. - 논리 연산자의 단축 평가

		System.out.println(3 + 4.5 * 2 + 27 / 8);
		System.out.println(true | false && 3 < 4 | !(5 == 7));
		System.out.println(true || (3 < 5 && 6 >= 2));
		// System.out.println(!true > 'A' );
		System.out.println(7 % 4 + 3 - 2 / 6 * 'Z');// 'Z'가 아스키코드로 출력
		// System.out.println();
		// System.out.println();

		// 9. 문자열로 처리
		System.out.println("May 13, 1988 fell on day number");
		// 특정 요일을 알아내는 수식
		// (Year + (Year / 4) - (Year / 100) + (Year / 400) + (13 * Month + 8) /5 + Day)
		// % 7
		System.out.println((1998 + (1988 / 4) - (1988 / 100) + (1988 / 400) + (13 * 5 + 8) / 5 + 13) % 7);
		System.out.println("Check out this line");
		System.out.println("//hello there " + '9' + 7);
		System.out.println('H');
		// System.out.println("Print both os us", "Me to");
		System.out.println("Here is" + 10 * 10);
		System.out.println("Not x is " + true);
		// System.out.println();
		// System.out.println;
		// ++ 실행 안 됨

		// 10. 단축 연산
		System.out.println(true && false && true || true);

		// 11. 결과값의 유형. 우선순위, 데이터 유형
		System.out.println(27 / 13 + 4);
		System.out.println(27 / 13 + 4.0);
		System.out.println(27 / 13.0 + 4);
		// 나누는 혹은 나누어지는 대상이 실수여야 값도 실수로 나온다.
		System.out.println('a' + 'b');
		System.out.println('a' / 'b');
		// System.out.println( 'a' &&! 'b'); !은 부정연산자. 수식에 쓸 수 없다.
		System.out.println((double) 'a' / 'b');

		// #12 형변환
		int o = (int) 3.9;// 측소형 변환
		System.out.println("n == " + o);

		// 13. 증가 감소 연산자
		int p = 3;
		p++; // 단독으로 쓰일 때는 ++p도 같음.
		System.out.println("p ==" + p);

		p = 3;
		System.out.println("p== " + p++);
		// "p == " + p, [ = p + 1
		System.out.println("p== " + p);

		p = 3;
		p--;
		System.out.println("p==" + p);

		p = 3;
		System.out.println("p== " + p--);
		System.out.println("p== " + p);

		// 14. 문자열 연결
		// System.out.println(" 2 + 2 = " + (2+2 = " + ));
		// System.out.println(" 2 + 2 = " + 2+2));

		// 15. 문자와 숫자 사이
		char a, b;
		a = 'b';
		System.out.println(a);
		System.out.println((int) a);

		b = 'c';
		System.out.println(b);

		a = b;
		System.out.println(a);

	}
}
