package com;

import org.junit.Assert;
import org.junit.Test;
import com.HelloApp; 
public class HelloAppTest {
 
	@Test
	public void testNameValue() {
 
		HelloApp obj = new HelloApp();
		Assert.assertEquals("This is SPRING Maven Project", obj.getPropName());
 
	}
}
