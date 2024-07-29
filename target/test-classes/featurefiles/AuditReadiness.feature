Feature: Audit Readiness Module

  Scenario Outline: Validate Gap Assessment Module
    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>
    Given Validate Select year dropdown for audit readiness
    And validate sort icon of updated on and assessment name columns
    And Validate the copy icon functionality <CopyAssessmentToaster> <NewName> <AssessmentName> <ErrorToaster>
    And Validate the download icon functionality <RenameSuccessfulToaster> <RenameAssessment> <AssessmentName> <ErrorToaster>
    And validate the delete icon functionality <DeletedFileToaster> <AssessmentName>
    And validate the pagination
    And verify progress bar <AssessmentName>
    And verify current Sprs score <AssessmentName>
    And verify the bar chart <AssessmentName>



    Examples:
      | Example                                        | EmailAddress            | Password     | Toaster | AssessmentName       | CopyAssessmentToaster             | NewName              | RenameAssessment | CopyAssessmentToaster | ErrorToaster                                                              | RenameSuccessfulToaster             | DeletedFileToaster          |
      | copy assessment                                | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "New QA assessment1" | " Assessment Copied Successfully" | "CopiedAssessMent"   | "NewAssessment1" | ""                    | ""                                                                        | "Assessment Renamed Successfully"   | "File deleted successfully" |
      | rename assessment                              | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "New QA assessment2" | ""                                | ""                   | "NewAssessment2" | ""                    | ""                                                                        | " Assessment Renamed Successfully " | ""                          |
      | copy an asessment by providing existing name   | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "New QA assessment3" | ""                                | "New QA assessment3" | "NewAssessment3" | ""                    | "Assessment Name Already Exist Please Choose Another Assessment name !!!" | "Assessment Renamed Successfully"   | ""                          |
      | rename an asessment by providing existing name | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "New QA assessment4" | ""                                | ""                   | "NewAssessment4" | ""                    | "Assessment Name Already Exist Please Choose Another Assessment name !!!" | "Assessment Renamed Successfully"   | ""                          |


