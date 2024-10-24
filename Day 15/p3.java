import java.util.Scanner;

class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Distance : ");
		int Distance = sc.nextInt();
		System.out.println("Enter Time: ");
		int Time = sc.nextInt();
		int Velocity = Distance/Time;
		System.out.println("The velocity of the particle roaming in space is "+Velocity+ "m/s");
		}
}

/*output :
Enter Distance :
100
Enter Time:
20
The velocity of the particle roaming in space is 5m/s*/