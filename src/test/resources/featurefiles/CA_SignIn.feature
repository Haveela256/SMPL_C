Feature: Sign In page


  Scenario Outline: Login to the page

    Given Verify the Sign In page
    When Validate the <EmailAddress> text field using both valid and invalid email addresses and verify the <ErrorMessage>
    When Validate the <Password> text field functionality with valid and invalid passwords and verify the <ErrorMessage>
    And Validate the Eye icon functionality on the Password text field
    When Validate the Forget Password? hyperlink functionality
    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>

    Examples:
      | EmailAddress            | Password     | ErrorMessage           | Toaster                  | Example  |
      | "Vassar.qa@yopmail.com" | "Vassar@123" | ""                     | ""                       | Positive |
      | "Vassar.qa@yopmail.com" | "Vassar123"  | ""                     | "Invalid login attempt." | Negative |
      | "Vassar"                | "Vassar@123" | ""                     | " Email is Invalid "     | Negative |
      | ""                      | "Vassar@123" | "Email is Required"    | ""                       | Negative |
      | "Vassar.qa@yopmail.com" | ""           | "Password is Required" | ""                       | Negative |
