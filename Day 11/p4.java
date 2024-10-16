class Demo{
		public static void main(String[]args){
		int a=0;
		for(int i=1;i<=4;i++){
		for(int j=1;j<=i;j++){
		if(j>i){
			System.out.print(" ");
			}else{
			System.out.print(a+" ");
		    }
    		}
			System.out.println(" ");
	   }
	}
}

/*0
  0 0
  0 0 0
  0 0 0 0*/
