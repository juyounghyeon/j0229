package t4_exam;

import java.util.Scanner;

//// 주사위 숫자 맞추기 게임 (1~6까지의 자연수) 난수를 발생하세요.
public class Test4_3 {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int su, rand; //항상 변수를 선언 (바깥에도 사용할거야)
		
		while(true) {
			System.out.print("수를 입력하세요? (1~6까지 입력하세요.)");
			su = sc.nextInt();
			
			/*
			if(su > 6 || su < 1) {    //탈출을위해 ||하나만 잘못되도 틀리니까 or
			System.out.println("1~6까지의 수를 입력하세요.");
			}
			else break;
			*/
			if(su >= 1 && su <= 6) break;
			System.out.println("1~6까지의 수를 입력하세요.");
		}
		
		rand = (int)(Math.random()*6) + 1;
		
		if(su == rand) System.out.println("정답입니다!");
		else System.out.println("틀렸습니다. 출력된 주사위 눈금은 " + rand + "입니다.");
		
		sc.close();
	}
}


