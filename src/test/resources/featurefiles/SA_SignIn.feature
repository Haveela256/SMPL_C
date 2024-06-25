Feature: Sign In page


  Scenario Outline: Login to the page

    Given Verify the Sign In page
    When Validate the <EmailAddress> text field using both valid and invalid email addresses and verify the <ErrorMessage>
    When Validate the <Password> text field functionality with valid and invalid passwords and verify the <ErrorMessage>
    And Validate the Eye icon functionality on the Password text field
    When Validate the Forget Password? hyperlink functionality
    When Validate the Sign In button functionality by entering valid,invalid credentials <EmailAddress> <Password> and  Verify the signIn status <Toaster>


    Examples:
      | EmailAddress         | Password   | ErrorMessage | Toaster | Example  |
      | "smplappc@gmail.com" | "Bond@009" | ""           | ""      | Positive |
      #| "smplappc@gmail.com" | "Bond@000" | ""                     | "Invalid login attempt." | Negative |
      #| "smpl"               | "Bond@009" | ""                     | " Email is Invalid " | Negative |
      #| ""                   | "Bond@009" | "Email is Required"    | ""      | Negative |
      #| "smplappc@gmail.com" | ""         | "Password is Required" | ""      | Negative |
