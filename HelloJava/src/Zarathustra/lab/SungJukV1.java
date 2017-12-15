package Zarathustra.lab;

import java.util.Scanner;

/*
 * 성적 처리 프로그램 V1
 * 간략한 성적처리를 수행하는 프로그램
 * 입력: 이름, 국어, 영어, 수학
 * 처리: 총점, 평균, 학점
 * 출력: 이름, 국어, 영어, 수학, 총점, 평균, 학점
 * 
 */
public class SungJukV1 {
	public static void main(String[] args) {
		// 변수 선언
		String name; // 이름
		int kor; // 국어
		int eng; // 영어
		int mat; // 수학
		int tot; // 총점
		double avrg; // 평균점
		char grd; // 학점

		// 성적 처리
		// 데이터 입력 - 입력 자료는 하드 코딩 먼저 해서 테스트한 후 입력 방식으로 전환(테스트 코드).

		// name = "유리";
		// kor = 100;
		// eng = 60;
		// mat = 40;

		// 데이터 입력
		Scanner sc = new Scanner(System.in);

		System.out.println(" 성적 처리 프로그램 v1 ");
		System.out.println("----------------");

		System.out.print("이름을 입력하세요: ");
		name = sc.nextLine();
		System.out.print("국어 점수를 입력하세요: ");
		kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요: ");
		eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세요: ");
		mat = sc.nextInt();

		// 객체 닫기
		sc.close();

		// 촘점, 평균, 학접 계산
		tot = kor + eng + mat;
		// avrg = (kor + eng + mat) / 3;
		avrg = (double) tot / 3; // 3.0
		grd = (avrg >= 90) ? '수' : (avrg >= 80) ? '우' : (avrg >= 70) ? '미' : (avrg >= 60) ? '양' : '가';

		// 결과 출력
		String fmt = "이름 : %s, 국어: %d, 영어: %d, 수학: %d \n";
		// fmt = fmt + "총점: %d, 평균: %.1f, 학점: %c \n";
		fmt += "총점: %d, 평균: %.1f, 학점: %c \n";

		System.out.printf(fmt, name, kor, eng, mat, tot, avrg, grd);

	}
}
