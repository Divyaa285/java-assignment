
import java.util.*;
class Demo{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number");
	int a = sc.nextInt();
	 for(int i = 1; i<=10; i++){
		if(i%2==0){
			System.out.println("Cube of "  +i  +":"  +(i*i*i)  +" and Square of "  +i  +":"  +(i*i));
	         }else {
			System.out.println(" ");
		}
	    }
	}
    }

/*Enter the Number
10

Cube of 2:8 and Square of 2:4

Cube of 4:64 and Square of 4:16

Cube of 6:216 and Square of 6:36

Cube of 8:512 and Square of 8:64

Cube of 10:1000 and Square of 10:100*/