package t4_exam;

import java.util.Scanner;

//// 주사위 숫자 맞추기 게임 (1~6까지의 자연수) 난수를 발생하세요.
public class Test4_4 {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int su, rand, ans; //항상 변수를 선언 (바깥에도 사용할거야)
		 while(true){		 
			 while(true) {
				 System.out.print("출력될 주사위 눈금을 입력하세요? ");
				 su = sc.nextInt();
				 
				 if(su >= 1 && su <= 6) break;
				 System.out.println("1~6까지의 수를 입력하세요.");
		 
		}
		
		rand = (int)(Math.random()*6) + 1; // 정답이 달라진다.
		
		if(su == rand) System.out.println("정답입니다!");
		else System.out.println("틀렸습니다. 출력된 주사위 눈금은 " + rand + "입니다.");
		
		System.out.print("계속 할까요?(1:계속/0:그만) ");
		ans = sc.nextInt();
		
		if(ans == 0) break;  //0넣으면 그만! 0과 1로만 하는게 아님 0아니면 계속 반복
		System.out.println();
	 }
		 System.out.println("작업끝.....");
		
		sc.close();
	}
}


