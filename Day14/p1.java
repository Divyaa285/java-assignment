
import java.util.*;
class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number : ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd Number : ");
		int b = sc.nextInt();
		for(int i = a; i <= b; i++) {
			System.out.print(i% 2 == 1 ? i + " " : "");
		}
	}
}

/* output:
Enter 1st Number :
4
Enter 2nd Number :
60
5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49 51 53 55 57 59*/