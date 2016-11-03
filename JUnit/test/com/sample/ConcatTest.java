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
public class ConcatTest {
@Parameter(value=0)
public String s1;
@Parameter(value=1)
public String s2;

@Parameters
public static Collection <Object[]> data()
{
	Object data[][]={{"Archana","Iyer"},{"Xoriant","Solutions"}};
	return Arrays.asList(data);
	
}
@Test
public void concatTest() {
	
	StringOperations so1=new StringOperations();
	String result=so1.concat(s1, s2);
	assertEquals(s1.concat(s2),result);
}
}