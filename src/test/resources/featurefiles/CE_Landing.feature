Feature: Sign In page of Compliance Expert


  Scenario Outline: Login to the page
    When Validate the Sign In button functionality by entering valid,invalid credentials <EmailAddress> <Password> and  Verify the signIn status of Compliance Expert <Toaster>
    And Validate the card functionality <CompanyName>
    And  validate the signIn to company functionality <ToasterMessage>
    And Validate the switch company functionality
    Examples:
      | EmailAddress                 | Password     | Toaster | CompanyName | ToasterMessage                     |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Soda labz" | "Sign In Into Company Successfull" |
