package Zarathustra.lab;

public class aa {
	public static void main(String[] args) {

		char ch = '정';
		// 문자와 숫자 간 변환
		System.out.println(ch);
		System.out.println((int) ch);

		ch = 97;
		// 문자와 숫자 간 변환
		System.out.println(ch);
		System.out.println((char) ch);

		String chars = "abc";
		System.out.println(chars.charAt(1));
		System.out.println((int) chars.charAt(1));

		// 특수문자 표현 - escape sequence
		System.out.println("가     나");
		System.out.println("가\t나");// 탭문자
		System.out.println("가\n나"); // 줄바꿈문자
		System.out.println("가\"나"); // 큰따옴표 문자
		System.out.println("가\'나"); // 작은따옴표 문자

	}
}
