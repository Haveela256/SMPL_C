Feature: Super Admin Discovery module


  Scenario Outline: Open Discovery module of a company
    When Validate the Sign In button functionality by entering valid,invalid credentials <EmailAddress> <Password> and  Verify the signIn status <Toaster>
    And Validate the Company functionality <CompanyCard> <ToasterMessage>
    And Verify the Company page
    When Click on the discovery  module
    When Click on the Data Flow Diagrams tab
    And Validate the Download icon functionality <DataFlowFileName> of data flow tab
    And validate the pagination of scope tab

    Examples:
      | EmailAddress         | Password   | Toaster | CompanyCard                 | ToasterMessage                     | DataFlowFileName  |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "random3.test@yopmail.com"  | "Sign In Into Company Successfull" | "Data flow image" |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "vassar.qa@yopmail.com"     | "Sign In Into Company Successfull" | "Data flow image"                |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "Vassar.tester@yopmail.com" | "Sign In Into Company Successfull" | "data test"       |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "vassar.labs@yopmail.com"   | "Sign In Into Company Successfull" | "pdf"             |
