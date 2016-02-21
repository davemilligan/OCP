package com.bitshiftbitwise;

public class BitShift {
	public static void main(String[] args) {
		int i = 1067;
		int bytei = 0b10000101011;
		System.out.println(bytei);
		System.out.println(Integer.toBinaryString(i));
		System.out.println(i >> 2);
		System.out.println(Integer.toBinaryString(i >> 2));
		System.out.println(i << 2);
		System.out.println(Integer.toBinaryString(i << 2));
		
	
	}
}
