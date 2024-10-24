import java.util.Scanner;

class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2 : ");
		int num2 = sc.nextInt();
		System.out.print(num1 > num2 ? "Min : " + num2 : num1 == num2 ? "Equal" : "Min : " + num1);
	}
}

/*output :
 Enter num1 :
56
Enter num2 :
99
Min : 56*/