class Demo{
    public static void main(String[] args){
        int a = 5; 
        int b;
	 for(int i= a; i>= 1; i--) {
            b= i;
            for(int j=1; j<=i; j++) {
                System.out.print(b+ " ");
                b--;
            }
            	System.out.println();
		}
	}
}

/*5 4 3 2 1
  4 3 2 1
  3 2 1
  2 1
  1*/