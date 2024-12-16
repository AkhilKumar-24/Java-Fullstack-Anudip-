package akhil ;
import java.util.*;
public class Tictock {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int n =sc.nextInt();
		if(n>=1 && n<=9) {
		int row=(n-1)/3;
		int coloumn=(n-1)%3;
		System.out.println("\nThe Given Number Is In The Row: "+row+"\nThe Given Number Is In The Coloumn: "+coloumn);
	}
		else {
			System.out.println("Invalid Input");
		}
	}


}