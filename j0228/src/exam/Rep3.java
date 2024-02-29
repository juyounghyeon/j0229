package exam;

import java.util.Scanner;

// 2자리 숫자를 입력받아서, 입력받은 숫자를 거꾸로 1이 될때까지 출력하되, 한줄에 5개씩 출력하는 프로그램을 만드시오.
public class Rep3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int i = 0, sum = 0, cnt = 0;
		
		System.out.print("첫번째수를 입력하세요? ");
		
		int num1;
		num1 = sc.nextInt();
		
		System.out.print("두번째수를 입력하세요? ");
		
		int num2;
		num2 = sc.nextInt();
		
		if(num1 < num2) { 
			cnt = num2 =num1 -1;
			
			while(i < cnt) {
				i = i + 1;
				num1 = num1 + 1;
				sum = sum + num1;
			}
			System.out.println("더한 값은 " + sum + "입니다.");
		}
		
		
		
		
		sc.close();
	}
}
