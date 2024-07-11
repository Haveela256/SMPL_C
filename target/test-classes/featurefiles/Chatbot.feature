Feature: Chatbot

  Scenario Outline: Validate chatbot functionality
    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>
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
      | EmailAddress            | Password     | Toaster | TextfieldData |
      | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "Add user"       |
