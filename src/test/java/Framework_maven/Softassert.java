package Framework_maven;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert {
	 @Test

		public void createContact()
		{
			System.out.println("step1");
			System.out.println("step2");
			SoftAssert st=new SoftAssert();
			Assert.assertEquals(true, true);
			System.out.println("step3");
			System.out.println("step4");		
		}
		@Test
		public void modify()
		{
			System.out.println("step5");
			System.out.println("step6");
		}
		
}
