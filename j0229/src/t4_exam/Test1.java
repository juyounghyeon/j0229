package t4_exam;

// 난수(무작위수) 생성
public class Test1 {
	public static void main(String[] args) {
	 double rand	= Math.random(); //난수 math라는 개체가 하나 만들어진다. 0이상 ~ 1미만의 실수형 난수가 나온다.
	 System.out.println("0. rand : " + rand);

	 for(int i=1; i<=5; i++) {
		 System.out.println( i + ".rand : " + Math.random()); //10번만 출력
		 
	 }
	 System.out.println();
	 
	 for(int i = 1; i<=5; i++) {
		 System.out.println(i + ".rand : " + Math.random() * 10); // 어차피 0이상 ~ 10미만의 실수형 난수가 나온다.
	 }
	 System.out.println();
	 
	 for(int i = 1; i<=5; i++) {
		 System.out.println(i + ".rand : " +(int)(Math.random() * 10)); // 어차피 0이상 ~ 10미만의 정수형 난수가 나온다. 나온 결과 전체를 정수로 만들어야한다.
	 }
	 System.out.println();
	 
	 for(int i = 1; i<=5; i++) {
		 System.out.println(i + ".rand : " +((int)(Math.random() * 10) + 1)); // 1이상 ~ 10이하의 정수형 난수가 나온다.
	 }
	 System.out.println();
	 
	 for(int i = 1; i<=5; i++) {
		 System.out.println(i + ".rand : " +((int)(Math.random() * 45) + 1)); // 1이상 ~ 45이하의 정수형 난수가 나온다. 
		 }
	}
}
