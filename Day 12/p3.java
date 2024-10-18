import java.util.*;

class Demo{
	public static void main(String []args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number a");
	int a=sc.nextInt();
	System.out.println("enter number b");
	int b=sc.nextInt();
	Codex chavi= new Codex();
	chavi.square(a,b);
	chavi.cube(a,b);
	}
}

class Codex{
		void cube(int a,int b){
		int x=a*a*a;
		int y=b*b*b;
		int sum=x+y;
			System.out.println("addition of cube is: "+sum);
			}
		void square(int a,int b){
		
		int x1=a*a;
		int y1=b*b;
		int sum1=x1-y1;
			System.out.println("substraction of square is:"+sum1);

		}	
}

/*enter number a
10
enter number b
20
substraction of square is:-300
addition of cube is: 9000*/
