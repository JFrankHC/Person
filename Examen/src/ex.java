import java.util.Scanner;

public class ex {
	public static void main(String[] args) {
		
	}
	    // Write your code here
	    
	    int i;
	    Scanner n = new  Scanner(System.in);
	    
	    System.out.println("Ingresa un numero");
	    i= n.nextInt();
	    if(i%3==0 && i%5==0){
	        System.out.println("FizzBuzz");
	    }
	    if(i%3==0 && i%5!=0){
	        System.out.println("Fizz");
	    }
	     if(i%5==0 && i%3!=0){
	        System.out.println("Buzz");
	    }
	    if(i%3!=0 || i%5!=0){
	        System.out.println(i);
	    }
	    
	    
	    
	    
	    

	    }
	

}
