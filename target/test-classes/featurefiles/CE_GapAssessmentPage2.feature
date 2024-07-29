Feature: Gap Assessment quiz of Compliance Expert


  Scenario Outline: Validate Gap Assessment quiz
    When Validate the Sign In button functionality by entering valid,invalid credentials <EmailAddress> <Password> and  Verify the signIn status of Compliance Expert <Toaster>
    And Validate the card functionality <CompanyName>
    And  validate the signIn to company functionality <ToasterMessage>
    And click on Gap Assessment Module
    And verify progress bar <AssessmentName>
    And click on the <Bar> and verify Bar <Modules>
    And Answer Quiz <options> and Verify Quiz Output <Modules> <Implementation_Status> <POAM_Status>
    And Verify Progress Bar after quiz Submitted

    Examples:
      | EmailAddress                  | Password     | Toaster | CompanyName | ToasterMessage                     | AssessmentName   | Bar                 | Modules       | options                              | Implementation_Status   | POAM_Status     |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "New Assessment" | "Access Control-24" | "AC.L1-3.1.1" | "Yes,No,Not Sure,Not Applicable,Yes" | "Partially Implemented" | "Risk Accepted" |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "New Assessment"        | "Access Control-24" | "AC.L1-3.1.2" | "Yes,No,Not Sure,No,Yes"             | "Partially Implemented" | "Risk Accepted" |


