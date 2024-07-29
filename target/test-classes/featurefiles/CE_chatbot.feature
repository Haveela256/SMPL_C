Feature: Compliance Expert chatbot

  Scenario Outline: Validate the chatbot
    When Validate the Sign In button functionality by entering valid,invalid credentials <EmailAddress> <Password> and  Verify the signIn status of Compliance Expert <Toaster>
    And Validate the card functionality <CompanyName>
    And  validate the signIn to company functionality <ToasterMessage>
    And Validate the GenAi chatbot
    And validate mic icon
    And validate user profile button
    And validate manage users button
    And validate the maximize icon
    And validate collapse icon
    And validate textfield <TextfieldData>
    And validate send icon
    And validate company details button
    Examples:
      | EmailAddress                  | Password     | Toaster | CompanyName | ToasterMessage                     | TextfieldData |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "Add user"    |


