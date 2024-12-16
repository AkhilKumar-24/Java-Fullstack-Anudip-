package akhil ;
import java.util.*;
public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int N = sc.nextInt();
		if(N%2 == 0) {
			System.out.println("The Given Number Is Even");
		}
		else {
			System.out.println("The Given Number Is Odd");
		}
	}
}
