Feature: User Audit Readiness Module


  Scenario Outline: Validate Audit Readiness Module
    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>
    Given Validate Select year dropdown for audit readiness
    And validate sort icon of updated on and assessment name columns
    And Validate the download icon functionality <AssessmentName>
    And validate the pagination
    And Verify progress bar <AssessmentName>
    And Verify current Sprs score
    And Validate the Card status <AssessmentName> <Cards>





    Examples:
      | EmailAddress            | Password     | Toaster | AssessmentName | Cards                                                                                                                                               |
      | "smpl.user@yopmail.com" | "Vassar@123" | ""      | "security8"    | "Access Control,Physical Protection,Situational Awareness,Systems And Communications Protection,Identification And Authentication,Media Protection" |
      | "smpl.user@yopmail.com" | "Vassar@123" | ""      | "smplll"       | "Access Control,Physical Protection,Situational Awareness,Systems And Communications Protection,Identification And Authentication,Media Protection" |
