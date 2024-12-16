package akhil;
import java.util.*;
public class DollarConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Dollar1 & Cent1: ");
		int dollar1= sc.nextInt();
		int cent1 = sc.nextInt();
		System.out.println("Enter The Dollar2 & Cent2: ");
		int dollar2= sc.nextInt();
		int cent2= sc.nextInt();
		dollar1*=100;
		cent1+=dollar1;
		dollar2*=100;
		cent2+=dollar2;
		int finaldollar=(cent1+cent2)/100;
		int finalcent=(cent1+cent2)%100;
		System.out.println("\nTotal Dollars: "+finaldollar+"\nTotal Cents: "+finalcent);

	}

}
