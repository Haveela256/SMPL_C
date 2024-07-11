Feature: Change Password

  Scenario Outline: Change the password of the account

    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>
    And Click on the Change Password option
    And Validate the Old Password text field by entering valid and invalid data <OldPassword>
    And  Validate the New Password text field with valid Password and Invalid password <NewPassword>
    And Validate the Confirm Password text field by entering valid and invalid data <ConfirmPassword>
    And Validate the Reset Password button functionality <OldPassword> <NewPassword> <ConfirmPassword>
    And verify errors messages <OldPasswordError> <PasswordCharacterError> <PasswordUppercaseError> <PasswordsError> <NewPasswordError> <ConfirmPasswordError> <ErrorToaster>
    Then Validate the Back hyperlink functionality
    Examples:
      | EmailAddress            | Password     | Toaster | OldPassword  | NewPassword   | ConfirmPassword | OldPasswordError            | PasswordCharacterError                          | PasswordUppercaseError                                  | PasswordsError           | NewPasswordError           | ConfirmPasswordError           | ErrorToaster                                             |
      | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "Vassar@123" | "Vassar@123"  | "Vassar@123"    | "Old Password is required." | "Password must be atleast of 8 characters long" | "Password must contain atleast one Uppercase character" | "Password doesn't match" | "New Password is required" | "Confirm Password is required" | "New password can not be same as your current password!" |
      | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "Vassar@123" | "15234"       | "Vassar@123"    | "Old Password is required." | "Password must be atleast of 8 characters long" | "Password must contain atleast one Uppercase character" | "Password doesn't match" | "New Password is required" | "Confirm Password is required" | ""                                                       |
      | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "Vassar@123" | "12345678"    | "Vassar@123"    | "Old Password is required." | ""                                              | "Password must contain atleast one Uppercase character" | "Password doesn't match" | "New Password is required" | "Confirm Password is required" | ""                                                       |
      | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | ""           | "Vassar@123"  | "Vassar@343"    | "Old Password is required." | ""                                              | ""                                                      | "Password doesn't match" | "New Password is required" | "Confirm Password is required" | ""                                                       |
      | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "Vassar@123" | ""            | "Vassar@123"    | ""                          | ""                                              | ""                                                      | ""                       | "New Password is required" | "Confirm Password is required" | ""                                                       |
      | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | ""           | "Vassar@123"  | ""              | "Old Password is required." | ""                                              | ""                                                      | ""                       | ""                         | ""                             | ""                                                       |
      | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "Vassar@123" | "Vassar@1234" | ""              | ""                          | ""                                              | ""                                                      | ""                       | ""                         | "Confirm Password is required" | ""                                                       |





