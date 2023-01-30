package org.junit.framework;

import org.junit.Test;

public class samplej1 {
	public static String s = "bala";
	@Test
	public void tc1() {
	char char1=s.charAt(0);
	if (char1 == 'b'){
		System.out.println("tc1");
	}
	}
	@Test
	public void tc2() {
		char char2=s.charAt(1);
		if (char2 == 'a'){
			System.out.println("tc2");
		}
	}
	@Test
	public void tc3() {
		char char3=s.charAt(2);
		if (char3 == 'l'){
			System.out.println("tc3");
		}
	}
	@Test
	public void tc4() {
		char char4=s.charAt(3);
		if (char4 == 'a'){
			System.out.println("tc4");
		}
	}
}
