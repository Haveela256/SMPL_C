Feature: Forget Password Page of Compliance Expert

  Scenario Outline: Enter valid and Invalid Passwords

    And Validate Submit button functionality by entering valid and invalid <Email> <ErrorMessage> <Toaster>
    Then Validate Back hyperlink functionality




    Examples:
      | Email                        | ErrorMessage        | Toaster                                    |
      | "smpl.compliance@yopmail.com" | ""                  | ""                                         |
      | "agdbfj@yopmail.com"         | ""                  | " Email-Id does not exist in the system! " |
      | "1234"                       | "Email is invalid"  | ""                                         |
      | ""                           | "Email is required" | ""                                         |

