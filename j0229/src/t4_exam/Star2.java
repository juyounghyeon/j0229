package t4_exam;

/*
  	9	8 7
  	6 5 4
  	3 2 1 -> 1~9까지 9번 찍는데 3열씩 (for문을 두개 써야한다(이중for문 사용).) 바깥쪽 for문이 행, 안쪽 for 문이 열.
 */

public class Star2 {
	public static void main(String[] args) {
		int su = 10;
		
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				su--; //su 는 누적
				System.out.print(su + " ");
			}
			System.out.println();
		}
	}
}
