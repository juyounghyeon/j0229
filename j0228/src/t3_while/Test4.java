package t3_while;

//1~100까지의 10항씩의 합을 늘려가시오.
/*
 * 1 ~ 10 : 55
 * 1 ~ 20 : 210
 * 1 ~ 30 : 
 * 1 ~ 40 : 
 * 1 ~ 50 : 
 * 1 ~ 60 : 
 * 1 ~ 70 : 
 * 1 ~ 80 : 
 * 1 ~ 90 : 
 * 1 ~ 100 : 5050
 *
 */
public class Test4 {
public static void main(String[] args) {
	int i = 0, tot = 0;
	
		while(i < 10) {
			i = i + 1;   //i++, ++i, i+=1
			tot = tot + i; // tot += i
		}
		System.out.println("1~10까지의 합은? " + tot);
		
		while(i < 20) {
			i = i + 1;   
			tot = tot + i; 
		}
		System.out.println("1~20까지의 합은? " + tot);
		while(i < 30) {
			i = i + 1;   
			tot = tot + i; 
		}
		System.out.println("1~30까지의 합은? " + tot);
		while(i < 40) {
			i = i + 1;   
			tot = tot + i; 
		}
		System.out.println("1~40까지의 합은? " + tot);
		while(i < 50) {
			i = i + 1;   
			tot = tot + i; 
		}
		System.out.println("1~50까지의 합은? " + tot);
		while(i < 60) {
			i = i + 1;   
			tot = tot + i; 
		}
		System.out.println("1~60까지의 합은? " + tot);
		while(i < 70) {
			i = i + 1;   
			tot = tot + i; 
		}
		System.out.println("1~70까지의 합은? " + tot);
		while(i < 80) {
			i = i + 1;   
			tot = tot + i; 
		}
		System.out.println("1~80까지의 합은? " + tot);
		while(i < 90) {
			i = i + 1;   
			tot = tot + i; 
		}
		System.out.println("1~90까지의 합은? " + tot);
		while(i < 100) {
			i = i + 1;   
			tot = tot + i; 
		}
		System.out.println("1~100까지의 합은? " + tot);
	}
}
