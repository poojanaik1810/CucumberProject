package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void AllSetUp() {
		System.out.println("Before - for All");
	}
	
	@Before("@NetBanking")
	public void NetBankingSetUp() {
		System.out.println("Before - Hook for NetBanking SetUp");
	}
	
	@Before("@Mortage")
	public void MortageSetUp() {
		System.out.println("Before - Hook for Mortage SetUp");
	}
	
	@After
	public void Allteardown() {
		System.out.println("After - for All");
	}
	
	@After("@NetBanking")
	public void NetBankingteardown() {
		System.out.println("After - Hook for NetBanking SetUp");
	}
	
	@After("@Mortage")
	public void AfterSetUp() {
		System.out.println("After - Hook for Mortage SetUp");
	}
	
}

