package org.sonatype.examples;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class testFirstChars {
	removeAproblem test;

	@Before
	public void instantiation() {
		test = new removeAproblem();

	}

	@Test
	public void testNoChar() {

		assertEquals("", test.remove(""));

	}

	@Test
	public void testOneChar() {

		assertEquals("", test.remove("A"));
		assertEquals("B", test.remove("B"));
	}

	@Test
	public void testTwoChar() {

		assertEquals("B", test.remove("AB"));
		assertEquals("", test.remove("AA"));
	}

	@Test
	public void testMultiplechar() {

		assertEquals("BCD", test.remove("ABCD"));
		assertEquals("CD", test.remove("AACD"));
		assertEquals("BCD", test.remove("BACD"));
		assertEquals("BBA", test.remove("AABBA"));
		assertEquals("BBAA", test.remove("BBAA"));
	}

}
