package test;

import static org.junit.Assert.*;

import org.junit.Test;

import shahdhw1.ca;
import shahdhw1.pr;

public class carttest {
	@Test
	public void test1() {
		ca c = new ca ();
		assertEquals(0,c.getCount());
	}

	@Test
	public void test2() {
		ca c = new ca ();
		pr p = new pr("web",1,127);
		c.add(p);
		assertEquals(1,c.getCount());
	}
	@Test
	public void test3() {
		ca c = new ca ();
		pr p = new pr("web",1,127);
		pr P= new pr("java",1,100);
		c.add(p);
		c.add(P);
		assertEquals(2,c.getCount());
		assertEquals(227,c.getPrice());
	}

}
