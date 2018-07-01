package initial;

import static org.junit.Assert.*;

import org.junit.Test;

import hello.Hello;
import junit.framework.Assert;

public class HelloTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	public void test2plus3()
	{
		Assert.assertFalse("答案應該是5",Hello.add(2, 3)==5);
	}

}
