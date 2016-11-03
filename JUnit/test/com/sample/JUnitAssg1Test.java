package com.sample;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@SuiteClasses({GetCharTest.class,GetLengthTest.class,ConcatTest.class})
public class JUnitAssg1Test
{
	
}




//	@BeforeClass
//	public static void beforeClass()
//	{
//		System.out.println("Before Class");
//	}
//	
//	@Before
//	public void before()
//	{
//		System.out.println("Before Test Case");
//	}
	
//	@Test
//	public void concatTest() {
//		
//		StringOperations so1=new StringOperations();
//		String result=so1.concat(s1, s2);
//		assertEquals(s1.concat(s2),result);
		
		
	//}
//	@Test
//	public void getCharTest() {
//		
//		StringOperations so2=new StringOperations();
//		char result=so2.getChar("Hello",3);
//		assertEquals('l',result);	
//	}
//	@Test
//	public void getLengthTest() {
//		
//		StringOperations so3=new StringOperations();
//		int result=so3.getLength("Hello");
//		assertEquals(5,result);	
//	}

//	@After
//	public void after()
//	{
//		System.out.println("After testcase");
//	}
//	
	
	
