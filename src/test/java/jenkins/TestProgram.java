package jenkins;

import jenkins.Program;
import org.junit.*;

public class TestProgram 
{
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("Before Class");
	}

	@AfterClass
	public static void afterClass()
	{
		System.out.println("After Class");
	}
	
	@Test
	public void checkBoolean()
	{
		System.out.println("------------------------------");
		Program obj = new Program();
		Assert.assertEquals(true, obj.test());
		System.out.println("------------------------------");
	}
}
