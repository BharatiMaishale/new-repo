package Framework_maven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardassert {
    @Test
    
	public void createCustomer()
	{
		System.out.println("step1");
		System.out.println("step2");
		Assert.assertEquals(false, true);
		System.out.println("step3");
		System.out.println("step4");
			
	}
	@Test
	public void m1()
	{
		String expName="Bharati";
		String actName="BharatiM";
		Assert.assertEquals(expName, actName);
	}
	
}
