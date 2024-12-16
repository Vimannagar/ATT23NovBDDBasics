package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class AppHooks {
	
	@BeforeAll
	public static void beforeAll()
	{
		System.out.println("Before all is executing");
	}
	
	

	@AfterAll
	public static void afterAll()
	{
		System.out.println("After all is executing");
	}
	
	
	@Before("@sanity or @regression")
	public void beforeHook1()
	{
		System.out.println("Before hook1 is executing");
	}
	
//	@Before(order = -3)
//	public void beforeHook2()
//	{
//		System.out.println("Before hook2 is executing");
//	}
	
	@After("@regression")
	public void afterHook1()
	{
		System.out.println("After hook1 is executing");
	}
	
//	@After(order = 2)
//	public void afterHook2()
//	{
//		System.out.println("After hook2 is executing");
//	}
	
	
	
	@BeforeStep("@sanity")
	public void beforeStepHook()
	{
		System.out.println("Before step is executing");
	}
	
	
	@AfterStep("@functional")
	public void afterStepHook()
	{
		System.out.println("After step is executing");
	}
	
	

}
