package com.sample;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;



	@RunWith(Parameterized.class)
	public class GetCharTest {
	@Parameter(value=0)
	public String s1;
	@Parameter(value=1)
	public int x;

	@Parameters
	public static Collection <Object[]> data()
	{
		Object data[][]={{"Archana",4},{"Xoriant",2},{"Solutions",5}};
		return Arrays.asList(data);
		
	}
	
	@Test
	public void getCharTest() {
		
		StringOperations so2=new StringOperations();
		char result=so2.getChar(s1, x);
		assertEquals(s1.charAt(x),result);	
	}	
	
}
