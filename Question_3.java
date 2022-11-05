package assignment_4;

class Number {
	private double num; // instance variable  
	
	Number(double num) { // parameterized constructor of initializing num
		this.num = num;
	}
	
	boolean isZero() {
		if(num == 0) // if num is zero return true else false
			return true;
		else 
			return false;
	}
	
	boolean isPositive() {
		if(num > 0) // if num is positive return true else false
			return true;
		else
			return false;
	}
	
	boolean isNegative() {
		if(num < 0) // if num is negative return true else false
			return true;
		else 
			return false;
	}
	
	boolean isOdd() {
		if(num % 2 == 1) // when num is divided by 2 gives remainder 1 then return true else false
			return true;
		else
			return false;
	}
	
	boolean isEven() {
		if(num % 2 == 0) // when num is divided by 2 gives remainder 0 then return true else false
			return true;
		else
			return false;
	}
	
	
	
	boolean isPrime() {
		if(num % 1 != 0) return false; // if num is divided by 1 is not equal to 0 then it must be a decimal
		
		if(num <= 1) return false; // if num is less than or equal to 1 then it is not a prime 
		
		int count = 0;
		for(int i=1 ; i<=num ; i++) { // loop from 1 to num to count all factors of num
			if(num % i == 0)
				count++;
		}
		
		if(count == 2) // if there are only two factor of 2 then num must be a prime
			return true;
		else
			return false;
	}
	
	boolean isArmstrong() {
		if(num % 1 != 0 || num < 0) return false; // for handling edge case where num is decimal or negative 
		
		int temp = (int) num;
		int order = 0; 
		while(temp != 0) { // for calculating the place value of number
			temp /= 10;
			order++;
		}
		
		temp = (int) num;
		int ans = 0;
		while(temp != 0) { 
			int rem = temp % 10; // getting remainder when divided by 10
			temp /= 10; 
			ans += Math.pow(rem, order); // add the ans with rem^order value
		}
		
		if(ans == num) // ans matches num then it is a armstrong
			return true;
		else
			return false;
	}
	
	double getFactorial() {
		int temp = (int) num;
		int ans = 1;
		while(temp > 0) { // multiplying ans with temp and reduce by 1 to get factorial of num
			ans *= temp; 
			temp--; 
		}
		
		return ans;
	}
	
	double getSqrt() {
		return Math.sqrt(num); // to get square root of num
	}
	
	double getSqr() {
		return num*num; // to get square of num
	}
	
	double sumDigits() {
		int temp = (int) num;
		int ans = 0;
		
		while(temp != 0) { // adding each digits to ans
			ans += temp % 10; 
			temp /= 10;
		}
		
		return ans;
	}
	
	double getReverse() {
		int temp = (int) num; 
		int ans = 0;
		
		while(temp != 0) { // getting each element from ones place of temp and adding it to ans and multiplying by 10
			int rem = temp % 10; 
			ans *= 10;
			ans += rem;
			temp /= 10;
		}
		
		return ans;
	}
	
	void listFactor() {
		int temp = (int) num;
		for(int i=1 ; i <= temp ; i++) { 
			if(temp % i == 0) // if temp is divided by i then it is a factor of num
				System.out.print(i+" ");
		}
		
		System.out.println();
	}
	
	void dispBinary() {
		int temp = (int) num; 
		
		while(temp != 0) { 
			int digit = temp & 1;  // temp & 1 gives digit of binary conversion
			System.out.print(digit);
			temp >>= 1; 
		}
		
		System.out.println();
	}
	
	
}
public class Question_3 {

	public static void main(String[] args) {
		
		double num = 14.0;
		Number obj = new Number(num);
		
		System.out.println("check if the number is zero : " + obj.isZero());
		
		System.out.println("check if the number is positive : " + obj.isPositive());
		
		System.out.println("check if the number is negative : " + obj.isNegative());
		
		System.out.println("check if the number is odd : " + obj.isOdd());
		
		System.out.println("check if the number is even : " + obj.isEven());
		
		System.out.println("check if the number is prime : " + obj.isPrime());
		
		System.out.println("check if the number is armstrong : " + obj.isArmstrong());
		
		System.out.println("get factorial of the number : " + obj.getFactorial());
		
		System.out.println("get square root of the number : " + obj.getSqrt());
		
		System.out.println("get sum of the digits of the number : " + obj.sumDigits());
		
		System.out.println("get reverse of the number : " + obj.getReverse());
		
		System.out.print("list all the factors of the number : "); 
		obj.listFactor();
		
		System.out.print("display the binary of the number : "); 
		obj.dispBinary();
	}
}
