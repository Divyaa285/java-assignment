
class Demo{
	public static void main(String[]args){
	int a=1;
	for(int i=1;i<=3;i++){
	 for(int j=1;j<=4;j++){
	  if(j%2==1){
	     System.out.print(" * ");
	  }else {
		System.out.print(a+"  " );
	         a++;
	   }
         }
	 	System.out.println();
       }
     }
   }

O/P--
* 1   * 2
 * 3   * 4
 * 5   * 6