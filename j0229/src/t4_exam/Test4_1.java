package t4_exam;

import java.util.Scanner;

//// 주사위 숫자 맞추기 게임 (1~6까지의 자연수) 난수를 발생하세요.
public class Test4_1 {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		System.out.print("수를 입력하세요? (1~6까지 입력하세요.)");
		int su = sc.nextInt();
		
		int rand = (int)(Math.random()*6) + 1;
		
		if(su == rand) System.out.println("정답입니다!");
		else System.out.println("틀렸습니다. 출력된 주사위 눈금은 " + rand + "입니다.");
		
		sc.close();
	}
}


