package Zarathustra;

import java.util.Scanner;

public class Statement3 {
	public static void main(String[] args) {

		// while

		int i = 1;
		while (i <= 5) { // 조건식
			System.out.println("오늘 너무 추워요");
			++i; // 증감식
		}

		// 무한 루프
		// while (true) {
		// System.out.println("오늘 겁내 춥데이!");
		// }

		// 구구단

		String fmt = "%d x %d =%d\n";

		int dan = 5;
		i = 1;
		while (i <= 9) {
			System.out.printf(fmt, dan, i, dan * i);
			++i;
		}

		// 실행이 한 번도 안 된다고?
		i = 9;
		while (i > 10) {
			System.out.println("while:이 글이 보이나요?");

		}
		// 하지만 이건 다르지
		// 조건이 맞지 않아도 한번은 실행
		i = 9;
		do {
			System.out.println("do-while:이 글이 보이나요?");

		} while (i > 10);

		// 별 출력
		// *****
		// *****
		// *****
		// *****
		// *****

		i = 1;
		int j = 1;

		while (i++ <= 5) {
			while (j++ <= 5) // 후치해야 비교 후 +된다.
				System.out.print("*");
			j = 1;
			System.out.print("\n");
		}

		// *
		// **
		// ***
		// ****
		// *****

		i = 1;
		j = 1;

		while (i <= 5) {
			while (j <= i) {
				System.out.print("*");
				++j;
			}
			++i;
			j = 1;
			System.out.print("\n");
		}

		// *****
		// ****
		// ***
		// **
		// *

		i = 1;
		j = 5;

		while (i <= 5) {
			while (j >= i) {
				System.out.print("*");
				--j;
			}
			++i;
			j = 5;
			System.out.print("\n");
		}

		//반복의 중단 - break
	    i = 1;
	    int sum = 0;
	    fmt = "i: %d, sum: %d \n"
	    while(true) {
	    	if (sum > 100) {
	    		System.out.println(fmt, i, sum);}    		
	    		break;
	    		
	    	sum += i;
	    	++i;
	    }
	    
	    // 반복의 재시작 - continue
	    i = 1;
	    while( i++ <= 100 ) {
//	    	++i;
	    	if ( i % 2 != 0 ) continue;
	    		System.out.println(i);
	    }

	}}
	// while문의 조금 다른 용도
	// for은 배열, while은 데이터의 크기가 정해지지 않았을 때 몽땅 들고 오려는 경우에 쓴다.

	Scanner sc = new Scanner(System.in);while(true)
	{
	System.out.println("작업할 코드를 입력하세요");
	System.out.println("c)reate: reate: 회원 등록");
	System.out.println("r)ead: 회원 조회");
	System.out.println("u)pdate: 회원 수정");
	System.out.println("d)elete: 회원삭제");
	System.out.println("q)uit: 프로그램 종료");
	System.out.print(">>>> ");
	
	String job = sc.nextLine();
	
	// q가 입력되면 while문에서 나감
	// if (job.equals("q")) break;
	
	switch (job) {
	case "c":
		System.out.println("<회원 등록 메뉴를 선택>");
		break;
	case "r":
		System.out.println("<회원 조회 메뉴를 선택>");
		break;
	case "t":
		System.out.println("<회원 수정 메뉴를 선택>");
		break;
	case "d":
		System.out.println("<회원 삭제 메뉴를 선택>");
		break;
	case "q":
		System.out.println("<종료합니다>");
		System.exit(0);
		break;
		
	}
}
