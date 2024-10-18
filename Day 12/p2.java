import java.util.*;

class Demo{
	public static void main(String []args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number a");
	int a=sc.nextInt();
	System.out.println("enter number b");
	int b=sc.nextInt();
	Codex chavi= new Codex();
	chavi.Multiplication(a,b);
	chavi.Division(a,b);
	}
}

class Codex{
		void Multiplication(int a,int b){
			System.out.println("Multiplication is : "+(a*b));
			}
		void Division(int a,int b){
		if(b>a){
			System.out.println("Division is : "+(b/a));
			}else{
			System.out.println();
    		 	}
 		}
}

/*10
enter number b
20
Multiplication is : 200
Division is : 2*/

