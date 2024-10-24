import java.util.*;
class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number : ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd Number : ");
		int b = sc.nextInt();
		for(int i = a; i <= b; i++) {
			System.out.print(i% 2 == 0 ? i + " " : "");
		}
	}
}

/*output :
Enter 1st Number :
4
Enter 2nd Number :
60
4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50 52 54 56 58 60*/