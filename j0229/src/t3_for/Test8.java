package t3_for;

// 알아두면 좋은것
public class Test8 {
	public static void main(String[] args) {
		int cnt = 0; 
		for(int i = 1; i <=3; i++) {
			for(int j=1; j<=4; j++) {
				cnt++;
				System.out.println(cnt + " , i = " + i + " , j = " + j);
				// 앞의 문장을 6번 수행후 탈출 시키고자 한다.
				if(cnt == 6) return; // return : 현재 메인 메소드를 탈출한다. 밑에 출력은 안됨.. 
			}
			System.out.println();
		}
		System.out.println("작업끝....."); // 탈출하고 싶은곳
	}
}
