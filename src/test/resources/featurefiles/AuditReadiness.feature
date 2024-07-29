Feature: Audit Readiness Module

  Scenario Outline: Validate Audit Readiness Module
    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>
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
      | Example                                      | EmailAddress               | Password     | Toaster | AssessmentName | CopyAssessmentToaster            | NewName          | CopyAssessmentToaster            | ErrorToaster                                                              | DeletedFileToaster          | Cards                                                                                                                                                                                                                                                                                                            |
      | copy assessment                              | "random3.test@yopmail.com" | "Vassar@123" | ""      | "smpl"         | "Assessment Copied Successfully" | "smplAssessment" | "Assessment Copied Successfully" | "Assessment Name Already Exist Please Choose Another Assessment name !!!" | "File deleted successfully" | "Access Control,Audit And Accountability,Awareness And Training,Configuration Management,Maintenance,Personnel Security,Physical Protection,Risk Mangement,Security Assessment,Situational Awareness,Systems And Communications Protection,Incident Response,Identification And Authentication,Media Protection" |
      | copy an asessment by providing existing name | "random3.test@yopmail.com" | "Vassar@123" | ""      | "test3"        | "Assessment Copied Successfully" | "smpl"   | "Assessment Copied Successfully" | "Assessment Name Already Exist Please Choose Another Assessment name !!!" | "File deleted successfully" | "Access Control,Audit And Accountability,Awareness And Training,Configuration Management,Maintenance,Personnel Security,Physical Protection,Risk Mangement,Security Assessment,Situational Awareness,Systems And Communications Protection,Incident Response,Identification And Authentication,Media Protection" |


