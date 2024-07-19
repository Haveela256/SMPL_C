Feature: Super Admin Discovery module


  Scenario Outline: Open Discovery module of a company
    When Validate the Sign In button functionality by entering valid,invalid credentials <EmailAddress> <Password> and  Verify the signIn status <Toaster>
    And Validate the Company functionality <CompanyCard> <ToasterMessage>
    And Verify the Company page
    When Click on the discovery  module
    And Validate the Download icon functionality <ScopeDocFileName>
    And validate the pagination of scope tab

    Examples:
      | EmailAddress         | Password   | Toaster | CompanyCard                 | ToasterMessage                     | ScopeDocFileName |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "random3.test@yopmail.com"  | "Sign In Into Company Successfull" | "Scope File"     |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "vassar.qa@yopmail.com"     | "Sign In Into Company Successfull" | "Evidence"       |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "Vassar.tester@yopmail.com" | "Sign In Into Company Successfull" | "new"            |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "testers@yopmail.com"       | "Sign In Into Company Successfull" | "Scope"          |
