package t2_switch_case;

import java.util.Scanner;

//점수를 입력받아서 학점을 구하시오.
public class Test4_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su = 0;
		char gr;
		
		System.out.print("점수를 입력하세요? ");
		su = sc.nextInt();
		
		switch(su / 10) {
			case 10:
			case 9:
				gr = 'A';
		
			case 8:
				gr = 'B';
				
			case 7:
				gr = 'C';
				
			case 6:
				gr = 'D';
				break;
			default:
				gr ='F';
		}
		
		
		System.out.println("점수 " + su + "는 " + gr + " 학점입니다.");
		
		sc.close();
	}
}
