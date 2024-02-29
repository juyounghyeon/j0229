package t4_exam;

public class Test2 {
	 public static void main(String[] args) {
		int lotto;
		String str = "";
		
		for(int i=1; i<=6; i++) {
			lotto = (int)(Math.random()*45) + 1; // 1~45까지의 정수형 난수 6개가 나온다.
			str += lotto + " / "; //  str = str + lotto
		}
 		System.out.println("금주의 로또 번호는? " + str); // 같은 번호는 한번만 나와야 한다. (아직 안배워서 처리모름)
	}
}
