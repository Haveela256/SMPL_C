Feature: User Company details module


  Scenario Outline: Add company details
    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>
    When Validate the edit button
    And Verify the Company details





    Examples:
      | EmailAddress            | Password     | Toaster |
      | "smpl.user@yopmail.com" | "Vassar@123" | ""      |





