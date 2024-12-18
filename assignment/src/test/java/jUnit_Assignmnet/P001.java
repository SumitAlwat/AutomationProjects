//W.a.junit program to handled Assert class with all method to check its pass or fail.


package jUnit_Assignmnet;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class P001 {
		
		@Test
		public void test1 () {
			
			System.out.println("test1");
			int a;
			int b;
			int c;
			
			a=10; b=5;
			c=a+b;
			
			assertEquals(15, c);
			assertTrue(false);
			
			int a1[] = {1,2,3,4};
			int a2[] = {1,2,3,4,5};
			assertArrayEquals(a1, a2);
		}
		
	}


