import java.util.Scanner;
import java.util.Vector;

public class Question_1 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("enter vector size : ");
		int n = scn.nextInt(); // user input vector size
		scn.nextLine(); 
		
		Vector v = new Vector(n); // declaring and initializing vector of size n
		
		System.out.println("Input elements of the vector and if you want to exit then type 'exit' :");
		for(int i=0 ; i<n ; i++) {
			String element = scn.nextLine(); // input elements
			if(element.equals("exit")) { // if input string is "exit" then stop adding elements
				break;
			}
			v.addElement(element); // add elements to the vector
		}
		
		
		System.out.print("Elements of the vector : ");
		for(Object element : v) { // prints elements of the vector
			System.out.print(element + ", ");
		}
	}
}
