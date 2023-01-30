package org.junit.framework;

import org.junit.Assert;
import org.junit.Test;

public class samplej2 {
	 String s = "bala";
	@Test
	public void tc5() {
		Assert.assertTrue(s.contentEquals("bala"));
		System.out.println("tc5");
	
	}
	@Test
	public void tc6() {
		Assert.assertFalse(s.contentEquals("balu"));
		System.out.println("tc6");
		
	}
	@Test
	public void tc7() {
		Assert.assertEquals(s,"bala");
		System.out.println("tc7");
		
	}
	@Test
	public void tc8() {
		Assert.assertTrue(s.contentEquals("bala"));
		System.out.println("tc8");
			
		
	}
}
