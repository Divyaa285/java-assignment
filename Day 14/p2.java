
import java.util.Scanner;

class Demo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = sc.nextInt();
        
        System.out.println("Before Swap" + num1 + " " + num2);
        
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
    
        System.out.println("After Swap" + num1 + " " + num2);
       }
}

/*output : 
Enter num1 :
20
Enter num2 :
30
Before Swap20 30
After Swap30 20*/
