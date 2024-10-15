class Demo{
		public static void main (String[]args){
		int a=4;
	       for(int i=1;i<=4;i++){
		for(int j=1;j<=4;j++){
		if(j<i){
			System.out.print("  ");
			}else{
			System.out.print(a+" ");
			}
		    }	
			a--;
	                System.out.println(" ");
			
		}
	}
}

/*output: 
	 4 4 4 4
           3 3 3
             2 2
               1*/