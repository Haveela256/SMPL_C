Feature: Super admin Company details Module


  Scenario Outline: Open Company details of a company
    When Validate the Sign In button functionality by entering valid,invalid credentials <EmailAddress> <Password> and  Verify the signIn status <Toaster>
    And Validate the Company functionality <CompanyCard> <ToasterMessage>
    And Click on the company details module
    And Verify the company details page

    Examples:

      | EmailAddress         | Password   | Toaster | CompanyCard                 | ToasterMessage                     |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "random3.test@yopmail.com"  | "Sign In Into Company Successfull" |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "vassar.qa@yopmail.com"     | "Sign In Into Company Successfull" |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "Vassar.tester@yopmail.com" | "Sign In Into Company Successfull" |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "vassar.labs@yopmail.com"   | "Sign In Into Company Successfull" |
