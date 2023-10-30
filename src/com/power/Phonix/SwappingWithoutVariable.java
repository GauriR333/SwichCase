package com.power.Phonix;

public class SwappingWithoutVariable {

	public static void main(String[] args) {
		int first = 40;
		int second = 30;
		first = first + second;
		second = first - second;
		first = first - second;
		System.out.println(first);
		System.out.println(second);
	}

}
