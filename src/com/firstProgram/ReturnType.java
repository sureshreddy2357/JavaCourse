package com.firstProgram;

public class ReturnType {
        
	
	public int ClassName() {
	    int x = 5;
	    int y = 8;
	    
	    System.out.println("x = "+ x +"\ny="+ y);
	     
	    if (x<y)
	    	return x;
	    else
	    	return y;
	
	}
	
	public static void main(String[] args) {

		ReturnType obj = new ReturnType ();
		   
		int result = obj.ClassName();
		 
		System.out.println("the greater number among x and y is :" + result);
		
		
		
		
		
		
	}

}
