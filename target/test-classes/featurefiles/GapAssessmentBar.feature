Feature: Gap Assessment Module


  Scenario Outline: Validate Gap Assessment Module
    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>
    And click on Gap Assessment Module
    And verify progress bar <AssessmentName>
    And click on the <Bar> and verify Bar <Modules>
    And Answer Quiz <options> and Verify Quiz Output <Modules> <Implementation_Status> <POAM_Status>
    And Verify Progress Bar after quiz Submitted

    Examples:
      | EmailAddress               | Password     | Toaster | AssessmentName   | Bar                 | Modules        | options                              | Implementation_Status   | POAM_Status     |
      | "random3.test@yopmail.com" | "Vassar@123" | ""      | "new assessment" | "Access Control-24" | "AC.L1-3.1.1"  | "Yes,No,Not Sure,Not Applicable,Yes" | "Partially Implemented" | "Risk Accepted" |
      | "random3.test@yopmail.com" | "Vassar@123" | ""      | "new assessment" | "Access Control-24" | "AC.L1-3.1.2"  | "Yes,No,Not Sure,No,Yes"             | "Partially Implemented" | "Risk Accepted" |