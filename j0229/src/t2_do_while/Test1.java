package t2_do_while;

/* 
  do {
  	수행할 내용...
  } while(조건식);
  
 */

public class Test1 {
	 public static void main(String[] args) {
		int i = 10;
		
		do {
			i++;
			System.out.println(i);
		} while(i < 10);   //do while 은 한번은 무조건 수행
	}
}
