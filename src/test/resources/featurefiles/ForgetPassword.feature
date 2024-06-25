Feature: Forget Password Page

  Scenario Outline: Enter valid and Invalid Passwords

    And Validate Submit button functionality by entering valid and invalid <Email> <Toaster> <ErrorMessage>
    Then Validate Back hyperlink functionality




    Examples:
      | Email                   | ErrorMessage | Toaster |
      | "Vassar.qa@yopmail.com" | ""           | ""      |
    #| "agdbfj@yopmail.com"    | ""           | " Email-Id does not exist in the system! " |
      #| "1234"                  | ""           | "Email is invalid"  |
    #  | ""                      | ""           | "Email is required" |

