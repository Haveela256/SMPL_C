Feature: Two Factor Authentication

  Scenario Outline: Enter valid and invalid OTP

    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>
    And Validate the Submit button functionality by entering valid and invalid OTP <OTPOne> <OTPTwo> <OTPThree> <OTPFour> <ToasterMessage> <ResendCodeToaster>
    Then Validate the Resend code hyperlink and verify the <ResendCodeToaster>



    Examples:
      | EmailAddress | Password | OTPOne | OTPTwo | OTPThree | OTPFour | ToasterMessage | ResendCodeToaster |
      | "Vassar.qa@yopmail.com" | "Vassar@123" | "1"    | "2"    | "3"      | "4"     | ""             | ""                       |
      #| "Vassar.qa@yopmail.com" | "Vassar@123" | "2"    | "3"    | "4"      | "5"     | ""             | ""                       |
      #| "Vassar.qa@yopmail.com" | "Vassar@123" | "1"    | "2"    | "6"      | "7"     | "OTP is invalid or expired!"             | ""                       |
      #| "Vassar.qa@yopmail.com" | "Vassar@123" | ""     | ""     | ""       | ""      | ""             | "OTP has been resend!" |






