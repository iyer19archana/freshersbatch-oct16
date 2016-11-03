package com.sample;


class StringOperations
{
	
	
	String concat(String s1,String s2)
	{
		String s3=s1.concat(s2);
		return s3;
	}
	char getChar(String s1,int index)
	{
		return s1.charAt(index);
	}
	int getLength(String s1)
	{
		return s1.length();
	}
	
}
public class JUnitAssg1 {

	public static void main(String[] args) {
		StringOperations so=new StringOperations();
		String s1="Hello";
		String s2="World";
		String s3=so.concat(s1,s2);
		System.out.println(s3);
		System.out.println(so.getChar(s1,3));
		System.out.println(so.getLength(s1));
	}
}
