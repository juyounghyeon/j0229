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
public class Test4_2 {
public static void main(String[] args) {
	int i = 0, tot = 0;
	
		while(i < 100) {
			i = i + 1;   //i++, ++i, i+=1
			tot = tot + i; // tot += i
			if(i % 10 == 0) {
				System.out.println("1~ "+ i + "의 합은?" + tot + "입니다.");
			};
		}
		
		System.out.println("1~100까지의 합은? " + tot);
}
}
