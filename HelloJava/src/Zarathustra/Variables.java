package Zarathustra;

import java.util.Scanner;

public class Variables {
	public static void main(String[] args) {
		/*
		 * 자바 기본 자료형 int: 정수(byte, short, long) double: 실수(float) char: 문자 String: 문자열
		 */

		// 변수: 자료형 변수 이름;
		int a; // 정수형 변수
		double b; // 실수형 변수
		char c; // 문자 변수(1자)
		String d; // 문자열 변수

		// 상수: final 자료형 변수 이름;
		// 변경 불가 자료를 저장하기 위해 사용
		// 변수 이름은 대문잘 작성!
		final int E;
		final double F;
		final char G;
		final String H;

		// 자바 예약어는 변수 이름으로 사용 불가.
		// int if;
		// foible import;
		// char System // 비추!
		// Strinh String //비추// !
		// 회원정보 (이이디, 비밀번호, 이름, 나이)

		String userid; // id, uid, 아이
		String passwd; // password, pwd
		String name; // 이름
		// String name, passwd, name;
		// String name="x", passwd="y", name="z"
		// 동일한 자료형 변수들은 ,로 구분해서 한번에 선언 가능(가독성에 좋지 않아 비추).
		int age;

		// 리터널: 컴파일러가 이해할 수 있는 형식으로 작성괸 데이터나 값
		long jumin = 1234567L;

		// 변수 초기화: 변수에 값을 대입
		// 변수명 - 값;
		userid = "zzyzzy";
		passwd = "987654";
		name = "suji";
		age = 23;

		b = 123.256;
		float pi = 3.145678F;
		c = '수';
		G = 'a';

		// 변수 VS 상수
		c = '우';
		// G = 'x'; // 상수는 값이 한번 할당되면 변경 불가

		// 선언과 초기화
		int i = 132;
		double j = 987.124;
		boolean k = true; // 논리형 변수
		k = false;
		// k = 123;
		// k = '가';

		// 변수/상수 이름
		// 변수는 일반적으로 소문자
		// 만일 이름을 두 낱말로 구성하는 경우
		// camel 표기법을 사용.

		int juminCode;
		String sayHello;

		// 상수는 모두 대문자로 작성
		// 두 낱말 이상일 경우
		// 각 낱말은 _으로 이어 사용.
		final double PI = 3.14;
		final int THIS_YEAR = 2017;
		final String USER_ID = "zzyzzy";

		// JDK7부터도입된 자릿수 표시:
		jumin = 1234567l;
		jumin = 12_345_67l;

		char ch = '가';
		// 문자와 숫자 간 변환
		System.out.println(ch);
		System.out.println((int) ch);

		// 특수문자 표현 - escape sequence
		System.out.println("가     나");
		System.out.println("가\t나");// 탭문자
		System.out.println("가\n나"); // 줄바꿈문자
		System.out.println("가\"나"); // 큰따옴표 문자
		System.out.println("가\'나"); // 작은따옴표 문자

		// 변수 출력하는 방법
		System.out.println(jumin);
		System.out.println(passwd);
		System.out.println(name);
		System.out.println(age);
		System.out.println("아이디: " + userid + "주민번호: " + jumin);
		System.out.println(jumin);
		System.out.println(passwd);
		System.out.println(name);
		System.out.println(age);

		// 서식화된 출력 - printf
		System.out.printf("아이디 : %s, 비밀번호: %s, 나이: %s, 이름: %s \n", userid, passwd, age, name);

		String fmt = "아이디 : %s, 비밀번호: %s \n";
		System.out.printf(fmt, userid, passwd);

		// double vs float : 오차범위 주의

		float avg1 = 296 / 3.0f;
		double avg2 = 296 / 3.0;
		System.out.println(avg1);
		System.out.println(avg2);
		// 되도록 float 말고 double을 쓰자.

		// 키보드로 데이터 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력하세요");
		userid = sc.nextLine();
		System.out.print("패스워드를 입력하세요");
		passwd = sc.nextLine();
		name = sc.nextLine();
		age = Integer.parseInt(sc.nextLine());

		System.out.printf(fmt, userid, passwd);
	}
}