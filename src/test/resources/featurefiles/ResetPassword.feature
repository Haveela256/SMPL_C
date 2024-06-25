Feature: Reset Password Page

  Scenario Outline: Enter valid and invalid passwords
    And Validate Submit button functionality by entering valid and invalid <Email> <Toaster> <ErrorMessage>
    And validate the submit button functionality by entering valid and invalid OTP <OTPOne> <OTPTwo> <OTPThree> <OTPFour> <NewPassword> <ConfirmPassword> <ErrorMessage> <ErrorToaster>





    Examples:
      | Email                 | ErrorMessage | Toaster | OTPOne | OTPTwo | OTPThree | OTPFour | NewPassword  | ConfirmPassword | ErrorMessage | ErrorToaster               |
      | vassar.qa@yopmail.com | ""           | ""      | "1"    | 3      | "4"      | "5"     | "Vassar@123" | "Vassar@123"    | ""           | "OTP is wrong or Expired!" |
      #| "vassar.qa@yopmail.com" | ""           | ""      | "1"    | "2"    | "3"      | "4"     | "123456"     | ""              | "Password must be atleast of 8 characters long"         | ""                         |
     # | "vassar.qa@yopmail.com" | ""           | ""      | "1"    | "2"    | "3"      | "4"     | "12345678"   |                 | "Password must contain atleast one Uppercase character" | ""                         |
      #| "vassar.qa@yopmail.com" | ""           | ""      | "1"    | "2"    | "3"      | "4"     | "Vassar@123" | "Vassar@343"    | "Passwords doesn't match" | ""                         |
    #  | "vassar.qa@yopmail.com" | ""           | ""      | "1"    | "2"    | "3"      | "4"     | "Vassar@123" | "Vassar@123"    | ""           | ""                         |

















