package com.sanjeet.test.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author KSanjeet
 * @version Java-8
 * Java program to user joiner 
 * 
 * Input- This is a java program
 * Output- This-is-a-java-program
 * 
 */
public class StringJoinerExample {
	public static void main(String[] args) {
		List<String> inputList= Arrays.asList("This", "is", "sanjeet");
		String output = inputList.stream().collect(Collectors.joining("-"));
		System.out.println(output);
		
	}

}
