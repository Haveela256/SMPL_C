Feature: Reset Password Page

  Scenario Outline: Enter valid and invalid passwords
    And Validate Submit button functionality by entering valid and invalid <Email> <ErrorMessage> <Toaster>
    And validate the submit button functionality by entering valid and invalid OTP <OTPOne> <OTPTwo> <OTPThree> <OTPFour> <NewPassword> <ConfirmPassword>
    And verify error messages <PasswordCharacterError> <PasswordUppercaseError> <PasswordsError> <NewPasswordError> <ConfirmPasswordError> <ErrorToaster>





    Examples:
      | Email                   | ErrorMessage | Toaster | OTPOne | OTPTwo | OTPThree | OTPFour | NewPassword  | ConfirmPassword | PasswordCharacterError                          | PasswordUppercaseError                                  | PasswordsError            | NewPasswordError           | ConfirmPasswordError           | ErrorToaster               |
      | "smpl.user@yopmail.com" | ""           | ""      | "1"    | "3"    | "4"      | "5"     | "Vassar@123" | "Vassar@123"    | "Password must be atleast of 8 characters long" | "Password must contain atleast one Uppercase character" | "Passwords doesn't match" | "New Password is required" | "Confirm Password is required" | "OTP is wrong or Expired!" |
      | "smpl.user@yopmail.com" | ""           | ""      | "1"    | "2"    | "3"      | "4"     | "15234"      | "Vassar@123"    | "Password must be atleast of 8 characters long" | "Password must contain atleast one Uppercase character" | "Passwords doesn't match" | "New Password is required" | "Confirm Password is required" | ""                         |
      | "smpl.user@yopmail.com" | ""           | ""      | "1"    | "2"    | "3"      | "4"     | "12345678"   | "Vassar@123"    | "Password must be atleast of 8 characters long" | "Password must contain atleast one Uppercase character" | "Passwords doesn't match" | "New Password is required" | "Confirm Password is required" | ""                         |
      | "smpl.user@yopmail.com" | ""           | ""      | "1"    | "2"    | "3"      | "4"     | "Vassar@123" | "Vassar@343"    | "Password must be atleast of 8 characters long" | "Password must contain atleast one Uppercase character" | "Passwords doesn't match" | "New Password is required" | "Confirm Password is required" | ""                         |
      | "smpl.user@yopmail.com" | ""           | ""      | "1"    | "2"    | "3"      | "4"     | "Vassar@123" | "Vassar@123"    | "Password must be atleast of 8 characters long" | "Password must contain atleast one Uppercase character" | "Passwords doesn't match" | "New Password is required" | "Confirm Password is required" | ""                         |
      | "smpl.user@yopmail.com" | ""           | ""      | "1"    | "2"    | "3"      | "4"     | ""           | "Vassar@123"    | "Password must be atleast of 8 characters long" | "Password must contain atleast one Uppercase character" | "Passwords doesn't match" | "New Password is required" | "Confirm Password is required" | ""                         |

















