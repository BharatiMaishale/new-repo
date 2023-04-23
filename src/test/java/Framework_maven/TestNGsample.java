package Framework_maven;

import org.testng.annotations.Test;

public class TestNGsample {

	@Test(priority=1)
	public void createContact()
	{
		System.out.println("contact created");
		
	}
	
	@Test(priority=3)
	public void modifyContact()
	{
		System.out.println("modified ");
		
	}
	
	@Test(invocationCount = 2)
	public void deleteContact()
	{
		System.out.println("Deleted");
		
	}
	
	/*@Test(priority=1)
	public void createContact()
	{
		System.out.println("contact created");
		
	}
	@Test(dependsOnMethods = createContact)
	public void modifyContact()
	{
		System.out.println("modified ");
		
	}
	
	@Test(priority=2)
	public void deleteContact()
	{
		System.out.println("Deleted");
		
	}
	*/
	
}
