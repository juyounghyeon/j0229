package t1_while;

// 무한 loop
public class Test3_4 {
	public static void main(String[] args) {
		int i = 0;
		boolean run = true; //run이라는 변수를 논리형 변수로 true값을 줬다.
		
		while(run) {
			i++;
			System.out.println(i + ".안녕");
			
			//if(i == 10) break;
			if(i == 10) run = false; //거짓으로 해서 빠져나간다.
		}
	
	}
}
