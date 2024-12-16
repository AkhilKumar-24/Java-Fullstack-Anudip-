package akhil;

public class Calculator {
	    
	    public int add(int a, int b)
	    {
	        return a + b;
	    }
	    public int add(int a, int b, int c)
	    {
		 return a + b + c;}

	    public double add(double a, double b) 
	    {
	        return a + b;
	    }

	public static void main(String[] args)
	{
	        Calculator calc = new Calculator();
	        int sum1 = calc.add(35, 45);
	        System.out.println("Sum of two integers: " + sum1);
	        int sum2 = calc.add(6, 8, 12);
	        System.out.println("Sum of three integers: " + sum2);
	        double sum3 = calc.add(6.6, 8.6);
	        System.out.println("Sum of two double: " + sum3);
	}

	}
