package _Jan.simply;

import org.testng.annotations.Test;

public class JavaFile2 {
	// Local variables 
	int a=20,b=20;
	
	@Test
	public void addition(){
			System.out.println("--------------------------------------------------");
			System.out.println("Performed addition on "+a+" & "+b+" ,result="+(a+b));
			System.out.println("--------------------------------------------------");
		}

	@Test
	public void subtraction(){
		System.out.println("-----------------------------------------------------");
		System.out.println("Performed subtraction on "+a+" & "+b+" ,result="+(a-b));
		System.out.println("-----------------------------------------------------");
	}

	@Test
	public void multiplication(){
		System.out.println("--------------------------------------------------------");
		System.out.println("Performed multiplication on "+a+" & "+b+" ,result="+(a*b));
		System.out.println("--------------------------------------------------------");
	}
}
