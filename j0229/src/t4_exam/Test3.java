package t4_exam;

import java.util.Scanner;

// 숫자 맞추기 게임 (1~100까지의 자연수) 기회는 5번 (=반복문 5번)
public class Test3 {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int rand = (int)(Math.random()*100) + 1; // 1~100까지 난수하나를 생성
		int cnt = 1, su;
		
		while(cnt <= 5) {
			System.out.print(cnt + ". 수를 입력하세요?(1~100) ");
			su = sc.nextInt();
			
			if(su == rand) {
				System.out.println("맞혔습니다.....짝짝짝~~");
				break; // 맞췄으니까 빠져나와야지
			}
			else if(su > rand) System.out.println("더 작은수를 넣으세요!"); // 내가 더 큰수를 입력함
			//else if 안써도됨
			else System.out.println("더 큰수를 넣으세요!");
			cnt++; //하나추가해서 탈출해야함
		}
		if(cnt == 6) System.out.println("정답은 " + rand + "였습니다, 아쉽지만 다음기회에....");//5로하면 못빠져나와
		 
	
	 
	 sc.close();
	 }
}
