Feature: Change Password

  Scenario Outline: Change the password of the account

    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>
    And Click on the Change Password option
    And Validate the Old Password text field by entering valid and invalid data <OldPassword> <ErrorMessage>
    And  Validate the New Password text field with valid Password and Invalid password <NewPassword> <ErrorMessage>
    And Validate the Confirm Password text field by entering valid and invalid data <ConfirmPassword> <ErrorMessage>
    And Validate the Reset Password button functionality <OldPassword> <NewPassword> <ConfirmPassword> <ErrorMessage> <ErrorToaster>
    Then Validate the Back hyperlink functionality
    Examples:
      | EmailAddress            | Password     | Toaster | OldPassword  | NewPassword   | ConfirmPassword | ErrorToaster                     | ErrorMessage                                            |
      | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "Vassar@123" | "Vassar@1234" | "Vassar@123"    | ""                               | ""                                                      |
      | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "Vassar@123" | "123456789"   | "Vassar@123"    | ""                               | ""                                                      |
      | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "Vassar@123" | "123456789"   | ""              | ""                               | "Password must contain atleast one Uppercase character" |
      | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "Vassar@123" | "Vass"        | ""              | ""                               | "Password must be atleast of 8 characters long"         |
      | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "Vass"       | "Vassar@1234" | "Vassar@123"    | ""                               | "Password doesn’t match"                                |
      | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "Vass"       | "Vassar@1234" | "Vassar@123"    | " Old Password is not correct! " | ""                                                      |
      | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | ""           | "Vassar@1234" | "Vassar@123"    | ""                               | "Old Password is required."                             |
      | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "Vass"       | ""            | "Vassar@123"    | ""                               | "New Password is required"                              |
      | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "Vass"       | "Vassar@1234" | ""              | ""                               | "Confirm Password is required"                          |




