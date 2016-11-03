package com.sample;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class GetLengthTest {

@Parameter(value=0)
public String s3;


@Parameters

public static Object[] data()
{
	Object data[]={"Archana","Xoriant"};
	return (data);
	
}

@Test
public void getLengthTest()
{
	StringOperations so3=new StringOperations();
	int result=so3.getLength(s3);
	assertEquals(s3.length(),result);
	
}

}
