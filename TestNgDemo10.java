package TestNgFeatures;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNgDemo10 
{
	@Test
	void funA()
	{
	System.out.println("funA of TestNgDemo10");
	}
	@Test
	void funB()
	{
		System.out.println("funB of TestNgDemo10");
		throw new SkipException("skip funB Method");
	}
}
