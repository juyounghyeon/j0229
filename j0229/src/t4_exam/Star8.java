package t4_exam;

/* *****
 *  ****
 *   ***
 *    **
 *     *   	
 ->  공백을 찍고, 별을 찍는다. 열for문 두개(바깥쪽, 별찍는for 문)
 */

public class Star8 {
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i-1; j++) {			
				System.out.print(" ");
			}
			for(int j=1; j<=6-i; j++) {			
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
