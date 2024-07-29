Feature: Compliance Expert Audit Readiness Module

  Scenario Outline: Validate Audit Readiness Module
    When Validate the Sign In button functionality by entering valid,invalid credentials <EmailAddress> <Password> and  Verify the signIn status of Compliance Expert <Toaster>
    And Validate the card functionality <CompanyName>
    And  validate the signIn to company functionality <ToasterMessage>
    Given Validate Select year dropdown for audit readiness
    And validate sort icon of updated on and assessment name columns
    And validate the copy icon functionality <CopyAssessmentToaster> <NewName> <AssessmentName> <ErrorToaster>
    And Validate the download icon functionality <AssessmentName>
    And validate the delete icon functionality <DeletedFileToaster> <NewName>
    And validate the pagination
    And Verify progress bar <AssessmentName>
    And Verify current Sprs score
    And Validate the Card status <AssessmentName> <Cards>

    Examples:
      | Example                                      | EmailAddress                  | Password     | Toaster | CompanyName | ToasterMessage                     | AssessmentName | CopyAssessmentToaster            | NewName           | CopyAssessmentToaster            | ErrorToaster                                                              | DeletedFileToaster          | Cards                                                                                                                                               |
      | copy assessment                              | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "smpl test2"   | "Assessment Copied Successfully" | "Smpl Assessment" | "Assessment Copied Successfully" | "Assessment Name Already Exist Please Choose Another Assessment name !!!" | "File deleted successfully" | "Access Control,Physical Protection,Situational Awareness,Systems And Communications Protection,Identification And Authentication,Media Protection" |
      | copy an asessment by providing existing name | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "smplll"       | "Assessment Copied Successfully" | "smpl test2"           | "Assessment Copied Successfully" | "Assessment Name Already Exist Please Choose Another Assessment name !!!" | "File deleted successfully" | "Access Control,Physical Protection,Situational Awareness,Systems And Communications Protection,Identification And Authentication,Media Protection" |
