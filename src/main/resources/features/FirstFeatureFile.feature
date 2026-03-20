		Feature: Application Login
		
		@RegressionTest @NetBanking
  	Scenario: TC-1: Admin Page default Login
    Given User is on NetBanking landing page
    When User login into application with "Admin" and password "ABC"
    Then Home Page is displayed
    And Cards are displayed
    
    @SmokeTest @RegressionTest
    Scenario: TC-2: User Page default login
		Given User is on NetBanking landing page
		When User login into application with "User" and password "ABSS"
		Then Home Page is displayed 
		And Cards are displayed
    
    @SmokeTest @Mortage
    Scenario Outline: TC-3: User Page default Login
    Given User is on Mortage landing page
    When User login into application with "<Username>" and password "<Password>" combination
    Then Home Page is displayed
    And Cards are displayed
    
    Examples:
    | Username | Password |
    | DebitUser | 1111 | 
    | 111 | Q11Q | 
    
     @SmokeTest 
    Scenario: TC-4: User Page default Sign Up
		Given User is on Practice landing page
		When User SignUp into application 
		| P1 |
		| P2 |
		| P3 |
		| P4 |
		| P5 |
		Then Home Page is displayed 
		And Cards are displayed
    
    
    
    


