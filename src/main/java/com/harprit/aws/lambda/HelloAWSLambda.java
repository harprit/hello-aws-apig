package com.harprit.aws.lambda;

public class HelloAWSLambda {

	public void handler(String input) {
		String message = String.format("Hello %s", input);
		
		System.out.println(message);
	}
}
