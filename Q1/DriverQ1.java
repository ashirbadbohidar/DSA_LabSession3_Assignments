package com.greatlearning.lab3.Q1;


public class DriverQ1 {
	
	
	public static void main(String[] args)
	{
		BalancingBrackets balancingBrackets = new BalancingBrackets();
		String bracketExpression = "([[{}]])]";
		
		Boolean result;
		
		result = balancingBrackets.checkingBracketsBalanced(bracketExpression);
		
		if(result)
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets");
	}
}