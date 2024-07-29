Feature: Audit Readiness Module

  Scenario Outline: Validate Gap Assessment Module
    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>
    Given Validate Select year dropdown for audit readiness
    And validate sort icon of updated on and assessment name columns
<<<<<<< HEAD
    And validate the copy icon functionality <CopyAssessmentToaster> <NewName> <AssessmentName> <ErrorToaster>
    And Validate the download icon functionality <AssessmentName>
    And validate the delete icon functionality <DeletedFileToaster> <NewName>
    And validate the pagination
    And Verify progress bar <AssessmentName>
    And Verify current Sprs score
    And Validate the Card status <AssessmentName> <Cards>
=======
    And Validate the copy icon functionality <CopyAssessmentToaster> <NewName> <AssessmentName> <ErrorToaster>
    And Validate the download icon functionality <RenameSuccessfulToaster> <RenameAssessment> <AssessmentName> <ErrorToaster>
    And validate the delete icon functionality <DeletedFileToaster> <AssessmentName>
    And validate the pagination
    And verify progress bar <AssessmentName>
    And verify current Sprs score <AssessmentName>
    And verify the bar chart <AssessmentName>
>>>>>>> 1a2da184a64955571b42de9b8c873355143fd19a



    Examples:
<<<<<<< HEAD
      | Example                                      | EmailAddress               | Password     | Toaster | AssessmentName | CopyAssessmentToaster            | NewName          | CopyAssessmentToaster            | ErrorToaster                                                              | DeletedFileToaster          | Cards                                                                                                                                                                                                                                                                                                            |
      | copy assessment                              | "random3.test@yopmail.com" | "Vassar@123" | ""      | "smpl"         | "Assessment Copied Successfully" | "smplAssessment" | "Assessment Copied Successfully" | "Assessment Name Already Exist Please Choose Another Assessment name !!!" | "File deleted successfully" | "Access Control,Audit And Accountability,Awareness And Training,Configuration Management,Maintenance,Personnel Security,Physical Protection,Risk Mangement,Security Assessment,Situational Awareness,Systems And Communications Protection,Incident Response,Identification And Authentication,Media Protection" |
      | copy an asessment by providing existing name | "random3.test@yopmail.com" | "Vassar@123" | ""      | "test3"        | "Assessment Copied Successfully" | "smpl"   | "Assessment Copied Successfully" | "Assessment Name Already Exist Please Choose Another Assessment name !!!" | "File deleted successfully" | "Access Control,Audit And Accountability,Awareness And Training,Configuration Management,Maintenance,Personnel Security,Physical Protection,Risk Mangement,Security Assessment,Situational Awareness,Systems And Communications Protection,Incident Response,Identification And Authentication,Media Protection" |
=======
      | Example                                        | EmailAddress            | Password     | Toaster | AssessmentName       | CopyAssessmentToaster             | NewName              | RenameAssessment | CopyAssessmentToaster | ErrorToaster                                                              | RenameSuccessfulToaster             | DeletedFileToaster          |
      | copy assessment                                | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "New QA assessment1" | " Assessment Copied Successfully" | "CopiedAssessMent"   | "NewAssessment1" | ""                    | ""                                                                        | "Assessment Renamed Successfully"   | "File deleted successfully" |
      | rename assessment                              | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "New QA assessment2" | ""                                | ""                   | "NewAssessment2" | ""                    | ""                                                                        | " Assessment Renamed Successfully " | ""                          |
      | copy an asessment by providing existing name   | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "New QA assessment3" | ""                                | "New QA assessment3" | "NewAssessment3" | ""                    | "Assessment Name Already Exist Please Choose Another Assessment name !!!" | "Assessment Renamed Successfully"   | ""                          |
      | rename an asessment by providing existing name | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "New QA assessment4" | ""                                | ""                   | "NewAssessment4" | ""                    | "Assessment Name Already Exist Please Choose Another Assessment name !!!" | "Assessment Renamed Successfully"   | ""                          |
>>>>>>> 1a2da184a64955571b42de9b8c873355143fd19a


